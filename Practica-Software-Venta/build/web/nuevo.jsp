<%-- 
    Document   : nuevo
    Created on : 23/11/2020, 2:47:32 p. m.
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

        <form action="Controlador?menu=nuevo" method="POST">
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="inputEmail4">Codigo</label>
                    <input type="text" class="form-control" name="codigo"" >
                </div>
                <div class="form-group col-md-6">
                    <label for="inputPassword4">Nombre</label>
                    <input type="text" class="form-control" name="nombre">
                </div>
            </div>

            <div class="form-row">

                <div class="form-group col-md-6">
                    <label for="inputAddress">Precio</label>
                    <input type="text" class="form-control" name="precio">
                </div>
                <div class="form-group col-md-6">
                    <label for="inputAddress">existencia</label>
                    <input type="text" class="form-control" name="existencia">
                </div>                </div>



            <button type="submit" class="btn btn-primary" name="accion" value="Agregar">Guardar</button>

        </form>



    </body>


</html>
