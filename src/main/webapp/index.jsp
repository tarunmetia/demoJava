<html>
<head>

<link href="StaticResorces/bootstrap-5.2.3-dist/bootstrap-5.2.3-dist/css/bootstrap.min.css" rel="stylesheet">  
<link href="StaticResorces/bootstrap-5.2.3-dist/bootstrap-5.2.3-dist/css/bootstrap.css" rel="stylesheet">  

<link href="StaticResorces/style/Main.css" rel="stylesheet">   
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="main-content">
				<h1>Login</h1>
				<div>
					<form action="<%=request.getContextPath()%>/LogInAction" method="post">	
						<div class="container">				
							<div class="row">
								<div class="col-md-6 text-right">
									Enter your user name
								</div>
								<div class="col-md-6 text-left">
									<input type="text" name="uname" />
								</div>
							</div>	
						</div>	
						<div class="container">		
							<div class="row">
								<div class="col-md-6 text-right">
									Enter your password
								</div>
								<div class="col-md-6 text-left">
									<input type="text" name="pwd" />
								</div>
							</div>						
						</div>	
					<p>
						<input type="submit" value="Login" class="btn btn-primary"/>
					</p>
					
					</form>
					<a href="Reg.jsp">Registration</a>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
