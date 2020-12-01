<%-- 
    Document   : modificar
    Created on : 19/11/2020, 10:06:42 a. m.
    Author     : Fenix
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Modificar</h1>

        <form action="action" method="POST">

                <input type="hidden" name="id" id="id">

            <p>
                codigo:

                <input type="text" name="codigo" id="codigo">

            </p>

            <p>
                Nombre:

                <input type="text" name="nombre" id="nombre">

            </p>

            <p>
                Precio:

                <input type="text" name="precio" id="precio">

            </p>

            <p>
                Existencia

                <input type="text" name="existencia" id="existencia">

            </p>

            <button type="submit"  id="guardar" name="guardar" >Guardar </button>
        </form>


    </body>
</html>
