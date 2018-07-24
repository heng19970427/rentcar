<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../js_css.jsp"/>
    <style type="text/css">
        iframe {
            margin: 0;
            border-style: none;
            width: 100%;
            height: 100%;
        }
        body, html {
            font-family: "微软雅黑", sans-serif;}
        #allmap{width:100%;height:800px;}
        p{margin-left:5px; font-size:14px;}
    </style>
    <title>租车管理系统</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container-fluid">
    <div class="row">
        <jsp:include page="sidebar.jsp"/>
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4" id="mainWindow">
            <iframe src="http://lbsyun.baidu.com/trace/admin/managerdemo"></iframe>
        </main>
    </div>
</div>
<jsp:include page="../footer.jsp"/>
</body>
</html>
