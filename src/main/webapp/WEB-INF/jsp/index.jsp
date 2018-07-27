<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/17
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页 - 租车管理系统</title>
    <jsp:include page="js_css.jsp"/>
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
                        <h1 class="h2">数据概览</h1>
                        <div class="btn-toolbar mb-2 mb-md-0">
                            <div class="btn-group mr-2">
                                <button class="btn btn-sm btn-outline-secondary">刷新数据</button>
                            </div>
                        </div>
                    </div>
                    <div class="row placeholders" style="margin: 20px;margin-left: 50px">
                        <div class="col-xs-6 col-sm-3 placeholder">
                            <span class="status-num" style="background-color: #2aabd2">2</span>
                            <h4>客户数量</h4>
                            <span class="text-muted">历史总租车人数</span>
                        </div>
                        <div class="col-xs-6 col-sm-3 placeholder">
                            <span class="status-num" style="background-color: silver">2</span>
                            <h4>已租出车辆</h4>
                            <span class="text-muted">已租出未归还(包含逾期)</span>
                        </div>
                        <div class="col-xs-6 col-sm-3 placeholder">
                            <span class="status-num" style="background-color: #c12e2a">1</span>
                            <h4>已逾期车辆</h4>
                            <span class="text-muted">超时未归还</span>
                        </div>
                        <div class="col-xs-6 col-sm-3 placeholder">
                            <span class="status-num" style="background-color: #4cae4c">8</span>
                            <h4>剩余车辆</h4>
                            <span class="text-muted">目前可租车辆</span>
                        </div>
                    </div>
                    <h2>租车信息</h2>
                    <div class="table-responsive">
                        <table class="table table-hover">
                            <thead>
                            <tr>
                                <th>订单号</th>
                                <th>租车人</th>
                                <th>租车日期</th>
                                <th>约定还车日期</th>
                                <th>是否逾期</th>
                                <th>逾期天数</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr class="table-success">
                                <td>1,001</td>
                                <td>张先生</td>
                                <td>2018-7-13</td>
                                <td>2018-7-15</td>
                                <td>否</td>
                                <td>0</td>
                            </tr>
                            <tr class="table-danger">
                                <td>1,002</td>
                                <td>王先生</td>
                                <td>2018-7-1</td>
                                <td>2018-7-10</td>
                                <td>是</td>
                                <td>3</td>
                            </tr>
                            <tr>
                                <td>1,003</td>
                                <td>张先生</td>
                                <td>2018-7-13</td>
                                <td>2018-7-15</td>
                                <td>否</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1,003</td>
                                <td>张先生</td>
                                <td>2018-7-13</td>
                                <td>2018-7-15</td>
                                <td>否</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1,004</td>
                                <td>张先生</td>
                                <td>2018-7-13</td>
                                <td>2018-7-15</td>
                                <td>否</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1,005</td>
                                <td>张先生</td>
                                <td>2018-7-13</td>
                                <td>2018-7-15</td>
                                <td>否</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1,006</td>
                                <td>张先生</td>
                                <td>2018-7-13</td>
                                <td>2018-7-15</td>
                                <td>否</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1,007</td>
                                <td>张先生</td>
                                <td>2018-7-13</td>
                                <td>2018-7-15</td>
                                <td>否</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1,008</td>
                                <td>张先生</td>
                                <td>2018-7-13</td>
                                <td>2018-7-15</td>
                                <td>否</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1,009</td>
                                <td>张先生</td>
                                <td>2018-7-13</td>
                                <td>2018-7-15</td>
                                <td>否</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1,010</td>
                                <td>张先生</td>
                                <td>2018-7-13</td>
                                <td>2018-7-15</td>
                                <td>否</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1,011</td>
                                <td>张先生</td>
                                <td>2018-7-13</td>
                                <td>2018-7-15</td>
                                <td>否</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1,012</td>
                                <td>张先生</td>
                                <td>2018-7-13</td>
                                <td>2018-7-15</td>
                                <td>否</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1,013</td>
                                <td>张先生</td>
                                <td>2018-7-13</td>
                                <td>2018-7-15</td>
                                <td>否</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1,014</td>
                                <td>张先生</td>
                                <td>2018-7-13</td>
                                <td>2018-7-15</td>
                                <td>否</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1,015</td>
                                <td>张先生</td>
                                <td>2018-7-13</td>
                                <td>2018-7-15</td>
                                <td>否</td>
                                <td>0</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </el-main>
            </el-container>
        </el-row>
    </el-container>
</div>
    <jsp:include page="footer.jsp"/>
</body>
</html>
