<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/17
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="col-md-2 d-none bg-light sidebar d-md-block">
    <div class="sidebar-sticky">
        <ul class="nav flex-column">
            <li class="nav-item">
                <a href="${pageContext.request.contextPath}/index" class="nav-link">
                    <span data-feather="home"></span>
                    总览 <span class="sr-only">(current)</span>
                </a>
            </li>

            <li class="nav-item">
                <a href="#" data-toggle="collapse" data-target="#collapseListGroup1" role="tab" class="nav-link">
                    <span data-feather="truck"></span>
                    车辆管理
                </a>
                <div id="collapseListGroup1" class="panel-collapse collapse" role="tabpanel">
                    <div class="panel-body">
                        <ul class="list-group">
                            <li class="list-group-item">
                                <a href="${pageContext.request.contextPath}/car_info" class="nav-link">车辆信息管理</a>
                            </li>
                            <li class="list-group-item">
                                <a href="${pageContext.request.contextPath}/car_location" class="nav-link">租出车辆管理</a>
                            </li>
                            <li class="list-group-item">
                                <a href="${pageContext.request.contextPath}/car_fee" class="nav-link">租金设置</a>
                            </li>
                            <li class="list-group-item">
                                <a href="${pageContext.request.contextPath}/car_fee_discount" class="nav-link">优惠方案</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </li>

            <li class="nav-item">
                <a href="#" data-toggle="collapse" data-target="#collapseListGroup2" role="tab" class="nav-link">
                    <span data-feather="map-pin"></span>
                    车辆服务
                </a>
                <div id="collapseListGroup2" class="panel-collapse collapse" role="tabpanel">
                    <div class="panel-body">
                        <ul class="list-group">
                            <li class="list-group-item">
                                <a href="${pageContext.request.contextPath}/carservice_insurance" class="nav-link">车辆保险管理</a>
                            </li>
                            <li class="list-group-item">
                                <a href="${pageContext.request.contextPath}/carservice_repair" class="nav-link">车辆维修管理</a>
                            </li>
                            <li class="list-group-item">
                                <a href="${pageContext.request.contextPath}/carservice_maintenance" class="nav-link">车辆保养管理</a>
                            </li>
                            <li class="list-group-item">
                                <a href="${pageContext.request.contextPath}/carservice_peccancy" class="nav-link">车辆违章管理</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </li>

            <li class="nav-item">
                <a href="#" data-toggle="collapse" data-target="#collapseListGroup3" role="tab" class="nav-link">
                    <span data-feather="users"></span>
                    客户管理
                </a>
                <div id="collapseListGroup3" class="panel-collapse collapse" role="tabpanel">
                    <div class="panel-body">
                        <ul class="list-group">
                            <li class="list-group-item">
                                <a href="${pageContext.request.contextPath}/user_man" class="nav-link">客户信息</a>
                            </li>
                            <li class="list-group-item">
                                <a href="${pageContext.request.contextPath}/user_notice" class="nav-link">提醒服务</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </li>

            <li class="nav-item">
                <a href="${pageContext.request.contextPath}/order_man" class="nav-link">
                    <span data-feather="file"></span>订单管理
                </a>
            </li>

            <li class="nav-item">
                <a href="#" data-toggle="collapse" data-target="#collapseListGroup5" role="tab" class="nav-link">
                    <span data-feather="bar-chart-2"></span>
                    运营统计
                </a>
                <div id="collapseListGroup5" class="panel-collapse collapse" role="tabpanel">
                    <div class="panel-body">
                        <ul class="list-group">
                            <li class="list-group-item">
                                <a href="${pageContext.request.contextPath}/statistics_month" class="nav-link">经营月报表</a>
                            </li>
                            <li class="list-group-item">
                                <a href="${pageContext.request.contextPath}/statistics_repaire" class="nav-link">维修费用统计</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</nav>
