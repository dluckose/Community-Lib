<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
	<style>

.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}

#login-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
</style>

<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>

<div class="container">

	<div id="login-box" class="starter-template">
	<h3>Login to Library</h3>
	  	 <form:form method="POST" action="existsUser" commandName="userform">  

 
 	 	  <table>
			<tr>
				<td style="padding:5px">User:</td>
				<td style="padding:5px"><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td style="padding:5px">Password:</td>
				<td style="padding:5px"><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td><input name="submit" type="submit" value="Login"></td>
			<td>New user <a href="/registration"> Register here</a></td>
			
			</tr>
			
			
		  </table>

</form:form>  
	</div>
	<!-- /.container -->

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>