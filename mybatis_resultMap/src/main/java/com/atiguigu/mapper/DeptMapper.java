package com.atiguigu.mapper;

import com.atiguigu.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getgetEmpDeptByStepTwo(@Param("deptId") int deptId);

    Dept getDeptAndEmpByDeptId(@Param("deptId") int deptId);

    Dept getDeptByStepOne(@Param("deptId") int deptId);
}
