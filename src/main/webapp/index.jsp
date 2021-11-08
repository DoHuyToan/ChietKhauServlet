<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/8/2021
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Bảng Tự động Chiết khấu</h2>
  <form action="/DiscountCalculator" method="post">
    <label>MÔ TẢ: </label><br/>
    <input type="text" name="description" placeholder="Nhập mô tả"><br/>
    <label>GIÁ: </label><br/>
    <input type="text" name="price" placeholder="Giá"><br/>
    <label>CHIẾT KHẤU</label><br/>
    <input type="text" name="percent" placeholder="Chiết khấu"><br/>
    <input type="submit" id="submit" value="Calculate Discount">
  </form>
  </body>
</html>
