<%@ page language="java" contentType="text/html"%>
<%@include file="Header.jsp" %>

<%@include file="MyCarouse.jsp" %>
<div class="container">
<form action="<c:url value="/addUser"/>" method="post" >
<table align="center" class="table table-bordered">
	<tr class="info">
		<td colspan="2"><center>user Detail</center></td>
	</tr>
	<tr>
		<td>User Name</td>
		<td><input type="text" name="username" id="username"/></td>
	</tr>
	<tr>
		<td>Address</td>
		<td><input type="text" name="address" id="address"/></textarea></td>
	</tr>
	<tr>
		<td>Email Id</td>
		<td><input type="text" name="emailId" id="emailId"/></td>
	</tr>
	<tr>
		<td>Mobile No</td>
		<td><input type="text" name="moblieNo" id="MoblieNo"/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="password"/></td>
	</tr>
	<tr>
		<td>Role</td>
		<td><input type="text" name="role" id="role"/></td>
	</tr>
	<tr>
		<td>Enabled</td>
		<td><input type="text" name="enabled" id="enabled"/></td>
	</tr>
	<td colspan="2">
		<center>
		<input type="submit" value="add User" class="btn btn-success"/>
		</center>
		</td>
	</tr>
	

</body>
</html>