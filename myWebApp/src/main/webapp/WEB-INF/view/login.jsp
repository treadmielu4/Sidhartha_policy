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
<title>login</title>
<style>
.navbar{
background-color:#00b3b3;
font-color: white;
}
.container
{
width:40%;
height:400px;
position:absolute;
top:80px;
left:200px
}
.head1{
color: white; 
font-size:30px;

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
color:red;

}
</style>

</head>
<body>
<nav >
		<div class="navbar navbar-light bg-dark " >
		<div class="container-fluid">
		<b class="head1">PolicyTools</b>
		<ul class="nav navbar-nav navbar-right ">
					<li><a href="/home"> <span class="glyphicon glyphicon-home"> Home </a></li>
					
				</ul>
			</div>
		</div>
	</nav>
	<div class="container" id="logform">
	<b class="head2">LOGIN FROM</b>
	</br>

    <b class="err">${errorMessage}</b>
	 <b class="err">${errorMessage1}</b>
	<form action="welcome" method="post">
  <div class="form-group">
    <label for="mobile">Mobile No:</label>
    <input type="number" class="form-control" name="mobile" path="mobile" required>
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" name="pass" path="pass" required>
  </div>
  
  <button type="submit" class="button button1">Submit</button>
  <button type="reset" class="button button2">Clear </button>
  <center>
  </br>
  Not Registered? <a href="/register">Create an Account </a>
  </br>
  <a href="/forgotpassword">Forgot Password</a>
  </center>
</form>
</div>



</body>
</html>