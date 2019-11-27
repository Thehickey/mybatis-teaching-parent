package com.dao;

import com.entity.Employee;
import com.util.MapperFactory2;
import com.util.MapperFactory;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeptDaoTest {

    @Test
    public void insert() {
        Employee employee = new Employee(BigDecimal.valueOf(1000), 1, "mybatis2", 1);
        DeptDao deptDao = MapperFactory2.generateMapper(DeptDao.class);
        deptDao.insert(employee);
    }

    @Test
    public void testGetById() {
        DeptDao deptDao = MapperFactory.generateMapper(DeptDao.class);
        Employee employee = deptDao.getById(1);
        System.out.println(employee);
    }

    @Test
    public void testgetBySalaryAndGender() {
        DeptDao deptDao = MapperFactory.generateMapper(DeptDao.class);
        Employee employee = deptDao.getBySalaryAndGender(BigDecimal.valueOf(5000), 0);
        System.out.println(employee);
    }

    @Test
    public void testgetBySalaryAndGender2() {
        DeptDao deptDao = MapperFactory.generateMapper(DeptDao.class);
        Employee employee = deptDao.getBySalaryAndGender2(BigDecimal.valueOf(5000), 0);
        System.out.println(employee);
    }

    @Test
    public void getAllByCondition() {
        DeptDao deptDao = MapperFactory.generateMapper(DeptDao.class);
        Map<String,Object> map = new HashMap<>();
        map.put("salary",1000);
        map.put("gender",0);
        map.put("sortName","gender");
        map.put("sortType","desc");
        List<Employee> employees = deptDao.getAllByCondition(map);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
