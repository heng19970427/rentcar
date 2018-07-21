<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/20
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户管理 - 租车管理系统</title>
    <jsp:include page="js_css.jsp"/>
    <style>
        .row {
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
                <h1 class="h2">客户管理</h1>
                <div class="btn-toolbar mb-2 mb-md-0">
                    <div class="input-group">
                        <input type="text" name="search" id="search" placeholder="搜索订单" class="btn">
                    </div>
                    <div class="btn-group mr-2">
                        <button class="btn btn-sm btn-outline-secondary">新增客户</button>
                    </div>
                    <div class="dropdown">
                        <button class="btn btn-outline-secondary dropdown-toggle" type="button" id="orderMenu"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <span data-feather="bookmark"></span>
                            客户等级
                        </button>
                        <div class="dropdown-menu" aria-labelledby="orderMenu">
                            <a href="#" class="dropdown-item">全部</a>
                            <a href="#" class="dropdown-item">1</a>
                            <a href="#" class="dropdown-item">2</a>
                            <a href="#" class="dropdown-item">3</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="table-responsive">
                    <table class="table table-hover">
                        <thead>
                        <tr>
                            <td>ID</td>
                            <td>姓名</td>
                            <td>地址</td>
                            <td>当前出租车辆</td>
                            <td colspan="2">操作</td>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>0071</td>
                            <td>张先生</td>
                            <td>井冈山大道32号店铺</td>
                            <td>5</td>
                            <td>
                                <button type="button" class="btn btn-info">详情</button>
                            </td>
                            <td>
                                <button type="button" class="btn btn-danger">删除</button>
                            </td>
                        </tr>
                        <tr>
                            <td>0071</td>
                            <td>张先生</td>
                            <td>井冈山大道32号店铺</td>
                            <td>5</td>
                            <td>
                                <button type="button" class="btn btn-info">详情</button>
                            </td>
                            <td>
                                <button type="button" class="btn btn-danger">删除</button>
                            </td>
                        </tr>
                        <tr>
                            <td>0071</td>
                            <td>张先生</td>
                            <td>井冈山大道32号店铺</td>
                            <td>5</td>
                            <td>
                                <button type="button" class="btn btn-info">详情</button>
                            </td>
                            <td>
                                <button type="button" class="btn btn-danger">删除</button>
                            </td>
                        </tr>
                        <tr>
                            <td>0071</td>
                            <td>张先生</td>
                            <td>井冈山大道32号店铺</td>
                            <td>5</td>
                            <td>
                                <button type="button" class="btn btn-info">详情</button>
                            </td>
                            <td>
                                <button type="button" class="btn btn-danger">删除</button>
                            </td>
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