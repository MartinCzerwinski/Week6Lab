<%-- 
    Document   : login
    Created on : Oct 2, 2017, 8:27:43 AM
    Author     : 727525
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="myLogin" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sait" uri="/WEB-INF/tlds/sait.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
    <sait:Debug>
        Remote Host: ${pageContext.request.remoteHost}<br />
        Session ID: ${pageContext.session.id}
    </sait:Debug>
    <myLogin:login username="${username}" password="${password}" message="${message}" rememberMe="${rememberMe}"/>
</body>
</html>
