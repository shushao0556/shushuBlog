<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <title>写文章</title>
</head>
<body class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
        <jsp:include page="header.jsp"/>
        <jsp:include page="left.jsp"/>
        <div class="layui-body">
            <h2>撰写新文章</h2>
            <div class="layui-row layui-col-space10">
                <div class="layui-col-md9">
                    <form method="post" class="layui-form layui-form-pane" action="${pageContext.request.contextPath}/admin/addPost">
                        <div class="layui-form-item" pane>
                            <div class="layui-input-block">
                                <input type="text" lay-verType="tips" name="post_title" required lay-verify="required" placeholder="添加标题" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="layui-col-md3">
                    <div class="grid-demo">3/12</div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
