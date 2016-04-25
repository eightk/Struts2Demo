<%-- 
    Document   : login
    Created on : 23-Apr-2016, 4:19:23 PM
    Author     : huico
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <s:form action="login">
            <s:textfield label="Login ID" key="userId"/>
            <s:password label="Password" key="password"/>            
            <s:submit/>
        </s:form>
    </body>
</html>
