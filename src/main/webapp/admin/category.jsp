<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <title>博客分类</title>
</head>
<body class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
        <jsp:include page="header.jsp"/>
        <jsp:include page="left.jsp"/>
        <div class="layui-body">
            <div class="layui-container">
                <div class="layui-row">
                    <div class="layui-col-xs6 layui-col-md4 layui-form" style="margin: 20px 0">
                        <h2>分类目录</h2>
                        <div style="height: 50px"></div>
                        <form method="post" class="layui-form layui-form-pane" action="${pageContext.request.contextPath}/admin/addCategory">
                            <div class="layui-form-item" pane>
                                <label class="layui-form-label">分类名称</label>
                                <div class="layui-input-block">
                                    <input type="text" name="category_name" lay-verType="tips" required lay-verify="required" placeholder="请输入分类名称" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <div class="layui-input-block">
                                    <button class="layui-btn" lay-submit lay-filter="formCategory">添加</button>
                                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                                </div>
                            </div>
                        </form>
                        <table class="layui-table">
                            <thead>
                            <tr>
                                <th>分类编号</th>
                                <th>分类名称</th>
                                <th>总数</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="category" items="${sessionScope.allPostsCategory.list}">
                                <tr>
                                    <td>${category.categoryId}</td>
                                    <td>${category.categoryName}</td>
                                    <td></td>
                                    <td>
                                        <button type="button" class="layui-btn layui-btn-sm">
                                            <i class="layui-icon"><a href="${pageContext.request.contextPath}/admin/editCategory?categoryId=${category.categoryId}">&#xe642;</a></i>
                                        </button>
                                        <button type="button" class="layui-btn layui-btn-sm">
                                            <i class="layui-icon"><a href="${pageContext.request.contextPath}/admin/delCategory?categoryId=${category.categoryId}">&#xe640;</a></i>
                                        </button>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                        <button type="button" class="layui-btn layui-btn-sm">
                            <i style="display: block" class="layui-icon" href="${pageContext.request.contextPath}/admin/category?pageNum=${sessionScope.allPostsCategory.navigateFirstPage}">&#xe68e;</i>
                        </button>
                        <c:if test="${sessionScope.allPostsCategory.isFirstPage==false}">
                            <button type="button" class="layui-btn layui-btn-sm">
                                <i class="layui-icon">
                                    <a href="${pageContext.request.contextPath}/admin/category?pageNum=${sessionScope.allPostsCategory.prePage}">&#xe603;</a>
                                </i>
                            </button>
                        </c:if>
                        <c:forEach begin="1" end="${sessionScope.allPostsCategory.pages}" var="i">
                        <button type="button" class="layui-btn layui-btn-primary">
                            <a href="${pageContext.request.contextPath}/admin/category?pageNum=${i}">${i}</a>
                        </button>
                        </c:forEach>
                        <c:if test="${sessionScope.allPostsCategory.isLastPage==false}">
                        <button type="button" class="layui-btn layui-btn-sm">
                            <i class="layui-icon">
                                <a href="${pageContext.request.contextPath}/admin/category?pageNum=${sessionScope.allPostsCategory.nextPage}">&#xe602;</a>
                            </i>
                        </button>
                        <button type="button" class="layui-btn layui-btn-sm">
                            <i class="layui-icon" style="font-size: 30px; color: #1E9FFF;">
                                <a href="${pageContext.request.contextPath}/admin/category?pageNum=${sessionScope.allPostsCategory.navigateLastPage}">&#xe65b;</a>
                            </i>
                        </button>
                        </c:if>
                    </div>
                </div>
            </div>
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
</body>
</html>
