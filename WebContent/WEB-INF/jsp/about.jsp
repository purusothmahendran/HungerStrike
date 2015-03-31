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
                <th>No</th>
                <th>Itemname</th>
                <th>Price</th>
                 
                <c:forEach var="item" items="${itemsList}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${item.itemName}</td>
                    <td>${item.price}</td>
                             
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>