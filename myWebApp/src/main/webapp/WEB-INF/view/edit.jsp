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
</style>
<body>
	<nav>
		<div class="navbar navbar-light ">
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
<b class="head2">Edit detail</b>
<form action="edited">
<input type="text" name="lno" value="${lno}" readonly="readonly">
<input type="text" name="lname" value="${lname}" readonly="readonly">
<div class="form-group">
				<label for="nominee">Nominee Name :</label> <input type="text"
					class="form-control" name="lnomini" path="lnomini" required>
			</div>
			<div class="form-group">
				<label for="nominee relation">Relationship with Nominee :</label>
				<select class="form-control" name="lnominireltn" path="lnominireltn">
					<option>Spouse</option>
					<option>Child</option>
					<option>Father</option>
					<option>Mother</option>
					<option>Sister</option>
					<option>Brother</option>
				</select>
			</div>
		
			<button type="submit" class="button button1">Submit</button>
			<button type="reset" class="button button2">Clear</button>
	
</form>		
</div>

</body>
</html>
