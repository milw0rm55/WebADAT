<%-- 
    Document   : index
    Created on : 06-nov-2018, 12:02:12
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html;
charset=UTF-8">
 <title>Inicio</title>
 </head>
 <body>
 <h1>Obtiene la pelicula y su fecha </h1>
 <form action="servelts" method="POST">Presiona el
botón para obtener los datos.
<br>
    <br> Titulo: <input type="text" name="Titulo"><br>
    <br> Fecha: <input type="date" name="date"><br>
    <br> Presupuesto: <input  name="Presupuesto" type="number" step="0.01"><br><br>
 <input type="submit" name="enviar" value="Enviar"/>
 </form>
 
 <form action="servelts" method="POST">Presiona el
botón para obtener los datos.
<br>
    <br> Titulo: <input type="text" name="Titulo"><br>
    <br> Fecha: <input type="date" name="date"><br>
    <br> Presupuesto: <input  name="Presupuesto" type="number" step="0.01"><br><br>
 <input type="submit" name="enviar" value="Enviar"/>
 </form>
 </body>
</html>

