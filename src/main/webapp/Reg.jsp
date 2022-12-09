<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="StaticResorces/bootstrap-5.2.3-dist/bootstrap-5.2.3-dist/css/bootstrap.min.css" rel="stylesheet">  
<link href="StaticResorces/bootstrap-5.2.3-dist/bootstrap-5.2.3-dist/css/bootstrap.css" rel="stylesheet">  

<link href="StaticResorces/style/Main.css" rel="stylesheet">   
</head>
<body>
	<div class="container">
		<div class="row">
		<div class="main-content">
			<h1>Registration</h1>
			<div class="error">			
				<%
				if (session.getAttribute("Error") == "error") {
					out.println("Error - something went wrong");
					out.println("load first");
				}
				%>
			</div>
			<form action="<%=request.getContextPath()%>/register" method="post">			
				<div class="container">
					<div class="row">
						<div class="col-md-6 text-right">
							First name
						</div>
						<div class="col-md-6 text-left">
							<input type="text" name="fname" />
						</div>
					</div>
				</div>			
				<div class="container">
					<div class="row">
						<div class="col-md-6 text-right">
							Last name
						</div>
						<div class="col-md-6 text-left">
							<input type="text" name="lname">
						</div>
					</div>
				</div>			
				<div class="container">
					<div class="row">
						<div class="col-md-6 text-right">
							Email
						</div>
						<div class="col-md-6 text-left">
							<input type="text" name="email">
						</div>
					</div>
				</div>	
				<div class="container">
					<div class="row">
						<div class="col-md-6 text-right">
							Select Username
						</div>
						<div class="col-md-6 text-left">
							<input type="text" name="uname">
						</div>
					</div>
				</div>
				<div class="container">
					<div class="row">
						<div class="col-md-6 text-right">
							Select Password
						</div>
						<div class="col-md-6 text-left">
							<input type="text" name="pwd">
						</div>
					</div>
				</div>
				<p>
					<input type="submit" value="go" class="btn btn-primary"/>
				</p>
			</form>
			<a href="index.jsp">Login</a>
		
		</div>
		</div>
	</div>
</body>
</html>