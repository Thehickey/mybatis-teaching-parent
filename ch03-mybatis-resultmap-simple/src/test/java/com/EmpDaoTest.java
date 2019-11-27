package com;

import com.dao.EmpDao;
import com.entity.Employee;
import com.util.MapperFactory;
import org.junit.Test;

import java.util.List;

public class EmpDaoTest {

    @Test
    public void getAll(){
        EmpDao empDao = MapperFactory.generateMapper(EmpDao.class);
        List<Employee> employees = empDao.getAll();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
