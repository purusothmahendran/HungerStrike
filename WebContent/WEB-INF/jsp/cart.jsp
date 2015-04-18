<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <div align="center">
            <table border="1">
            	<th>no</th>
                <th>orderid</th>
                <th>itemid</th>
                <th>qty</th>
                 
                <c:forEach var="list" items="${list}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${list.orderid}</td>
                    <td>${list.itemid}</td>
                    <td>${list.quantity}</td>
                             
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>