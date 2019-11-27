package com.dao;

import com.entity.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author 清淡欢颜
 */
public interface DeptDao {
    @Select({"select id,deptname from dept where id = 2"})
    Dept getById();

    @Select({"select id,deptname from dept"})
    List<Dept> getAll();

    @Insert({"insert into dept(deptname) values('test')"})
    int insert();

    @Update({"update dept set deptname = '小白' where id = 10"})
    int update();

    @Delete({"delete from dept where id = 10"})
    int delete();
}
