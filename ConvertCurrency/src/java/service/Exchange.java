
package service;


import Interface.InterExchange;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.user;


public class Exchange implements InterExchange{
double d=0, r=0;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public Exchange(){
    }
    
@Override
    public void Login(user us){
        if(r2Dollar(us)!=0){
           this.Authorise(us);
        }
       if(Ruppee2D(us)!=0){
            this.Authorise(us);
        }
        else{
            us.setErrorMessage("Please check what you mentioned !!");
        }
    }
    

    @Override
    public void Authorise(user us) {
    try {
        
        us.getResponse().sendRedirect("welcome");
    } catch (IOException ex) {
        Logger.getLogger(Exchange.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    }

    @Override
     public   double r2Dollar( user us ){
         
       try{
         r=Double.valueOf(us.getAmout());
         r=r/75.835;
         r= Double.valueOf(df.format(r));
        
       
       }catch(Exception w){
           
       }
        return Double.valueOf(df.format(r));
     }
    @Override
    public   double Ruppee2D( user us){ 
       try{
       d=Double.valueOf(us.getAmout());
        d=d*75.835;
        d=Double.valueOf(df.format(d));
        }catch(Exception w){
         //  return  false;
       }
        return Double.valueOf(df.format(d));
    }

//    @Override
    public  String GetValueOfResult(user us) {
        String result ="";
        if(r2Dollar(us)!=0 ||  Ruppee2D(us)!=0 ){
            result= us.getResult();
           return result;
        }
        return  result;
         }
}
