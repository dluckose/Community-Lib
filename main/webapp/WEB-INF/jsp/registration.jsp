<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
    <div align="center">
    
        <form:form action="/registration" method="post" commandName="userForm">
             <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Community Library -User Registration</h2></td>
                </tr>
                <tr>
                    <td>User Name:</td>
                    <td><form:input path="fname" /></td>
                </tr>
                <tr>
                    <td>LastName:</td>
                    <td><form:input path="lname" /></td>
                </tr>
                <tr>
                    <td>Admin:</td>
                    <td><form:input path="admin" /></td>
                </tr>
                <tr>
                    <td>Type:</td>
                    <td><form:input path="type" /></td>
                </tr>
                <tr>
                    <td>address:</td>
                    <td><form:input path="address_1" /></td>
                </tr>
                 <tr>
                    <td>address:</td>
                    <td><form:input path="address_2" /></td>
                </tr>
                 <tr>
                    <td>zip:</td>
                    <td><form:input path="zip" /></td>
                </tr>
                 <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>