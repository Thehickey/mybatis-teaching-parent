package com.dao;

import com.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    Employee getEmpById(int id);

    List<Employee> getEmpsByUsername(String name);

    List<Employee> getEmpsByUsername2(Employee emp);

    List<Employee> getEmpsByUsername3(String username,int id );
}
