<%@page import="Interface.InterExchange"%>
<%@page import="service.Exchange"%>
<%@page import="model.user"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
  user us= new user();
  us.getRequest();
  us.getResponse();
  us.setAmout(request.getParameter("amout"));
   us.setType(request.getParameter("type"));
   us.setResult(request.getParameter("result"));
   
  InterExchange InterEx = new Exchange();
  
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link type="text/css"  rel="stylesheet" href="css/default.css" />
        <title>Exchange Rate Of SGD</title>
       
    </head>
    <body>
       <center >
        <h2>  Exchange Rate of Singapore Dollar (SGD) </h2>
       
        <div id="profile">
            <form method="post" >
            <b >  Enter Account  </b>  <input class="amout" type="text" name="amout"/><br/>
            <b >  View Result  </b>  <input id="CURRENCY"  class="result" type="text" name="result" /><br/><br/>
           
            <b >  Select Conversion type </b>  
            <input class="r2d" type="radio" name="type" value="r2d" checked/> Rupee to Dollar (SGD)<br/>
            <input class="d2r" type="radio" name="type" value="d2r" > Dollar (SGD) to Rupee <br/><br/>
           <input type="submit" value="Convert"> 
            &nbsp;&nbsp;&nbsp;  <input type="reset" > 
        </form>
             <script   src="script.js"></script>
        </div>
    </center> 
    </body>
</html>
