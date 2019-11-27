package com.service;

import com.entity.Dept;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DeptServiceTest {

    @Test
    public void updateBatch() {
        List<Dept> depts = new ArrayList<>();
        for(int i=6;i<9;i++){
            Dept dept = new Dept();
            dept.setId(i);
            dept.setDeptName("to " + i);
            depts.add(dept);
        }
        DeptService deptService = new DeptService();

        deptService.updateBatch(depts);
    }


    @Test
    public void updateBatch2() {
        List<Dept> depts = new ArrayList<>();
        for(int i=6;i<10;i++){
            Dept dept = new Dept();
            dept.setId(i);
            dept.setDeptName("from " + i);
            depts.add(dept);
        }
        DeptService deptService = new DeptService();

        deptService.updateBatch2(depts);

    }
}