<%--
  Created by IntelliJ IDEA.
  User: nkxd
  Date: 2018/7/27
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/order/api_v1/create_order">
        起租日期:<input type="text" name="order.rentDate"/><br/>
        归还日期:<input type="text" name="order.returnDate"/><br/>
        实际归还日期:<input type="text" name="order.returnDateReal"/><br/>
        状态:<input type="text" name="order.status"/><br/>
        额外减免:<input type="text" name="order.extraDerate"/><br/>
        费用:<input type="text" name="order.fee"/><br/>
        剩余油量:<input type="text" name="order.fuelRemain"/><br/>
        汽车ID:<input type="text" name="car.carId"/><br/>
        套餐ID:<input type="text" name="discountPackage.disCountPackageId"/><br/>
        商家ID:<input type="text" name="belong.userId"/><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
