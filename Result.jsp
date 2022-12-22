<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RPSオンライン</title>
</head>
<body>
<h1>RPSオンライン</h1>
<h3>最初はグー、じゃんけん・・・ぽん</h3>
<table>
<tr>
<td>あなたの手</td>
<td>コンピュータの手</td>
</tr>
<tr>
  <th><img src = "${pageContext.request.contextPath}/img/<c:out value="${userHandImage}"/>"></th>  
  <th><img src = "${pageContext.request.contextPath}/img/<c:out value="${pcHandImage}"/>"></th>  
</tr>
<tr>
  <th><input type="submit" name="hand" value="${userHand}" ></th>
  <th><input type="submit" name="hand" value="${pcHand}" ></th>
</tr>
<tr>
  <td>${judge1}<br></td>
</tr>
<tr>
  <td>${judge2}</td>
</tr>
</table>
</body>
</html>