<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/2
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
  <head>
    <title>机场信息</title>
  </head>
  <body>
  <form action="showtake" method="get">
  起飞机场：
  <select name="takeid">
    <option value="0">请选择</option>
      <c:forEach items="${takeport}" var="take">
        <option value="${take.id}">${take.portName}</option>
      </c:forEach>
  </select>
  降落机场：
  <select name="landid">
    <option value="0">请选择</option>
    <c:forEach items="${landport}" var="land">
      <option value="${land.id}">${land.portName}</option>
    </c:forEach>
  </select>
    <input type="submit" value="查询"/>
  </form>
  <table border="1">
    <tr>
      <td>飞机编号</td>
      <td>起飞机场</td>
      <td>起飞城市</td>
      <td>降落机场</td>
      <td>降落城市</td>
      <td>航行时间</td>
      <td>票价(元)</td>
    </tr>
    <c:forEach items="${airplanes }" var="plane">
      <tr>
        <td>${plane.airno }</td>
        <td>${plane.takePort.portName }</td>
        <td>${plane.takePort.cityName }</td>
        <td>${plane.landPort.portName }</td>
        <td>${plane.landPort.cityName }</td>
        <td>
          <c:if test="${plane.time/60>0}">
            <fmt:formatNumber value="${plane.time/60 }" pattern="0"></fmt:formatNumber>小时
          </c:if>
          <c:if test="${ plane.time%60>0}">
            ${ plane.time%60}分钟
          </c:if>
        </td>
        <td>${plane.price }</td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
