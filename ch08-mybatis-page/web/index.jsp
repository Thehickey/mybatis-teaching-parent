<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 清淡欢颜
  Date: 2019/10/12
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>工资</th>
    </tr>
    <c:forEach var="emp" items="${emps}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.username}</td>
            <td>${emp.salary}</td>
        </tr>
    </c:forEach>
</table>
<a href="/index?pageNum=${pagination.first}&pageSize=2">首页</a>
<a href="/index?pageNum=${pagination.prev}&pageSize=2">上一页</a>
<a href="/index?pageNum=${pagination.next}&pageSize=2">下一页</a>
<a href="/index?pageNum=${pagination.last}&pageSize=2">尾页</a>
</body>
</html>
