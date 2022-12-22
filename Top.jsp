<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RPSオンライン</title>
</head>
<body>
<h1>RPSオンライン</h1>
<h3>最初はグー、じゃんけん・・・</h3>
<form action="${pageContext.request.contextPath}/ResultServlet" method="post">
<table>
<tr>
  <th><img src = "${pageContext.request.contextPath}/img/RPS_Rock.png"></th>
  <th><img src = "${pageContext.request.contextPath}/img/RPS_Scissors.png"></th>
  <th><img src = "${pageContext.request.contextPath}/img/RPS_Paper.png"></th>
</tr>
<tr>
  <th><button type="submit" name="hand" value="0">グー</button></th>
  <th><button type="submit" name="hand" value="1">チョキ</button></th>
  <th><button type="submit" name="hand" value="2">パー</button></th>
</tr>
</table>
</form>
</body>
</html>