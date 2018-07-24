<%--
  Created by IntelliJ IDEA.
  User: nkxd
  Date: 2018/7/23
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

    <style type="text/css">

        body, html {width: 100%;height: 100%;margin:0;font-family:"微软雅黑";}
        #allmap{width:100%;height:800px;}
        p{margin-left:5px; font-size:14px;}
    </style>
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=7KCkGZ5Tbzq5rg0ChZKG4HrVQvAhPU1C"></script>
    <title>租车管理系统</title>
    <jsp:include page="../js_css.jsp"/>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li><a href="../index.html" role="tab">订单信息</a></li>
                <li ><a href="../users/userManager.html" role="tab">商家信息</a></li>
                <li class="active"><a href="#" role="tab">车辆管理</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <iframe src="https://www.baidu.com/"></iframe>
        </div>
    </div>
</div>

</body>
</html>

