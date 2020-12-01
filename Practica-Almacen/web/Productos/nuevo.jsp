<%-- 
    Document   : nuevo
    Created on : 19/11/2020, 10:06:52 a. m.
    Author     : Fenix
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Almacen</title>
    </head>
    <body>
        <h1>Nuevo registro</h1>


        <a href="ProductosController?accion=volver">volver</a>

        <form action="action" method="POST">


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
