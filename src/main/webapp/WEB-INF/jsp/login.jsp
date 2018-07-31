<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录 - 租车管理系统</title>
    <%--VUE.js--%>
    <script src="${pageContext.request.contextPath}/static/js/vue.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/axios.min.js"></script>
    <%--ElementUI--%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/elementui/index.css">
    <script src="${pageContext.request.contextPath}/static/js/elementui/index.js"></script>
</head>
<body>
<div id="app">
    <el-row style="margin-top: 10%">
        <el-col :span="4" :offset="10" style="text-align: center">
            <h2>登录</h2>
        </el-col>
    </el-row>
    <el-row>
        <el-col :span="12" :offset="6">
            <form action="${pageContext.request.contextPath}/login" method="post">
                <div style="margin-bottom: 15px;">
                    手机号:
                    <el-input type="text" name="phone" auto-complete="off" placeholder="请输入手机号" required clearable></el-input>
                </div>
                <div style="margin-bottom: 15px;">
                    密码:
                    <el-input type="password" name="password" auto-complete="off" placeholder="请输入密码" required clearable></el-input>
                </div>
                <button type="submit" class="el-button el-button--primary is-round">登录</button>
            </form>
        </el-col>
    </el-row>
</div>
<script>
    new Vue({
        el: '#app'
    })
</script>
</body>
</html>
