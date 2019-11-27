package com.service;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.util.MapperFactory;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public class EmployeeService {
    private EmployeeDao employeeDao = MapperFactory.generateMapper(EmployeeDao.class);

    public List<Employee> getEmpsByCustom(int pageNum,int pageSize){
        int offset = (pageNum-1)*pageSize;
        return employeeDao.getEmpsByCustom(offset,pageSize);
    }

    public int getEmpsCount(){
        return employeeDao.getEmpsCount();
    }

    public List<Employee> getEmpsByRowBounds(RowBounds rowBounds){
        return employeeDao.getEmpsByRowBounds(rowBounds);
    }


    public List<Employee> getEmpsByPageHelper(int pageNum,int pageSize){
        return employeeDao.getEmpsByPageHelper(pageNum, pageSize);
    }
}
