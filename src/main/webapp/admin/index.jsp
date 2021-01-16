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
<body class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
        <jsp:include page="header.jsp"/>
        <jsp:include page="left.jsp"/>
        <jsp:include page="body.jsp"/>
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
