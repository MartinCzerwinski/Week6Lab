<%-- 
    Document   : login
    Created on : Oct 16, 2017, 8:22:39 AM
    Author     : 727525
--%>

<%@tag description="login page" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="username"%>
<%@attribute name="password"%>
<%@attribute name="rememberMe"%>
<%@attribute name="message"%>

<h1>Login</h1>

<form action="Login" method="POST"> 
    Username:
    <input type="text" name="username" value="${username}">
    <br>Password:
    <input type="text" name="password" value="${password}">
    <br>
    <input type="submit" value="Login">
    <br>
    <input type="checkbox" name="rememberMe" value="rememberMe" ${rememberMe}>Remember Me
</form>
<br>${message}