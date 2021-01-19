<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <title>查询所有用户</title>
</head>
<body class="layui-layout-body">

<%
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    request.setAttribute("sdf",sdf);
%>
    <div class="layui-layout layui-layout-admin">
        <jsp:include page="header.jsp"/>
        <jsp:include page="left.jsp"/>

        <div class="layui-body layui-form">
            <button type="button" class="layui-btn layui-btn-normal">
                <a href="addUsers.jsp">添加用户</a>
            </button>
            <table class="layui-table">
                <thead>
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
                </thead>
                <tbody>
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
                        <c:choose>
                            <c:when test="${user.status==0}">
                                <td>正常</td>
                            </c:when>
                            <c:when test="${user.status==1}">
                                <td>管理员</td>
                            </c:when>
                            <c:when test="${user.status==2}">
                                <td>禁用</td>
                            </c:when>
                            <c:otherwise>
                                <td>审核</td>
                            </c:otherwise>
                        </c:choose>
                        <td>
                            <c:choose>
                                <c:when test="${user.status==1 && user.id!=1}">
                                    <a href="${pageContext.request.contextPath}/admin/qu?id=${user.id}">修改</a>
                                </c:when>
                                <c:when test="${user.id!=1}">
                                    <a href="${pageContext.request.contextPath}/admin/qu?id=${user.id}">修改</a>
                                    <a href="${pageContext.request.contextPath}/admin/delUsers?id=${user.id}">删除</a>
                                </c:when>
                            </c:choose>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <a href="${pageContext.request.contextPath}/admin/getAll?pageNum=1">首页</a>
            <c:if test="${requestScope.allUsers.isFirstPage==false}">
                <a href="${pageContext.request.contextPath}/admin/getAll?pageNum=${requestScope.allUsers.prePage}">上一页</a>
            </c:if>
            <c:forEach begin="1" end="${requestScope.allUsers.pages}" var="i">
                <a href="${pageContext.request.contextPath}/admin/getAll?pageNum=${i}">${i}</a>
            </c:forEach>
            <c:if test="${requestScope.allUsers.isLastPage==false}">
                <a href="${pageContext.request.contextPath}/admin/getAll?pageNum=${requestScope.allUsers.nextPage}">下一页</a>
                <a href="${pageContext.request.contextPath}/admin/getAll?pageNum=${requestScope.allUsers.navigateLastPage}">尾页</a>
            </c:if>
        </div>

        <jsp:include page="footer.jsp"/>
    </div>
    <script>
        //注意：导航 依赖 element 模块，否则无法进行功能性操作
        layui.use('element', function(){
            var element = layui.element;

            //…
        });
    </script>
</body>
</html>
