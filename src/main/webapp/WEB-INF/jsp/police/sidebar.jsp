<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/24
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="col-md-2 d-none bg-light sidebar d-md-block">
    <div class="sidebar-sticky">
        <ul class="nav flex-column">
            <li class="nav-item">
                <a href="${pageContext.request.contextPath}/police/car_manage" class="nav-link">
                    车辆管理
                </a>
            </li>
            <li class="nav-item">
                <a href="${pageContext.request.contextPath}/police/user_manage" class="nav-link">
                    商家信息
                </a>
            </li>
            <li class="nav-item">
                <a href="${pageContext.request.contextPath}/police/order_manage" class="nav-link">
                    订单信息
                </a>
            </li>
        </ul>
    </div>
</nav>
