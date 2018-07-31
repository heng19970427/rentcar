<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/20
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>经营月报表 - 租车管理系统</title>
    <jsp:include page="js_css.jsp"/>
    <style>
        .price {
            color: #fabe00;
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
                <h1 class="h2">经营月报表</h1>
                <div class="btn-toolbar mb-2 mb-md-0">
                    <el-date-picker
                            type="month"
                            placeholder="选择月份">
                    </el-date-picker>
                    <div class="btn-group mr-2">
                        <button class="btn btn-sm btn-outline-secondary">导出报表</button>
                    </div>
                </div>
            </div>
            <el-row>
                <el-col :span="12">
                    <label>2018年7月收入:</label>
                    <h2 class="price">3540.32<small>¥</small></h2>
                </el-col>
                <el-col :span="12">
                    <label>该月共完成订单:</label>
                    <h2>15<small>笔</small></h2>
                </el-col>
            </el-row>
            <el-row>
                <el-col :span="12">
                    <h3>单车收入金额统计</h3>
                    <ve-pie :data="monthMoney"></ve-pie>
                </el-col>
                <el-col :span="12">
                    <h3>单车订单数量比例</h3>
                    <ve-histogram :data="monthOrder"></ve-histogram>
                </el-col>
            </el-row>
        </el-main>
            </el-container>
        </el-row>
    </el-container>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
