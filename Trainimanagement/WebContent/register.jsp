<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form"
     prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<sf:form action="registeruser.obj" modelAttribute="traineeBean">
Trainee ID :<sf:input path="tid"></sf:input><br><br>
Treainee Name :<sf:input path="tname"></sf:input><br><br>
Traini Location : <sf:radiobutton path="city" value="Chennai"></sf:radiobutton>Chennai
<sf:radiobutton path="city" value="banglore"></sf:radiobutton>Banglore
<sf:radiobutton path="city" value="pune"></sf:radiobutton> Pune
<sf:radiobutton path="city" value="mumbai"></sf:radiobutton> Mumbai<br><br>
Traini Domain :<select name="domain">
  <option value="selectdomain">select Domain</option>
  <option value="java">java</option>
  <option value="dotnet">dotnet</option>
  <option value="MVC">MVC</option>
  <option value="MainFrame">MainFrame</option>
</select><br><br>
<input type="submit" value="Add traini">
</sf:form>
</body>
</html>