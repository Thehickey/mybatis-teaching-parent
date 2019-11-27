package com.dao;

import com.entity.Dept;

import java.util.List;

public interface DeptDao {
    void insertSimple(List<Dept> depts);
    void deleteSimple(List<Integer> ids);
    void updateSimple(List<Dept> depts);
    void update(Dept dept);
}
