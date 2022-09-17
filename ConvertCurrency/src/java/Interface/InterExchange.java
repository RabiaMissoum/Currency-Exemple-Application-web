
package Interface;

import model.user;


public interface InterExchange {
    
      public void Login(user us);
      public void Authorise(user us);
      public   double r2Dollar( user us);
      public  double Ruppee2D(user us);
       public  String GetValueOfResult(user us);
}
