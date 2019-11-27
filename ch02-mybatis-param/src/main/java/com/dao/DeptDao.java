package com.dao;

import com.entity.Dept;
import com.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface DeptDao {
    int insert(Employee employee);

    Employee getById(int id);

    Employee getBySalaryAndGender(BigDecimal salary, int gender);

    Employee getBySalaryAndGender2(@Param("salary") BigDecimal salary, @Param("gender") int gender);

    List<Employee> getAllByCondition(Map<String, Object> conditions);

}
