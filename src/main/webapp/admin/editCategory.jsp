<%@ page import="com.evshou.entity.BlogPostsCategory" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <title>编辑文章分类</title>
</head>
<body class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
        <jsp:include page="header.jsp"/>
        <jsp:include page="left.jsp"/>
        <div class="layui-body">
            <div class="layui-container">
                <div class="layui-row">
                    <div class="layui-col-xs6 layui-col-md4" style="margin: 20px 0">
                        <h2>分类目录</h2>
                        <div style="height: 50px"></div>
                        <form method="post" class="layui-form layui-form-pane" action="${pageContext.request.contextPath}/admin/updateCategory">
                            <div class="layui-form-item" pane>
                                <label class="layui-form-label">分类名称</label>
                                <div class="layui-input-block">
                                    <input type="text" value="${sessionScope.category.categoryName}" name="category_name" lay-verType="tips" required lay-verify="required" placeholder="请输入分类名称" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <div class="layui-input-block">
                                    <button class="layui-btn" lay-submit lay-filter="formCategory">修改</button>
                                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                                </div>
                            </div>
                        </form>
                </div>
            </div>
        </div>

        <jsp:include page="footer.jsp"/>
    </div>
    <script>
        layui.use('form', function(){
            var form = layui.form;
            //监听提交
            form.on('submit(formCategory)', function(data){
                layer.msg(JSON.stringify(data.field));
                return true;
            });
        });
    </script>
</body>
</html>
