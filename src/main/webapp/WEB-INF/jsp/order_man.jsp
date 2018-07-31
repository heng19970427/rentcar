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
<div id="app">
    <el-container>
        <jsp:include page="header.jsp"/>
        <el-row>
            <el-container>
                <jsp:include page="sidebar.jsp"/>
                <el-main id="mainWindow">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
                <h1 class="h2">订单管理</h1>
                <div class="btn-toolbar mb-2 mb-md-0">
                    <div class="input-group">
                        <input type="text" name="search" id="search" placeholder="搜索订单" class="btn">
                    </div>
                    <div class="btn-group mr-2">
                        <a href="${pageContext.request.contextPath}/order_create" class="btn btn-outline-secondary">新增订单</a>
                    </div>
                </div>
            </div>
        <el-row :span="24">
            <el-table
                    :data="orders"
                    border
                    style="width: 100%">
                <el-table-column
                        prop="orderId"
                        label="ID">
                </el-table-column>
                <el-table-column
                        prop="car.type"
                        label="汽车型号">
                </el-table-column>
                <el-table-column
                        prop="rentDate"
                        label="租出日期">
                </el-table-column>
                <el-table-column
                        prop="returnDate"
                        label="约定还车日期">
                </el-table-column>
                <el-table-column
                        prop="fee"
                        label="预计费用">
                </el-table-column>
                <el-table-column
                        prop="phone"
                        label="联系电话">
                </el-table-column>
                <el-table-column
                        prop="status"
                        label="订单状态"
                        :filters="[{text: '出租中', value: '出租中'}, {text: '已完成', value: '已完成'}, {text: '已逾期', value: '已逾期'}, {text: '未提车', value: '未提车'}]"
                        :filter-method="filterHandler">
                </el-table-column>
            </el-table>
        </el-row>
        </el-main>
            </el-container>
        </el-row>
    </el-container>
</div>
    <jsp:include page="footer.jsp"/>
</body>
</html>


