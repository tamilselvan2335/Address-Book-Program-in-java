package project;

import java.util.Scanner;

public class Address_Book extends Contact {
	static int row=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner input = new Scanner(System.in);
	    
    	System.out.println("ADDRESS BOOK");
    	
    	Address_Book contact=new Address_Book();
		
	     while(true) {	 		

	    	System.out.println(("<----------------------------->\n")+
	 	                       ("Enter--[add]----->Add Contact\n")+
	 	                       ("Enter--[show]-->Display Contact\n")+
	 	                       ("Enter--[edit]---->Edit Contact\n")+
	 	                       ("Enter--[update]---->Update Contact\n")+
	    	                   ("<----------------------------->"));

	 	   String enter=input.nextLine(); 	   
	       
	        
	        if(enter.equals("add")) 
	        {
	        	row=row+1;//1
               contact.add_contact(row);             
            }
	   
	        if(enter.equals("show"))
	        {
		 	   System.out.println(("Enter-->[all]--Display all Contact\n")+
		 	                      ("Enter-->[search]--search Contact"));
		 	   String search=input.nextLine();
		 	   
		 	  if(search.equals("all")) {
		 	     contact.display_contact();
		 	  }
		 	  else if(search.equals("search")) {
		 		 contact.search_contact(enter);
		 	  }
	        }
	        
	        if(enter.equals("edit"))
	        {
	        	int i=contact.search_contact(enter);
	        	if(i!=-1) {
	        	System.out.println(("\nEnter-[0]-Edit all\n")+
	    		                   ("Enter-[1]-Edit name\n")+
	    		                   ("Enter-[2]-Edit phone number 1\n")+
	    		                   ("Enter-[3]-Edit phone number 2\n")+
	    		                   ("Enter-[4]-Edit mail id 1\n")+
	    		                   ("Enter-[5]-Edit mail id 2"));
	    		int num=input.nextInt();
	        	contact.edit_contact(i,num);}
	        }
	        
	        if(enter.equals("update"))
	        {
	          int i=contact.search_contact(enter);
	          if(i!=-1) {
	          System.out.println("---------UPDATE-------");
		 	  contact.update_contact(i);
		 	 
	          }
	       }
	       	     	     
	    }  
	     
	 }
		
}
