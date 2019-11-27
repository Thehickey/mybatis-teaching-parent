package com;

import com.entity.Dept;
import com.util.SqlSessionHelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DeptDaoTest {

    @Test
    public void testGetById(){
        try(SqlSession session = SqlSessionHelper.getSqlSession()){
            DeptDao daoImpl = session.getMapper(DeptDao.class);
            Dept dept = daoImpl.getById();
            System.out.println(dept);
        }
    }

    @Test
    public void testGetAll(){
        try(SqlSession session = SqlSessionHelper.getSqlSession()){
            DeptDao daoImpl = session.getMapper(DeptDao.class);
            List<Dept> depts = daoImpl.getAll();
            for (Dept dept : depts) {
                System.out.println(dept);
            }
        }
    }

    @Test
    public void testInsert(){
        try(SqlSession session = SqlSessionHelper.getSqlSession()){
            DeptDao daoImpl = session.getMapper(DeptDao.class);
            int count = daoImpl.insert();
            String bool = count>0?"成功":"失败";
            System.out.println(bool);
        }
    }

    @Test
    public void testUpdate(){
        try(SqlSession session = SqlSessionHelper.getSqlSession()){
            DeptDao daoImpl = session.getMapper(DeptDao.class);
            int count = daoImpl.update();
            String bool = count>0?"成功":"失败";
            System.out.println(bool);
        }
    }

    @Test
    public void testDelete(){
        try(SqlSession session = SqlSessionHelper.getSqlSession()){
            DeptDao daoImpl = session.getMapper(DeptDao.class);
            int count = daoImpl.delete();
            String bool = count>0?"成功":"失败";
            System.out.println(bool);
        }
    }
}
