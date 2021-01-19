<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <title>修改用户</title>
</head>
<body class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
        <jsp:include page="header.jsp"/>
        <jsp:include page="left.jsp"/>

        <div class="layui-body">
            <!-- 内容主体区域 -->
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                <legend>修改用户</legend>
            </fieldset>
            <div class="layui-row">
                <form method="post" class="layui-form layui-form-pane" action="${pageContext.request.contextPath}/admin/updateUsers">
                    <div class="layui-form-item" pane>
                        <label class="layui-form-label">ID</label>
                        <div class="layui-input-inline">
                            <input type="text" readonly value="${requestScope.users.id}" lay-verType="tips" name="id" autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item" pane>
                        <label class="layui-form-label">用户名</label>
                        <div class="layui-input-inline">
                            <input type="text" value="${requestScope.users.username}" lay-verType="tips" name="username" required lay-verify="required|username" placeholder="请输入用户名" autocomplete="off" class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
                    </div>
                    <div class="layui-form-item" pane>
                        <label class="layui-form-label">密码</label>
                        <div class="layui-input-inline">
                            <input type="password" value="${requestScope.users.password}"  lay-verType="tips" name="password" required lay-verify="required|password" placeholder="请输入密码" autocomplete="off" class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
                    </div>
                    <div class="layui-form-item" pane>
                        <label class="layui-form-label">真实姓名</label>
                        <div class="layui-input-inline">
                            <input type="text" value="${requestScope.users.rolename}" name="rolename" required lay-verify="required|rolename" placeholder="请输入真实姓名" autocomplete="off" class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
                    </div>
                    <div class="layui-form-item" pane>
                        <label class="layui-form-label">性别</label>
                        <div class="layui-input-inline">
                            <c:choose>
                                <c:when test="${requestScope.users.sex.equals('男')}">
                                    <input type="radio" name="sex" value="男" title="男" checked>
                                    <input type="radio" name="sex" value="女" title="女">
                                </c:when>
                                <c:otherwise>
                                    <input type="radio" name="sex" value="男" title="男">
                                    <input type="radio" name="sex" value="女" title="女" checked>
                                </c:otherwise>
                            </c:choose>
                        </div>
                        <div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
                    </div>
                    <div class="layui-form-item" pane>
                        <label class="layui-form-label">邮箱</label>
                        <div class="layui-input-inline">
                            <input type="email" value="${requestScope.users.email}" lay-verType="tips" name="email" required lay-verify="required|email" placeholder="请输入邮箱" autocomplete="off" class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
                    </div>
                    <div class="layui-form-item" pane>
                        <label class="layui-form-label">手机号</label>
                        <div class="layui-input-inline">
                            <input type="text" value="${requestScope.users.mobile}" name="mobile" lay-verType="tips" required lay-verify="required|phone" placeholder="请输入手机号" autocomplete="off" class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
                    </div>
                    <div class="layui-form-item" pane>
                        <label class="layui-form-label">状态</label>
                        <div class="layui-input-inline">
                            <c:choose>
                                <c:when test="${requestScope.users.status==0}">
                                    <input type="radio" name="status" value="0" title="正常" checked>
                                    <input type="radio" name="status" value="1" title="管理员">
                                    <input type="radio" name="status" value="2" title="禁用">
                                    <input type="radio" name="status" value="3" title="审核">
                                </c:when>
                                <c:when test="${requestScope.users.status==1}">
                                    <input type="radio" name="status" value="0" title="正常">
                                    <input type="radio" name="status" value="1" title="管理员" checked>
                                    <input type="radio" name="status" value="2" title="禁用">
                                    <input type="radio" name="status" value="3" title="审核">
                                </c:when>
                                <c:when test="${requestScope.users.status==2}">
                                    <input type="radio" name="status" value="0" title="正常">
                                    <input type="radio" name="status" value="1" title="管理员">
                                    <input type="radio" name="status" value="2" title="禁用" checked>
                                    <input type="radio" name="status" value="3" title="审核">
                                </c:when>
                                <c:otherwise>
                                    <input type="radio" name="status" value="0" title="正常">
                                    <input type="radio" name="status" value="1" title="管理员">
                                    <input type="radio" name="status" value="2" title="禁用">
                                    <input type="radio" name="status" value="3" title="审核" checked>
                                </c:otherwise>
                            </c:choose>
                        </div>
                        <div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
                    </div>
                    <div class="layui-form-item" pane>
                        <label class="layui-form-label">验证码</label>
                        <div class="layui-input-inline">
                            <input type="text" name="vcode" required lay-verify="required|vcode" placeholder="请输入验证码" autocomplete="off" class="layui-input">
                            <img src="${pageContext.request.contextPath}/vc" alt="">
                        </div>
                        <div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
                    </div>
                    <div class="layui-form-item">
                        <div class="layui-input-block">
                            <button class="layui-btn" lay-submit lay-filter="formUpdateUsers">修改</button>
                            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                        </div>
                    </div>
                    <script src="js/updateUsers.js"></script>
                </form>
            </div>
        </div>

        <jsp:include page="footer.jsp"/>
    </div>
    <script src="js/element.js"> </script>
</body>
</html>
