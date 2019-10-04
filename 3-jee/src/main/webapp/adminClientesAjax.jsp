<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Clientes Ajax </title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
        //Cuando termina de cargar la pagina actual, se ejectuta la funcion anonima
        $(document).ready(function() {
            $.ajax({
                url:"http://localhost:8080/3-jee/clientes",
                success : function(respuesta) {
                    var clientes= JSON.parse(respuesta);
                 // var clientes = JSON.parse(respuesta);
                    $.each(clientes, function(i) {
                        console.log(clientes[i].nombre);
                        $('#comboClientes').append('<option value="'+clientes[i].idCliente+'">'+clientes[i].nombre+'</option>');

                      });    //each
                    }  //.success
                });  //ajax

            $('#btnguardar').click(function(){ 
                var cliente ={
                        nombre : $('#txtnombre').val(),
                        apaterno : $('#txtapaterno').val(),
                        amaterno : $('#txtamaterno').val(),
                        idCliente : $('#txtidcliente').val(),
                        rfc : $('#txtrfc').val()
                        }
               
                
                
                             
                var json =JSON.stringify(cliente);
               
                $.ajax({
                    url: "http://localhost:8080/3-jee/clientes",
                    type : "post",
                    dataType : "json",
                    contentType: "application/java",
                    data: json, //cadena json
                    success : function(respuesta) {
                        alert(respuesta);
                        }

                    })

                });
                
                 $('#btneliminar').click(function(){ 
                     var idCliente = $('#comboClientes').val();                 
                     $.ajax({
                         url: "http://localhost:8080/3-jee/clientes?idEliminar=" + idCliente,
                         type : "post",
                         //dataType : "json",
                         //contentType: "application/java",
                        // data: json, //cadena json
                         success : function(respuesta) {
                             alert(respuesta);
                        }
                     })
                 });
           });  //ready
</script>
</head>
<body>
            <select id="comboClientes">
                 <option value="0">Selecciona un cliente</option> 
            
            </select>
            <br/>
            <input type="number" id="txtidcliente" value="0" placeholder="ID Cliente..."/> 
            <br/>
            <input type="text" id="txtnombre" placeholder="Nombre..."/> 
            <br/>
            <input type="text" id="txtapaterno" placeholder="A Paterno..."/>
            <br/>
            <input type="text" id="txtamaterno" placeholder="A materno..."/>
            <br/>
            <input type="text" id="txtrfc" placeholder="Rfc..."/>
            <br/>
            <input type="button" value="Guardar" id="btnguardar"/>
            <br/>
            <input type="button" value="Eliminar" id="btneliminar"/>
            
            
</body>
</html>