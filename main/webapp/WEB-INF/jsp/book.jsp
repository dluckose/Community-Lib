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
    
        <form:form action="/donate" method="post" commandName="bookForm">
             <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Add Book</h2></td>
                </tr>
                <tr>
                    <td>Book Name:</td>
                    <td><form:input path="title" /></td>
                </tr>
                <tr>
                    <td>Author:</td>
                    <td><form:input path="author" /></td>
                </tr>
                <tr>
                    <td>ISBN:</td>
                    <td><form:input path="bookisbnno" /></td>
                </tr>
                 <tr>
                    <td>Academic class:</td>
                    <td><form:input path="academicclass" /></td>
                </tr>
                 <tr>
                    <td>Genre:</td>
                    <td><form:input path="genre" /></td>
                </tr>
                 <tr>
                    <td colspan="2" align="center"><input type="submit" value="OK" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>