package com;

import com.entity.Dept;
import com.service.DeptService;
import org.junit.Test;

import java.util.List;

public class DeptServiceTest {

    @Test
    public void getById(){
        Dept dept = new DeptService().getById();
        System.out.println(dept);
    }

    @Test
    public void getAll(){
        List<Dept> depts = new DeptService().getAll();
        for (Dept dept : depts) {
            System.out.println(dept);
        }
    }

    @Test
    public void insert(){
        int count = new DeptService().insert();
        String bool = count>0?"添加成功":"添加失败";
        System.out.println(bool);
    }

    @Test
    public void update(){
        int count = new DeptService().update();
        String bool = count>0?"修改成功":"修改失败";
        System.out.println(bool);
    }

    @Test
    public void delete(){
        int count = new DeptService().delete();
        String bool = count>0?"删除成功":"删除失败";
        System.out.println(bool);
    }
}
