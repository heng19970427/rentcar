<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/21
  Time: 1:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提醒服务设置 - 租车管理系统</title>
    <jsp:include page="js_css.jsp"/>
    <style>
        .row{
            margin: 15px;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container-fluid">
    <div class="row">
        <jsp:include page="sidebar.jsp"/>
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4" id="mainWindow">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
                <h1 class="h2">提醒服务设置</h1>
                <div class="btn-toolbar mb-2 mb-md-0">
                    <div class="btn-group mr-2">
                        <button class="btn btn-sm btn-outline-secondary">新增提醒方案</button>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="table-responsive">
                    <table class="table table-hover">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>方案名称</th>
                            <th>方案模板</th>
                            <th colspan="2">操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>1</td>
                            <td>客户生日祝福</td>
                            <td>[{shopname}提醒]你好,尊敬的{name},{shopname}祝你生日愉快,今日租车尊享8折优惠,仅限今日哦!</td>
                            <td><div class="btn-group-sm"><a href="#" class="btn btn-secondary">设置</a><a href="#" class="btn btn-secondary">删除</a></div></td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>提醒还车</td>
                            <td>[{shopname}提醒]你好,尊敬的{name},{shopname}温馨提醒你,距还车日还有{dayleft}天哦!</td>
                            <td><div class="btn-group-sm"><a href="#" class="btn btn-secondary">设置</a><a href="#" class="btn btn-secondary">删除</a></div></td>
                        </tr>
                        </tbody>
                    </table>
                </div>

            </div>
        </main>
    </div>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>

