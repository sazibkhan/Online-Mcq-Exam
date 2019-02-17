<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="<%=request.getContextPath()%>/login" method="post">



		<center>
			<h1>User Email</h1>
			<table>
			

				<tr>
					<td>Email :</td>
					<td><input type="text" name="email" />
				</tr>

			
				<tr>
					<td colspan="2"><center>
							<input type="submit" value="Login" />
						</center></td>
				</tr>
				
					<td>
						<button type="button" class="btn btn-outline-primary">
							<a href="userSignUp.jsp">SignUp </a>
						</button>
					</td>
			</table>
		</center>




	</form>
</body>
</html>