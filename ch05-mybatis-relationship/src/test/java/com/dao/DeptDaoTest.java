package com.dao;

import com.entity.Dept;
import com.util.MapperFactory;
import org.junit.Test;

public class DeptDaoTest {

    @Test
    public void testGetDeptById(){
        DeptDao dao = MapperFactory.generateMapper(DeptDao.class);
        Dept dept = dao.getDeptById(3);
        System.out.println(dept);
    }

}