<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<body>
<table style="width:100%">
  <tr>
    <th>Message</th>
    <th>Date</th> 
    <th>username</th>
  </tr>
  <tr>
    <th>${add.message}</th>
    <th>${add.dateTime}</th> 
    <th>${add.username}</th>
  </tr>
</table>
</body>
</html>