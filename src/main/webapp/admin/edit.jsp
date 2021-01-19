<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <script src="js/element.js"></script>
    <title>文章</title>
</head>
<body class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
        <jsp:include page="header.jsp"/>
        <jsp:include page="left.jsp"/>
        <div class="layui-body">
            <h2>文章管理</h2>
            <div class="layui-container">
                <button type="button" class="layui-btn layui-btn-normal" onclick="location.href('${pageContext.request.contextPath}/post-new.jsp')">写文章</button>
                <div class="layui-row">
                    <table class="layui-hide" id="allposts"></table>
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
                return false;
            });
        });
    </script>
    <script>
        layui.use('table', function(){
            var table = layui.table;
            table.render({
                elem: '#allposts'
                ,width: 450
                ,height: 500
                ,url: '/blog/allposts' //数据接口
                ,page: true //开启分页
                ,cols: [[ //表头
                    {field: 'categoryId', title: '分类ID', width:80, sort: true, fixed: 'left'}
                    ,{field: 'categoryName', title: '分类名称', width:180}
                    // ,{field: 'size', title: '总数', width:80, sort: true}
                ]]
            });
        });
    </script>
    <script type="text/html" id="barDemo">
        <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
        <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    </script>
</body>
</html>
