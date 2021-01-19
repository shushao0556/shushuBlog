<%@ page import="com.evshou.entity.BlogOptions" %>
<%@ page import="java.util.Properties" %>
<%@ page import="java.io.InputStream" %>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.InputStreamReader" %>
<%@ page import="com.evshou.entity.BlogUsers" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <title>管理员首页</title>
</head>
<%
    String filePath="webConfig.properties";
    Properties pro=new Properties();
    InputStream in = request.getSession().getServletContext().getResourceAsStream(filePath);
    BufferedReader r=new BufferedReader(new InputStreamReader(in));
    pro.load(r);
    request.setAttribute("pro",pro);
%>
<body class="layui-layout-body">
<c:if test="${sessionScope.users.status==1}">
    <div class="layui-layout layui-layout-admin">
        <jsp:include page="header.jsp"/>
        <jsp:include page="left.jsp"/>

        <div class="layui-body">
            <!-- 内容主体区域 -->
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                <legend>网站设置</legend>
            </fieldset>
            <div class="layui-row">
                <div class="layui-form-item" pane>
                    <label class="layui-form-label">网站标题</label>
                    <div class="layui-input-inline">
                        <input type="text" class="layui-input" readonly value="${pro.webTitle}">
                    </div>
                </div>
                <div class="layui-form-item" pane>
                    <label class="layui-form-label">网站副标题</label>
                    <div class="layui-input-inline">
                        <input type="text" class="layui-input" readonly value="${pro.webTitle2}">
                    </div>
                </div>
                <div class="layui-form-item" pane>
                    <label class="layui-form-label">网站地址</label>
                    <div class="layui-input-inline">
                        <input type="text" class="layui-input" readonly value="${pro.webUrl}">
                    </div>
                </div>
                <div class="layui-form-item" pane>
                    <label class="layui-form-label">电子邮箱</label>
                    <div class="layui-input-inline">
                        <input type="text" class="layui-input" readonly value="${pro.web_email}">
                    </div>
                </div>
                <h3>如需修改网站配置，请修改 文件 ：webConfig.properties</h3>
            </div>
        </div>

        <jsp:include page="footer.jsp"/>
    </div>
    <script>
        //JavaScript代码区域
        layui.use('element', function () {
            var element = layui.element;

        });
    </script>
</c:if>
<h3>非法访问</h3>
</body>
</html>
