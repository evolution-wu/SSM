import com.atiguigu.mapper.CacheMapper;
import com.atiguigu.pojo.Emp;
import com.atiguigu.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class CacheMapperTest {
    @Test
    public void testGetEmpById(){
        //sqlsession为一级缓存
        /*使一级缓存失效的四种情况：
        1) 不同的SqlSession对应不同的一级缓存
        2) 同一个SqlSession但是查询条件不同
        3) 同一个SqlSession两次查询期间执行了任何一次增删改操作
        4) 同一个SqlSession两次查询期间手动清空了缓存*/
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp1 = mapper.getEmpById(1);
        System.out.println(emp1);
        Emp emp2 = mapper.getEmpById(1);
        System.out.println(emp2);
    }

    @Test
    public void testCache() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取sqlsessionfactorybulider对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //获取sqlsessionfactory对象

        //获取sqlsession对象
        SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp empById1 = mapper1.getEmpById(1);
        System.out.println(empById1);
        sqlSession1.close();
        //获取sqlsession对象
        SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp empById2 = mapper2.getEmpById(1);
        System.out.println(empById2);
        sqlSession2.close();
    }
}
