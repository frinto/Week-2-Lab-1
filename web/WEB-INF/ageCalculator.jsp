<%-- 
    Document   : ageCalculator
    Created on : Sep 18, 2017, 9:33:14 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <div>
            <form action="ageCalculator" method="get">
                Enter Current Age: <input type="number" name="age" value="${age}">
                <input type="submit" value="Age next birthday">
            </form>
            
        </div>
        ${errorMessage}
        ${successMessage}
    </body>
</html>
