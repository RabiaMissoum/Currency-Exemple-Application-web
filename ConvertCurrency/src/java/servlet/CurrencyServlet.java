
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import model.user;
import service.Exchange;
import Interface.InterExchange;

@WebServlet(urlPatterns={"/Login"})
public class CurrencyServlet extends  HttpServlet {
    
    private  InterExchange inX;
    
    
    public CurrencyServlet(){
     inX = new Exchange(); 
    
    }
    
    
   String message="Change Happened Succssfuly";
  
    public void HTML(HttpServletRequest request, HttpServletResponse response) throws IOException{
  user us = new user();
    
   us.setAmout(request.getParameter("amout"));
    us.setType(request.getParameter("type"));
     us.setResult(request.getParameter("result"));
  
  String html="";
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        html+="<html>" ;
         html+="<head>" ;
          html+="<title> Result </title>" ;
          html+="</head>" ;
           html+="<body>" ;
           html+="<center>" ;
           html+="<h1 >"+ this.message+"</h1>";
            html+="<form  >";

            try{
           
             if(us.getType().equals("r2d")){
              
               html+="<h3>"+ " Ruppee = "+inX.Ruppee2D(us)+"  Dollar </h3>";
          }
             if(us.getType().equals("d2r")){
               html+="<h3>"+ " Dollar = "+inX.r2Dollar(us) +"  Ruppe </h3>";
          }
            }catch(Exception w){
                us.setErrorMessage(" Some wrong");
            }
               html+="</form>" ;
             html+="</center>" ;
             html+="</body>" ;
         html+="</html>" ;
            
         out.println(html);
       
    }
    protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
      this.message="Change Happened Succssfuly for get";
      this.HTML(request, response);
       user us= new user();
      
//       us.setAmout(request.getParameter("amout"));
//       us.setResult(request.getParameter("result"));
//       us.setType(request.getParameter("type"));
//       
//       us.setRequest(request);
//       us.getResponse();
     
     
    }
    
    @Override
      protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
      
        PrintWriter out = response.getWriter();
       this.message="Change Happened Succssfuly for Post" ;
       
      user us= new user();
      
       us.setAmout(request.getParameter("amout"));
       us.setResult(request.getParameter("result"));
       us.setType(request.getParameter("type"));
       
       us.setRequest(request);
       us.getResponse();
     
//       inX.Login(us);
     
       this.HTML(request, response);
        
    }
  
}
