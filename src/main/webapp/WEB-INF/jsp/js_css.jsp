<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/17
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Bootstrap core CSS -->
<link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="${pageContext.request.contextPath}/static/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${pageContext.request.contextPath}/static/css/dashboard.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->

<script>window.jQuery || document.write('<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"><\/script>')</script>
<script src="${pageContext.request.contextPath}/static/js/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/holder.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/zepto.min.js"></script>
<%--bootstrap 日期选择插件--%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap-datetimepicker.min.css">
<script src="${pageContext.request.contextPath}/static/js/bootstrap-datetimepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap-datetimepicker.zh-CN.js"></script>
<%--echarts--%>
<script src="${pageContext.request.contextPath}/static/js/echarts.common.min.js"></script>

<%--VUE.js--%>
<script src="${pageContext.request.contextPath}/static/js/vue.js"></script>
<%--ElementUI--%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/elementui/index.css">
<script src="${pageContext.request.contextPath}/static/js/elementui/index.js"></script>
<style>
    .status-num {
        color: #fdfdfd;
        height: 100px;
        width: 100px;
        display: inline-block;
        border-radius: 50px;
        font-size: 40px;
        text-align: center;
        line-height: 100px;
    }
    .list-group {
        margin-bottom: 0;
    }
    .list-group-item {
        border: none;
    }
    .panel-body {
        padding-bottom: 0;
    }
    .navbar-link {
        color: #333333;
        font-weight: bold;
        text-align: start;
        vertical-align: middle;
        line-height: 50px;
    }
    .navbar-link:hover{
        color: #333333;
        font-weight: bold;
        text-decoration: none;
    }
    ul li a {
        font-weight: 500;
        color: #333333;
    }
    ul li a:hover {
        font-weight: 500;
        color: #333333;
        text-decoration: none;
    }
</style>
