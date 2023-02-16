import com.atiguigu.mapper.DeptMapper;
import com.atiguigu.mapper.EmpMapper;
import com.atiguigu.pojo.Dept;
import com.atiguigu.pojo.Emp;
import com.atiguigu.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Map;

public class TestEmpMap {
    @Test
    public void testGetEmpById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empById = mapper.getEpAndDeptEmpId(2);
        System.out.println(empById);
    }

    @Test
    public void testGetEmpByStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empById = mapper.getEmpByStepOne(1);
        System.out.println(empById);
    }

    @Test
    public void testDeptAndEmpByDeptId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByDeptId = mapper.getDeptAndEmpByDeptId(2);
        System.out.println(deptAndEmpByDeptId);
    }

    @Test
    public void testgetDeptAndEmpResultMapStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptByStepOne = mapper.getDeptByStepOne(1);
        System.out.println(deptByStepOne);

    }
}
