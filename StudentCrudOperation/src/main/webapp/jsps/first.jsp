<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student page</title>
</head>
<body>
<center><h1> Welcome to Student page </h1></center>
<form action="addstudent">
Id<input type="number" name="id" /><br>
Name<input type="text" name="name" /><br>
Fees<input type="number" name="fees" /><br>
<input type="submit" value="Add Student">
</form>
<br>
<form action="search">
Id<input type="number" name="id" /><br>
<input type="submit" value="Searchby id">
</form>
<br>
<form action="searchname">
Name<input type="text" name="name" /><br>
<input type="submit" value="Searchby name">
</form>
<br>
<form action="searchfees">
Fees<input type="number" name="fees" /><br>
<input type="submit" value="Searchby fees">
</form>
<a href="show">show all</a>
</body>
</html>