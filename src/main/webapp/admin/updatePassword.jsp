<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <title>修改密码</title>
</head>
<body class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
        <jsp:include page="header.jsp"/>
        <jsp:include page="left.jsp"/>
        <div class="layui-body">
            <div class="layui-container">
                <fieldset class="layui-elem-field">
                    <legend>修改密码</legend>
                </fieldset>
                <div class="layui-row">
                    <form method="post" class="layui-form layui-form-pane" action="${pageContext.request.contextPath}/admin/updatePWD">
                        <div class="layui-form-item" pane>
                            <label class="layui-form-label">原密码</label>
                            <div class="layui-input-inline">
                                <input type="text" name="oldPassWord" required lay-verify="required" placeholder="请输入原密码" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item" pane>
                            <label class="layui-form-label">请输入新密码</label>
                            <div class="layui-input-inline">
                                <input type="password" lay-verType="tips" name="newpassword" required lay-verify="required|password" placeholder="请输入新密码" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item" pane>
                            <label class="layui-form-label">请再次输入新密码</label>
                            <div class="layui-input-inline">
                                <input type="password" lay-verType="tips" name="newpassword2" required lay-verify="required|password" placeholder="请再次输入新密码" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item" pane>
                            <label class="layui-form-label">验证码</label>
                            <div class="layui-input-inline">
                                <input type="text" name="vcode" required lay-verify="required" placeholder="请输入验证码" autocomplete="off" class="layui-input">
                                <img src="${pageContext.request.contextPath}/vc" alt="">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <button class="layui-btn" lay-submit lay-filter="formDemo">修改</button>
                                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                            </div>
                        </div>
                        <script>
                            //Demo
                            layui.use('form', function(){
                                var form = layui.form;
                                form.verify({
                                    password: [
                                        /^[\S]{8,12}$/
                                        ,'密码必须8到12位，且不能出现空格'
                                    ]
                                });

                                //监听提交
                                form.on('submit(formDemo)', function(data){
                                    layer.msg(JSON.stringify(data.field));
                                    return true;
                                });
                            });
                        </script>
                    </form>
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
