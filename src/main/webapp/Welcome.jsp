<%@page import="com.data.model.LogInVar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% 
	if(session.getAttribute("uname") == null) {
		response.sendRedirect("index.jsp");
	}
%>
   
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
				Welcome
					<%
					 	LogInVar l1 = (LogInVar)request.getAttribute ("uname");
						out.println(l1);
					%>
					<form action="<%=request.getContextPath()%>/LogOut">
						<input type="submit" value="Logout" />
					</form>
			</div>
		</div>
	</div>
</body>
</html>