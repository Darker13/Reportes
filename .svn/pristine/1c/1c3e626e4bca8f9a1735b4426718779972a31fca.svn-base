<%@page session="true" contentType="text/html" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
    <link rel="stylesheet" href="css/css/custom.css">
    <link rel="stylesheet" href="css/css/bootstrap.css">
  <title>Help desk</title>
</head>
<body background="images/fondoindex.JPG" >
  <div class="container">
    <div class="row">
    <div class="col-md-4 col-md-offset-4">
        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title">Iniciar sesion Clinica Vascular Navarra</h3>
        </div>
          <div class="panel-body">
              <form name="regist" action="UsuariosCtrl" method="post" accept-charset="utf-8">
            <!--<form name="regist" action="UsuariosCtrl" method="post" accept-charset="utf-8" role="form">-->
                    <fieldset>
                <div class="form-group">
                  <label>Usuario</label>
                 <!--<input class="form-control"  placeholder="Usuario" name="user" type="text">-->
                  <input type="text" class="form-control"  name="user" title="Por favor ingrese el usuario " placeholder="Usuario" required pattern="[A-Za-z0-9]{4,10}">
              </div>
              <div class="form-group">
                <label>Contraseña</label>
                <!--<input class="form-control" placeholder="Contraseña" name="password" type="password" value="">-->
                <input type="password" class="form-control" name="password" placeholder="Contraseña" required>
              </div>
              
              <input class="btn btn-lg btn-success btn-block" type="submit" value="Login" name="ingreso">
               
            </fieldset>
            	<%
            
            if(request.getParameter("msg")!=null){
           %>
           <div style="color: red">
               <%   
                out.print(request.getParameter("msg"));
               %>
           </div>
                <% } %>
              </form>
          </div>
      </div>
    </div>
  </div>
</div>
</body>
</html>