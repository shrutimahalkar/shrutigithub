<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="save" method="post" modelAttribute="command1">
Enter Name
<input type="text" name="username"></br>
Select Department
<select name="department">
<option value="java" >JAVA</option>
<option value="IOS" >IOS</option>
<option value="android" >ANDROID</option>
<option value="php" >PHP</option>
</select> </br>
Enter Email
<input type="text" name="email"></br>
Enter password
<input type="password" name="pass"></br>

<input type="submit">

</form>

</body>
</html>