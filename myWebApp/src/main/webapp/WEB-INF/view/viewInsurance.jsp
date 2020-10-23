<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>View Insurance</title>
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
.para{
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
<div>
<h3>Life Insurance</h3>

<table border="1" class="table table-hover">
<c:if test="${empty1 == 0}"> ${emptymessage}</c:if>
<c:if test="${empty1 gt 0 }">
<tr>
<th>Policy No</th>
<th>Name</th>
<th>Policy Name</th>
<th>Mode of payment</th>
<th>Maturity Date</th>
<th>Last date of premium</th>
<th>Sum Assured</th>
<th>Premium</th>
<th>No of Premium</th>
<th>Paid Amount</th>
<th>Nominee Name</th>
<th>Relationship</th>
<th>Action</th>
</tr>
<c:forEach var="lifeinsurance" items="${LifeInsuranceList}">
<tr>
<td>${lifeinsurance.lno} </td>
<td>${lifeinsurance.lname}</td>
<td>${lifeinsurance.lpolicy}</td>
<td>${lifeinsurance.lmode}</td>
<td>${lifeinsurance.lmaturitydate}</td>
<td>${lifeinsurance.llastdate}</td>
<td>${lifeinsurance.ltotalamnt}</td>
<td>${lifeinsurance.lpremium}</td>
<td>${lifeinsurance.lnoofpremium}</td>
<td>${lifeinsurance.paid}</td>
<td>${lifeinsurance.lnomini}</td>
<td>${lifeinsurance.lnominireltn}</td>
<td><a href="/edit?lno=${lifeinsurance.lno}&lname=${lifeinsurance.lname}"><span class="glyphicon glyphicon-pencil">Edit</a>
<a href="/pay?lno=${lifeinsurance.lno}&lpolicy=${lifeinsurance.lpolicy}&lpremium=${lifeinsurance.lpremium}&lname=${lifeinsurance.lname}"><span class="glyphicon glyphicon-credit-card">Pay</a>
</td>
</tr>
</c:forEach>
</c:if>
</table>
</div>
</body>
</html>
