<%-- 
    Document   : index
    Created on : 19/11/2020, 10:04:30 a. m.
    Author     : Fenix
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Productos!</h1>


        <a href="controlador/Controller?menu=nuevo">Nuevo Producto</a>


        <table border="1" width="80%">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Nombre</th>
                    <th>Precio</th>
                    <th>Existencia</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>

                <c:forEach var="producto" items="${lista}">

                    <tr>


                        <<td> <c:out value="${producto.codigo}" /></td>
                        <<td> <c:out value="${producto.nombre}"/></td>
                        <<td> <c:out value="${producto.precio}"/></td>
                        <<td> <c:out value="${producto.existencia}"/></td>
                        <<td> <c:out value="${producto.id}"/></td>
                        <<td> <c:out value="${producto.id}"/></td>
                    </tr>

                </c:forEach>


            </tbody>
        </table>


    </body>
</html>
