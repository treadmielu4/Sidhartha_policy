<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>My Profile</title>
<style>
.navbar{
background-color:#00b3b3;
font-color: white;
}
.head1 {
	color: white;
	font-size: 30px;
}

.container {
	width: 40%;
	height: 500px;
	position: absolute;
	top: 80px;
	left: 200px
}

.head2 {
	font-size: 25px;
}

.para {
	font-size: 20px;
}
</style>
<body>
	<nav>
		<div class="navbar navbar-light bg-dark ">
			<div class="container-fluid">
				<b class="head1">PolicyTools</b>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="welcome"><span class="glyphicon glyphicon-home"> Home</a></li>
					<li><a href="view"> View Policy </a></li>
					<li><a href="lifeInsurance"> Add Policy </a></li>
					<li><a href="home"><span class="glyphicon glyphicon-log-in"> Logout</a></li>

				</ul>

				
			</div>
		</div>
	</nav>

	<div class="container">
		<center>
			<b class="head2">My Profile</b>
		</center>
		<div class="para">
			User Id: ${User.id} </br> Name : ${User.fname} </br> Date of Birth :
			${User.dob} </br> Gender : ${User.gender} </br> Email ID : ${User.email} </br>
			Mobile No : ${User.mobile}
			<br>
			Aadhar no : ${User.aadhar}
		</div>
	</div>

</body>
</html>
