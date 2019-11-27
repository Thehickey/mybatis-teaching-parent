package com;

import com.entity.Dept;

import java.util.List;

public interface DeptDao {
    Dept getById();

    List<Dept> getAll();

    int insert();

    int update();

    int delete();
}
