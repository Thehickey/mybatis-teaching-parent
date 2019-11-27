package com.dao;

import com.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface EmployeeDao {
    List<Employee> getEmpsBySalaryAndGender(@Param("s")BigDecimal salary,@Param("gender")Integer gender);

    /**
     * foreach 常用的三种情况
     * 1.in查询  in(1,2,3)
     * 2. 批量删除 delete  where id = 1 or id = 2 or id =3
     * 3.批量增加 insert into values(1,2),(3,4)
     * @param salary
     * @param gender
     * @return
     */

    List<Employee> getEmpsByDepts(List<Integer> depts);

    List<Employee> getEmpsByDeptsMap(@Param("map") Map<String,Integer> depts);

    void update(Employee employee);

    void batchDelete(List<Integer> ids);

    void batchInsert(List<Employee> employeeList);
}
