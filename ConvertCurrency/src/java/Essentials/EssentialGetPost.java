
package Essentials;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;


public class EssentialGetPost {
    
   private HttpServletRequest request;
   private HttpServletResponse response;

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }
   

   
   
}
