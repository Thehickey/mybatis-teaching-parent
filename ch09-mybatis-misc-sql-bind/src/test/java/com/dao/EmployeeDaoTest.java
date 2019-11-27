package com.dao;

import com.entity.Employee;
import com.util.MapperFactory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EmployeeDaoTest {

    @Test
    public void getEmpById() {

        EmployeeDao dao = MapperFactory.generateMapper(EmployeeDao.class);
        Employee emp = dao.getEmpById(1);
        System.out.println("-----debug: emp = " + emp);
    }

    @Test
    public void getEmpsByUsername() {

        EmployeeDao dao = MapperFactory.generateMapper(EmployeeDao.class);
        List<Employee> emps = dao.getEmpsByUsername("生");
        for (Employee emp : emps) {
            System.out.println("-----debug: emp = " + emp);
        }

    }
    
    @Test
    public void getEmpsByUsername2() {

        EmployeeDao dao = MapperFactory.generateMapper(EmployeeDao.class);
        Employee employee = new Employee();
        employee.setUsername("生");

        List<Employee> emps = dao.getEmpsByUsername2(employee);
        for (Employee emp : emps) {
            System.out.println("-----debug: emp = " + emp);
        }

    }


    @Test
    public void getEmpsByUsername3() {

        EmployeeDao dao = MapperFactory.generateMapper(EmployeeDao.class);


        List<Employee> emps = dao.getEmpsByUsername3("生",1);
        for (Employee emp : emps) {
            System.out.println("-----debug: emp = " + emp);
        }

    }
}