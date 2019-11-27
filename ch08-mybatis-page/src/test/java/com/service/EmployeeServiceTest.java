package com.service;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.util.MapperFactory;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EmployeeServiceTest {

    @Test
    public void testGetEmpsByCustom() {
        EmployeeService service = new EmployeeService();
        List<Employee> employees = service.getEmpsByCustom(1,2);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    @Test
    public void testGetCount(){
        EmployeeService service = new EmployeeService();
        int count = service.getEmpsCount();
        System.out.println(count);
    }

    @Test
    public void getEmpsByRowBounds() {

        EmployeeDao dao = MapperFactory.generateMapper(EmployeeDao.class);

        RowBounds rowBounds = new RowBounds(0, 4);
        List<Employee> employees = dao.getEmpsByRowBounds(rowBounds);
        for (Employee employee : employees) {
            System.out.println("-----debug: employee = " + employee);
        }
    }



    @Test
    public void getEmpsByPageHelper() {

        EmployeeDao dao = MapperFactory.generateMapper(EmployeeDao.class);
        int pageNum = 2;
        int pageSize = 3;
        List<Employee> employees = dao.getEmpsByPageHelper(pageNum,pageSize);
        for (Employee employee : employees) {
            System.out.println("-----debug: employee = " + employee);
        }
    }

    @Test
    public void getEmpsByPageHelper2() {

        EmployeeDao dao = MapperFactory.generateMapper(EmployeeDao.class);

        int pageNum = 2;
        int pageSize = 3;
        Page<Employee> employees = (Page<Employee>) dao.getEmpsByPageHelper(pageNum,pageSize);
        PageInfo<Employee> pageInfo = new PageInfo<>(employees,3);

        for (Employee employee : employees) {
            System.out.println("-----debug: employee = " + employee);
        }
    }
}