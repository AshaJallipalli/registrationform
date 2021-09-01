<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
	<link rel="stylesheet" type="text/css" href="regs.css"> 
</head>
<body>
	<h1>Registration Form</h1>
	<div class="reg">
		<form id="reg" method="post" action="SimpleRegistration">


			<label><b>First Name :</b></label> 
			<input type="text" name="firstname" id="firstname" placeholder="First Name" /> 
			<br><br> 
			<label><b>Middle Name :</b></label> 
			<input type="text" name="middlename" id="middlename" placeholder="Middle Name" /> 
		    <br><br> 
			<label><b>Last Name :</b></label> 
			<input type="text" name="lastname" id="lastname" placeholder="Last Name"/> 
			<br><br> 
			<label><b>Email Id :</b></label> 
			<input type="text" name="emailid" id="email" placeholder="Email Id" /> 
			<br><br> 
			<label><b>Password :</b></label> 
			<input type="password" name="password" id="password" placeholder="Password" /> 
			<br><br> 
			<label><b>Address :</b></label> 
			<input type="text" name="address" id="address" placeholder="Address" />
			<br><br> 
			<label><b>Contact No :</b></label> 
			<input type="text" name="contact" id="contact" placeholder="Contact No" /> 
			<br><br>
			 <input type="submit" value="submit" />
		</form>
	</div>
</body>
</html>