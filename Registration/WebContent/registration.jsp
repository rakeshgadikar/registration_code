
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http- equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>

<body bgcolor="">

<form action="reg" method="post">
<p align="center"><B>REGISTRATION FORM</B></p>
<pre><p>Username   <input type="text" name="Username" maxlength="15"/><sup>(*)</sup>             Firstname <input type="text" name="Fname" maxlength="15"/>              Lastname <input type="text" name="Lname" maxlength="15"/></p></pre>
<hr>
<pre><p>Email-id   <input type="text" name="Emailid" maxlength="15"/>('@ex.com')   Mobile <tt>+91</tt> <input type="text" name="mobile"maxlength="10"/>                   Age <input type="text" name="Age" size="3" maxlength="3"/><sub>(0-9)</sub></p></pre > 
<hr>
<pre><br>Address<tt>(Office/Home)</tt>  <textarea rows="2" cols="50" name="Address"></textarea></pre>
<pre><br>city       <input type="text" name="city" maxlength="15"/>                     zip <input type="text" name="zip" value="" maxlength="15"/></pre>
<hr>
<pre>Password         <input type="password" name="password"maxlength="15"/><tt>(*)</tt></pre>
<pre>Confirm Password <input type="password" name="password1"/><tt>(*)</tt></pre>
<hr>
<pre><p>                                                          <input type="submit" value="submit"/></p></pre>

</form>
</body>
</html>
