package com.atiguigu.mapper;

import com.atiguigu.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
   Emp getEmpById(@Param("empid") Integer empId);
   Emp getEpAndDeptEmpId(@Param("empid") Integer empId);
   /**
    * 通过分步查询查询员工信息
    * @param
    * @return
    */
   Emp getEmpByStepOne(@Param("empid") int empId);

  List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") int deptId);
}
