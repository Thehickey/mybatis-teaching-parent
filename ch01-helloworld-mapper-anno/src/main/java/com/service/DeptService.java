package com.service;

import com.dao.DeptDao;
import com.entity.Dept;
import com.util.MapperFactory2;

import java.util.List;

public class DeptService {

    private DeptDao dao = MapperFactory2.generateMapper(DeptDao.class);

    public Dept getById(){
        return dao.getById();
    }

    public List<Dept> getAll(){
        return dao.getAll();
    }

    public int insert(){ return dao.insert(); }

    public int update(){ return dao.update(); }

    public int delete(){ return dao.delete(); }

}
