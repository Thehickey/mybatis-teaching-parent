package com.dao;

import com.entity.Employee;
import com.util.MapperFactory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EmployeeDaoTest {

    @Test
    public void testGetEmpsByCustom() {
        EmployeeDao employeeDao = MapperFactory.generateMapper(EmployeeDao.class);
        int pageNum = 2;
        int pageSize = 3;
        int offset = (pageNum-1)*pageSize;
        List<Employee> employeeList = employeeDao.getEmpsByCustom(offset,pageSize);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}