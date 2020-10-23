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
<title>home</title>
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
.head2{
font-size:25px;
}
.button{

  border: none;
  color: white;
  padding: 10px 30px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 5px 4px;
  cursor: pointer;

}
.button1 {
  background-color: white; 
  color: #008CBA; 
  border: 2px solid #008CBA;
}
.button2 {
  background-color: white; 
  color: #F97068; 
  border: 2px solid #F97068;
}
.err{
font-size:25px;
color: red;
}
.err1{
color: red;
}
</style>
<script >
function validatepass()
{
	var userpass = document.getElementById("pass").value;
	var password = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
	 if(!userpass.match(password))
		{
		  alert("It must contain 8 or more characters that are of at least one number, and one uppercase and lowercase letter")
		  return false;
		}
	else
	{
		return true;
	}

</script>
</head>
<body>
	<nav>
		<div class="navbar navbar-light ">
			<div class="container-fluid">
				<b class="head1">PolicyTools</b>

				<ul class="nav navbar-nav navbar-right">
					<li><a href="/register"><span
							class="glyphicon glyphicon-user"></span> Sign Up </a></li>
					<li><a href="/login"><span
							class="glyphicon glyphicon-log-in"></span> Login</a></li>

				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<b class="err">${errorMessage1}</b>
		<form action="Setpassword" method="post">
		<div class="form-group">
			<label for="mobile">Mobile No:</label> <input type="number"
				class="form-control" name="mobile" path="mobile" required>
		</div>

		<div class="form-group">
			<label for="pwd">New Password:</label> <input type="password"
				class="form-control" name="pass" path="pass" onblur="return validatepass()" required>
		</div>

		<div class="form-group">
			<label for="pwd">Confirm Password:</label> <input type="password"
				class="form-control" name="pass1" path="pass1" required>
				<b class="err1">${errorMessage2}</b>
		</div>

		<input type="submit" class="button button1" value="Submit"/>
		<input type="reset" class="button button2" value="Clear"/>
		</form>
	</div>
</body>
</html>
