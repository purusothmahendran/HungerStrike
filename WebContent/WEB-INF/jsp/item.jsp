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
        <form name = "itemselection" action ="order.html?userId=pxu111111&&resId=subway1" method="post">
            <table border="1">
                <th>No</th>
                <th>itemName</th>
                <th>PrepTime</th>
                <th>price</th>
                <th>Quantity</th>
                 
                <c:forEach var="item" items="${itemsList}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${item.description}</td>
                    <td>${item.preptime}</td>
                    <td>${item.price}</td>
                    <td><input type="text" value = "0" name="qty"></input></td>
                    <td><input type="checkbox" name="item"  value=${item.itemId} style="display:none" checked></input></td>
                             
                </tr>
                </c:forEach>             
            </table>
            <input type="submit" value="Add to Cart">
            </form>
        </div>
    </body>
</html>