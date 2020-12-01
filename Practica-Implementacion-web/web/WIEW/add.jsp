
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <title>Hello, world!</title>
    </head>



    <body>
        <form action="controlador" method="POST"   >
            <div class="form-group">
                <label for="ejemplo_email_1">Name</label>
                <input type="text" class="form-control" id="ejemplo_email_1"
                       placeholder="Introduce tu Name" name="Name"> 
            </div>
            <div class="form-group">
                <label for="ejemplo_password_1">Password</label>
                <input type="password" class="form-control" id="ejemplo_password_1"
                       placeholder="Contraseña" name="password">
            </div>

            <div class="form-group">
                <label for="ejemplo_password_1">Email</label>
                <input type="email" class="form-control" id="ejemplo_password_1"
                       placeholder="Introduzca su Email" name="email">
            </div>


            <button type="submit" class="btn btn-default" name="action" value="Agregar">Enviar</button>
        </form>

        <a class="btn btn-primary" href="controlador?action=reguesar" role="button">Reguesar</a>






        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

    </body>
</html>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>
</html>
