<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Registration</title>
</head>
<body>
    <div align="center">
    
        <form:form action="/addBook" method="get" commandName="userForm">
             <table border="0">
              <tr>
                <td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <h3>Thank you for registering! Here's the review of your details:</h3>
                </td>
            </tr>    <tr>
                    <td>User Name:</td>
                  <td>${userForm.fname}</td>
                </tr>
                <tr>
                    <td>LastName:</td>
                    <td>${userForm.lname}</td>
                </tr>
                <tr>
                    <td>Type:</td>
                    <td>${userForm.type}</td>
                </tr>
                <tr>
                    <td>address:</td>
                    <td>${userForm.address_1}</td>
                </tr>
                 <tr>
                    <td>address:</td>
                    <td>${userForm.address_2}</td>
                </tr>
                 <tr>
                    <td>zip:</td>
                    <td>${userForm.zip}</td>
                </tr>
                 <tr>
                    <td colspan="2" align="center"><input type="submit" value="Add Books" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>