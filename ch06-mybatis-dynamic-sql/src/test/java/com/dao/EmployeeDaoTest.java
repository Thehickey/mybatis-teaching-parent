package com.dao;

import com.entity.Employee;
import com.util.MapperFactory;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class EmployeeDaoTest {

    @Test
    public void testGetEmpsBySalaryAndGender(){
        EmployeeDao dao = MapperFactory.generateMapper(EmployeeDao.class);

        List<Employee> employeeList = dao.getEmpsBySalaryAndGender(new BigDecimal(1000),0);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Test
    public void testGetEmpsBySalaryAndGender2(){
        EmployeeDao dao = MapperFactory.generateMapper(EmployeeDao.class);

        List<Employee> employeeList = dao.getEmpsBySalaryAndGender(null,null);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Test
    public void testGetEmpsBySalaryAndGender3(){
        EmployeeDao dao = MapperFactory.generateMapper(EmployeeDao.class);

        List<Employee> employeeList = dao.getEmpsBySalaryAndGender(null,0);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Test
    public void testGetEmpsBySalaryAndGender4(){
        EmployeeDao dao = MapperFactory.generateMapper(EmployeeDao.class);

        List<Employee> employeeList = dao.getEmpsBySalaryAndGender(new BigDecimal(1000),null);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Test
    public void testGetEmpsByDepts(){
        EmployeeDao dao = MapperFactory.generateMapper(EmployeeDao.class);
        List<Integer> deptids = new ArrayList<>();
        deptids.add(2);
        List<Employee> employeeList = dao.getEmpsByDepts(deptids);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Test
    public void testGetEmpsByDeptsMap(){
        EmployeeDao dao = MapperFactory.generateMapper(EmployeeDao.class);
        Map<String,Integer> deptids = new HashMap<>();
        deptids.put("a",2);
        List<Employee> employeeList = dao.getEmpsByDeptsMap(deptids);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Test
    public void testUpdate() {
        EmployeeDao employeeDao = MapperFactory.generateMapper(EmployeeDao.class);

        Employee employee = new Employee(BigDecimal.valueOf(3333), "mybatis9");
        employeeDao.update(employee);
    }

    @Test
    public void testBatchDelete() {
        EmployeeDao employeeDao = MapperFactory.generateMapper(EmployeeDao.class);
        List<Integer> ids = new ArrayList<>();
        ids.add(21);
        ids.add(22);
        employeeDao.batchDelete(ids);
    }

    @Test
    public void testBatchInsert() {
        EmployeeDao employeeDao = MapperFactory.generateMapper(EmployeeDao.class);
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee(BigDecimal.valueOf(666),0,"测试1",3);
        Employee employee2 = new Employee(BigDecimal.valueOf(777),1,"测试2",3);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeDao.batchInsert(employeeList);
    }

}