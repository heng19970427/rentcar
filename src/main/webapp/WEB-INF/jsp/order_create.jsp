<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/21
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单管理 - 租车管理系统</title>
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
                <h1 class="h2">订单管理</h1>
                <div class="btn-toolbar mb-2 mb-md-0">
                    <div class="btn-group mr-2">
                        <button class="btn btn-sm btn-outline-secondary">打印订单</button>
                        <button class="btn btn-sm btn-outline-secondary">打印身份证</button>
                    </div>
                </div>
            </div>
            <div class="row">
                <form id="order-create">
                    <div class="form-row">
                        <div class="form-group col-md-4">
                            <label for="user-name-label">姓名</label>
                            <input type="text" name="name" id="user-name-label" class="form-control"
                                   placeholder="姓名">
                        </div>
                        <div class="form-group col-md-4">
                            <label for="sex">性别</label>
                            <div class="form-control" id="sex">
                                <div class="custom-control custom-radio custom-control-inline">
                                    <input type="radio" id="sex1" name="sex" class="custom-control-input">
                                    <label class="custom-control-label" for="sex1">男</label>
                                </div>
                                <div class="custom-control custom-radio custom-control-inline">
                                    <input type="radio" id="sex2" name="sex" class="custom-control-input">
                                    <label class="custom-control-label" for="sex2">女</label>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-4">
                            <label for="IDCardNum">身份证号码</label>
                            <input type="text" name="IDCardNum" id="IDCardNum" class="form-control"
                                   placeholder="身份证号码">
                        </div>
                        <div class="form-group col-md-4">
                            <label for="driveCardNum">驾驶证号码</label>
                            <input type="text" name="IDCardNum" id="driveCardNum" class="form-control"
                                   placeholder="驾驶证号码">
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-4">
                            <label for="carModel">车辆</label>
                            <select name="carModel" id="carModel" class="form-control">
                                <option value="" selected>请选择车辆</option>
                                <option value="1001">奥迪A6 赣D22222</option>
                                <option value="1002">奥迪A8 赣D22223</option>
                            </select>
                        </div>
                        <div class="form-group col-md-4">
                            <label for="feePlan">租金方案</label>
                            <select name="feePlan" id="feePlan" class="form-control">
                                <option value="" selected>请选择方案</option>
                                <option value="1">方案1</option>
                                <option value="2">方案2</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-row" style="width: 1000px">
                        <fieldset class="form-group">
                            <legend>身份证</legend>
                            <div class="custom-file">
                                <input type="file" class="custom-file-input" id="IDCard1">
                                <label class="custom-file-label" for="IDCard1">身份证正面</label>
                            </div>
                            <div class="custom-file">
                                <input type="file" class="custom-file-input" id="IDCard2">
                                <label class="custom-file-label" for="IDCard2">身份证反面</label>
                            </div>
                        </fieldset>
                    </div>
                    <div class="form-row" style="width: 1000px">
                        <fieldset class="form-group">
                            <legend>驾驶证</legend>
                            <div class="custom-file">
                                <input type="file" class="custom-file-input" id="driveCard">
                                <label class="custom-file-label" for="driveCard">驾驶证</label>
                            </div>
                        </fieldset>
                    </div>
                    <button type="submit" class="btn btn-primary">创建</button>
                </form>
            </div>
        </main>
    </div>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
