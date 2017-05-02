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
    
        <form:form  method="post" commandName="bookForm">
             <table border="0">
              <tr>
                <td colspan="2" align="center"><h2>Book Donation Success!</h2></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <h3>Thank you. Here's the book you donated</h3>
                </td>
            </tr>  
             <tr>
                    <td>Title:</td>
                    <td>${bookForm.title}</td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>