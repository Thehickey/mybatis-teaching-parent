package com;

import com.dao.DeptDao;
import com.entity.Dept;
import com.util.SqlSessionHelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DeptDaoTest {

    private static SqlSession session = SqlSessionHelper.getSqlSession();

    @Test
    public void testGetById(){
        DeptDao deptDao = session.getMapper(DeptDao.class);
        Dept dept = deptDao.getById();
        System.out.println(dept);
    }

    @Test
    public void testGetAll(){
        DeptDao deptDao = session.getMapper(DeptDao.class);
        List<Dept> depts = deptDao.getAll();
        for (Dept dept : depts) {
            System.out.println(dept);
        }
    }

    @Test
    public void testInsert(){
        DeptDao deptDao = session.getMapper(DeptDao.class);
        int count = deptDao.insert();
        String bool = count>0?"添加成功":"添加失败";
        System.out.println(bool);
    }

    @Test
    public void testUpdate(){
        DeptDao deptDao = session.getMapper(DeptDao.class);
        int count = deptDao.update();
        String bool = count>0?"修改成功":"修改失败";
        System.out.println(bool);
    }

    @Test
    public void testDelete(){
        DeptDao deptDao = session.getMapper(DeptDao.class);
        int count = deptDao.delete();
        String bool = count>0?"删除成功":"删除失败";
        System.out.println(bool);
    }
}
