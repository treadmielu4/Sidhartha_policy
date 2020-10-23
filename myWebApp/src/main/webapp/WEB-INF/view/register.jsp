
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
<title>Registration</title>
<style>
.navbar{
background-color:#00b3b3;
font-color: white;
}

.container {
	width: 40%;
	height: 500px;
	position: absolute;
	top: 80px;
	left: 200px
}

.head1 {
	color: white;
	font-size: 30px;
}

.head2 {
	font-size: 25px;
}
.err{
font-size:15px;
color:red;
}
.button {
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
</style>
<script>
function validatemobile()
{
	var usermobile = document.getElementById("mobile").value;
	var mobile= /^\d{10}$/;
	if(usermobile.match(mobile))
		{
		return true;
		}
	else
		{
		alert("Please provide valid mobile number.")
		return false;
		}

}
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
}

</script>
</head>
<body>
	<nav>
		<div class="navbar navbar-light bg-dark">
			<div class="container-fluid">
				<b class="head1">PolicyTools</b>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="/home"> <span class="glyphicon glyphicon-home"> Home </a></li>
					<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
					
				</ul>
			</div>
		</div>
	</nav>
	<div class="container" >
		<b class="head2">SIGNIN FROM</b>
		<form method="post" action="login">
			<div class="form-group">
				<label for="usr" >Name:</label> 
				<input type="text" class="form-control" name="fname"   path="fname" required>
			</div>
			
			<div class="form-group">
				<label for="usr"> Date Of Birth :</label> 
				<input type="date" class="form-control" name="dob"  path="dob" required>
				</div>

				<div class="form-group">
				<label for="gender"> Gender:</label>
					<label class="radio-inline"> 
					<input type="radio" name="gender" value="male" path="gender" checked>Male
					</label> 
					<label class="radio-inline"> 
					<input type="radio" name="gender" value="female" path="gender">Female
					</label>
				</div>
				
				<div class="form-group">
				<label for="aadhar">Aadhar Id :</label> <input type="text"
					class="form-control" name="aadhar" path="aadhar" required>
			</div>
			
			<div class="form-group">
				<label for="mobile">Mobile No:</label> 
				<input type="number" class="form-control" name="mobile" id="mobile" path="mobile" onblur="return validatemobile()" required>
				<b class="err">${Message}</b>
			</div>
			
			<div class="form-group">
                    <label for="email">Email address:</label>
   					<input type="email" class="form-control"  name="email" path="email" required>
 					</div>

			<div class="form-group">
				<label for="password">Password:</label> 
				<input type="password" class="form-control" id="pass" name="pass" path="pass" onblur="return validatepass()" required="required">
			</div>

			<button type="submit" class="button button1">Submit</button>
			<button type="reset" class="button button2">Clear</button>

		</form>
	</div>



</body>
</html>