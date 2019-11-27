package com.dao;

import com.entity.Dept;
import com.util.MapperFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DeptDaoTest {

    @Test
    public void testInsertSimple(){
        DeptDao deptDao = MapperFactory.generateMapper(DeptDao.class);
        List<Dept> depts = new ArrayList<>();
        Dept dept = new Dept("aaa");
        depts.add(dept);
        deptDao.insertSimple(depts);
    }

    @Test
    public void testDeleteSimple(){
        DeptDao deptDao = MapperFactory.generateMapper(DeptDao.class);
        List<Integer> ids = new ArrayList<>();
        ids.add(4);
        ids.add(5);
        deptDao.deleteSimple(ids);
    }

    @Test
    public void testUpdateSimple(){
        DeptDao deptDao = MapperFactory.generateMapper(DeptDao.class);
        List<Dept> depts = new ArrayList<>();
        Dept dept1 = new Dept(6,"ccc");
        Dept dept2 = new Dept(7,"ccc");
        depts.add(dept1);
        depts.add(dept2);
        deptDao.updateSimple(depts);
    }

}