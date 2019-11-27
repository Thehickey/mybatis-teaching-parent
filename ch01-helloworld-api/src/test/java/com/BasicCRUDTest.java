//package com;
//
//import com.entity.Dept;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//public class BasicCRUDTest {
//
//    @Test
//    public void testInsert() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//        try(SqlSession session = factory.openSession(true)){
//            session.insert("myns.myinsert");
//        }
//    }
//    @Test
//    public void testDelete() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//        try(SqlSession session = factory.openSession(true)){
//            session.delete("myns.mydelete");
//        }
//    }
//
//    @Test
//    public void testGetAll() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//        try(SqlSession session = factory.openSession(true)){
//            List<Dept> list = session.selectList("myns.getAll");
//            for (Dept dept : list) {
//                System.out.println(dept.toString());
//            }
//        }
//    }
//
//    @Test
//    public void testGetById() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//        try(SqlSession session = factory.openSession(true)){
//            Dept dept = session.selectOne("myns.getById");
//            System.out.println(dept);
//        }
//    }
//
//    @Test
//    public void testUpdate() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//        try(SqlSession session = factory.openSession(true)){
//            session.update("myns.myupdate");
//        }
//    }
//}
