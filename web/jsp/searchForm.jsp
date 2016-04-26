<%-- 
    Document   : searchForm
    Created on : 23-Apr-2016, 4:01:59 PM
    Author     : huico
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
    </head>
    <body>
        <h1>Search</h1>
        <!--by default it is post-->
        <s:form action="/tutorials/getTutorial">
            <s:textfield label="Enter the language" key="language"/>
            <s:submit/>
        </s:form>
        <!-- normal html version
        <form method="post" action="../tutorials/getTutorial">
            <input id="language" name="language"/>
            <input type="submit"/>
        </form>
        -->
    </body>
</html>
