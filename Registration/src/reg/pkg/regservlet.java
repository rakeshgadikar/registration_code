package reg.pkg;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import reg.pkg.dto.User;

/**
 * Servlet implementation class regservlet
 */
@WebServlet("/reg")
public class regservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static HashMap<String,User> hash=new HashMap<String, User>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
        
        // TODO Auto-generated constructor stub
  
 
    
    public regservlet(){

    	super();
   
    }
    
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String  Username,password,password1,Fname,Lname,Emailid,Age,city,zip,mobile,Address,dispatcher = null;
		 
		 User u=new User();       		 
		 Username=request.getParameter("Username");
		 Fname=request.getParameter("Fname");
     	 Lname=request.getParameter("Lname");
		 Emailid = request.getParameter("Emailid");
		 Age=request.getParameter("Age");
	     password=request.getParameter("password");
	     password1=request.getParameter("password1");
	     city=request.getParameter("city");
	     zip=request.getParameter("zip");
	     Address=request.getParameter("Address");
	    mobile=request.getParameter("mobile");

	     

	     u.setUsername(Username);
    	 u.setAge(Age);
    	 u.setEmailid(Emailid);
    	 u.setFname(Fname);
    	 u.setLname(Lname);
    	 u.setPassword(password);
    	 u.setPassword(password1);
    	 u.setAge(Age);
    	 u.setCity(city);
    	 u.setZip(zip);
    	 u.setAddress(Address);
    	 u.setMobile(mobile);
    	 
    	 
	    if(!validate(u)){
	              	dispatcher = "invalid.jsp";
	    }else{
		       if(!CheckifUserExists(Username)){
		    	 System.out.println("Username doesn exist");
		    	 u.setUsername(Username);
		    	 u.setAge(Age);
		    	 u.setEmailid(Emailid);
		    	 u.setFname(Fname);
		    	 u.setLname(Lname);
		    	 u.setPassword(password);
		    	 u.setPassword(password1);
		    	 u.setAddress(Address);
		    	 u.setMobile(mobile);
		    	 insertIntoHashMap(u);
		    	 dispatcher = "success.jsp";
		     System.out.println("Username " +u.getUsername());
		     request.setAttribute("ser", u);
		       } else {
		    	 dispatcher=("error.jsp");
		     }
	    }
       RequestDispatcher reqDispatcher=request.getRequestDispatcher(dispatcher); 
		reqDispatcher.forward(request,response);   
	     
	}
	     
	     boolean CheckifUserExists(String Username){
			 if(Username!=null)
			 {
				 System.out.println(Username);
				 User u=new User();
				 
				 u=hash.get(Username);
				 
			if(u!= null)
				System.out.println("fname : "+u.getFname());
			
			
				  if(u==null) {
					 
					
					  System.out.println("Inserting into hash " +Username);
					  
					  return false;
				  }
				  return true;
			 } else {
				  System.out.println("Enter a valid name");
				  return true;
			 }
			      
	     }
  
	     User insertIntoHashMap(User u){
	 		System.out.println("insertion into map " +u.getUsername());
	 		hash.put(u.getUsername(), u);
	       return u;
	 	}	  
	     
	
    	boolean validate(User u){
    	boolean	bool=true;
    	
    	 if(u.getFname()!=null && u.getFname().equals(""))
    	 {
    	 System.out.println("Please enter your first name");

     	bool=false;
}	     
	      
	     if ((u.getLname()!=null)&&(u.getLname().equals("")))
    	 {
    	 System.out.println("Please enter your last name");
    	  	 

     	bool=false;
}
	     
	     if ((u.getEmailid()!=null)&&(u.getEmailid().equals("")) || (u.getEmailid().indexOf('@') == -1))
    	 {
    	 System.out.println("Please enter a valid email address");
    	 bool=false;
    	 }
	     if ((u.getAge()!=null)&&(u.getAge().equals("")))
    	 {
    	 System.out.println("Please enter a valid Age");
    	 bool=false;
    	 }
    	  
    	 if ((u.getCity()!=null)&&(u.getCity().equals("")))
    	 {
    	 
		System.out.println("Please enter your city name");
    	 bool=false;
    	 
    	 }
      	 if ((u.getZip()!=null)&&(u.getZip().equals(""))||u.getZip().length() !=6 )
    	 {
    	 System.out.println("Please enter a valid zip code");
    	 bool=false;
    	 }
      	 
      	if ((u.getAddress()!=null)&&(u.getAddress().equals("")))
      	 {
      	 System.out.println("Please enter correct Address");
    	bool=false;
      	 }
      	 
      	
    	if ((u.getMobile()!=null)&&(u.getMobile().equals(""))||u.getMobile().length() !=10 )
     	 {
     	 System.out.println("Please enter contact no");
   	bool=false;
     	 }
     	
      	if ((u.getUsername()!=null)&&(u.getUsername().equals("")))
   	 {
   	 System.out.println("Please enter a username");
 	bool=false;
   	 }
   	  
   	 if ((u.getPassword()!=null)&&(u.getPassword().equals("")))
   	 {
   	 System.out.println("Please enter a valid password");
   	 
 	bool=false;
   	 }

   	 if ((u.getPassword1()!=null)&&(u.getPassword1().equals("")))
   	 {
   	 System.out.println("Please enter a valid password1");
   	 
 	bool=false;
   	 }
   	 
   	 
  if((u.getPassword()!=null&&u.getPassword1()!=null)&&(u.getPassword().equals("")&&u.getPassword1().equals("")))
		   
   	   {
   	 	 System.out.println("Please enter a valid password"); 
	   bool=false; 
	     
	  }
	     
    	 return bool;
}
}