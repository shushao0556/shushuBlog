<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询所有用户</title>
</head>
<body>
<%
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    request.setAttribute("sdf",sdf);
%>
<a href="">添加用户</a>
<table border="1">
    <tr>
        <th>用户编号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>真实姓名</th>
        <th>性别</th>
        <th>邮箱</th>
        <th>手机号</th>
        <th>注册时间</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    <c:forEach var="user" items="${requestScope.allUsers.list}">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.rolename}</td>
            <td>${user.sex}</td>
            <td>${user.email}</td>
            <td>${user.mobile}</td>
            <td>${sdf.format(user.registered)}</td>
            <td>${user.status}</td>
            <td>
                <a href="">修改</a>
                <a href="">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}/admin/getAll?pageNum=1">首页</a>
<a href="${pageContext.request.contextPath}/admin/getAll?pageNum=${requestScope.allUsers.prePage}">上一页</a>
<c:forEach begin="1" end="${requestScope.allUsers.pages}" var="i">
    <a href="${pageContext.request.contextPath}/admin/getAll?pageNum=${i}">${i}</a>
</c:forEach>
<a href="${pageContext.request.contextPath}/admin/getAll?pageNum=${requestScope.allUsers.nextPage}">下一页</a>
<c:if test="${requestScope.allUsers.isLastPage==false}">
    <a href="${pageContext.request.contextPath}/admin/getAll?pageNum=${requestScope.allUsers.pages}">尾页</a>
</c:if> <br>
<a href="">注销</a>
</body>
</html>
