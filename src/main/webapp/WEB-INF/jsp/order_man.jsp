<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/20
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单管理 - 租车管理系统</title>
    <jsp:include page="js_css.jsp"/>
    <style>
        .row{
            margin: 15px;
        }
        a{
            color: #222;
        }
        a:hover{
            color: #ffffff;
            text-underline: none;
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
                <h1 class="h2">订单管理</h1>
                <div class="btn-toolbar mb-2 mb-md-0">
                    <div class="input-group">
                        <input type="text" name="search" id="search" placeholder="搜索订单" class="btn">
                    </div>
                    <div class="btn-group mr-2">
                        <a href="${pageContext.request.contextPath}/order_create" class="btn btn-outline-secondary">新增订单</a>
                    </div>
                    <div class="dropdown">
                        <button class="btn btn-outline-secondary dropdown-toggle" type="button" id="orderMenu"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <span data-feather="bookmark"></span>
                            订单状态选择
                        </button>
                        <div class="dropdown-menu" aria-labelledby="orderMenu">
                            <a href="#" class="dropdown-item">全部</a>
                            <a href="#" class="dropdown-item">出租中</a>
                            <a href="#" class="dropdown-item">已逾期</a>
                            <a href="#" class="dropdown-item">已完成</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="table-responsive">
                    <table class="table table-hover">
                        <thead>
                        <tr>
                            <th>订单编号</th>
                            <th>租车人</th>
                            <th>车辆颜色</th>
                            <th>车辆型号</th>
                            <th>车牌号码</th>
                            <th>订单状态</th>
                            <th>GPS位置查看</th>
                            <th>订单操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>4578001</td>
                            <td>令狐冲</td>
                            <td>白色</td>
                            <td>奥迪A80923</td>
                            <td>京N88963</td>
                            <td>出租中</td>
                            <td><a class="btn btn-outline-secondary" href="${pageContext.request.contextPath}/car_location">查看</a></td>
                            <td><a class="btn btn-outline-secondary" href="#">打印发票</a></td>
                        </tr>
                        <tr>
                            <td>4578001</td>
                            <td>令狐冲</td>
                            <td>白色</td>
                            <td>奥迪A80923</td>
                            <td>京N88963</td>
                            <td>已完成</td>
                            <td><a class="btn btn-outline-secondary" href="${pageContext.request.contextPath}/car_location">查看</a></td>
                            <td><a class="btn btn-outline-secondary" href="#">打印发票</a></td>
                        </tr>
                        <tr>
                            <td>4578001</td>
                            <td>令狐冲</td>
                            <td>白色</td>
                            <td>奥迪A80923</td>
                            <td>京N88963</td>
                            <td>出租中</td>
                            <td><a class="btn btn-outline-secondary" href="${pageContext.request.contextPath}/car_location">查看</a></td>
                            <td><a class="btn btn-outline-secondary" href="#">打印发票</a></td>
                        </tr>
                        <tr>
                            <td>4578001</td>
                            <td>令狐冲</td>
                            <td>白色</td>
                            <td>奥迪A80923</td>
                            <td>京N88963</td>
                            <td>已完成</td>
                            <td><a class="btn btn-outline-secondary" href="${pageContext.request.contextPath}/car_location">查看</a></td>
                            <td><a class="btn btn-outline-secondary" href="#">打印发票</a></td>
                        </tr>
                        <tr>
                            <td>4578001</td>
                            <td>令狐冲</td>
                            <td>白色</td>
                            <td>奥迪A80923</td>
                            <td>京N88963</td>
                            <td>出租中</td>
                            <td><a class="btn btn-outline-secondary" href="${pageContext.request.contextPath}/car_location">查看</a></td>
                            <td><a class="btn btn-outline-secondary" href="#">打印发票</a></td>
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


