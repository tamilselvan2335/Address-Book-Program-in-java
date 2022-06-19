package project;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {

	       String[][] address_book=new String[1000][5];
           Scanner sc = new Scanner(System.in);
           
           static boolean regex_count=true;
   
	public void add_contact(int row) {
		
		System.out.println("Total contact count ["+row+"]\n");			
		
		System.out.println("Enter name:");
		address_book[row-1][0]=sc.nextLine();
		
	while(regex_count) {
		System.out.println("Enter Phone number 1:");
		String input=sc.nextLine();	//siva//tamil
			 boolean tf1=regex_num(input);
			 if(tf1==true) {
				 address_book[row-1][1]=input;
				regex_count=false;
			 }
			 else {System.out.println("please enter a valid Phone number!");}
	     }//end
	regex_count=true;
	
	while(regex_count) {
		System.out.println("Enter mail id 1:");
		String input=sc.nextLine();	
			 boolean tf1=regex_mail(input);
			 if(tf1==true) {
				 address_book[row-1][3]=input;
				regex_count=false;
			 }
			 else {System.out.println("please enter a valid email address!");}
	     }//mail end
	regex_count=true;
	
		
		System.out.println("Enter [save] or [cancel]:");
		String save=sc.nextLine();
		if(save.equals("save")) {
		  System.out.println("saved successfully !!!");
	   // System.out.println(address_book[row-1][0]);

		}
		else if(save.equals("cancel")) {
			for(int i=0;i<address_book[row-1].length;i++) {
				address_book[row-1][i]=null;
			}
		}
	}
	
	public void display_contact() {
		// TODO Auto-generated method stub
		int count=1;
			for(int i=0;i<address_book.length;i++) {
				if(address_book[i][0]!=null) {
					System.out.println();
					System.out.println("AVAILABLE COUNT-["+count+"]");
					System.out.println("\nName:");
					System.out.println(address_book[i][0]);
					
					System.out.println("\nPhone number 1:");
					System.out.println(address_book[i][1]);
					
					if(address_book[i][2]!=null) {
					System.out.println("\nPhone number 2:");
					System.out.println(address_book[i][2]);}
					
					System.out.println("\nmail id 1:");
					System.out.println(address_book[i][3]);
					
					if(address_book[i][4]!=null) {
					System.out.println("\nmail id 2:");
					System.out.println(address_book[i][4]);}
					count++;
			   }	
			}
		}
	
	public int search_contact(String enter) {
	    	  boolean count=true;
			    boolean not_available=true;
			    int available_Count=0;
			    System.out.println("Enter-->[name]or[phone number]or[mail_id]");
			    String Enter=sc.nextLine();
		    	for(int i=0;i<address_book.length;i++){
		    		for(int j=0;count&&j<(address_book[i].length);j++) {
		    		if(Enter.equals(address_book[i][j])){
		    			available_Count=available_Count+1;
			        System.out.println("<------AVAILABLE COUNT-["+available_Count+"]------>");
			        System.out.println("\nname:");
					System.out.println(address_book[i][0]);
					
					System.out.println("\nPhone number 1:");
					System.out.println(address_book[i][1]);
					
					if(address_book[i][2]!=null) {
					System.out.println("\nPhone number 2:");
					System.out.println(address_book[i][2]);}
					
					System.out.println("\nmail id 1:");
					System.out.println(address_book[i][3]);
					
					if(address_book[i][4]!=null) {
					System.out.println("\nmail id 2:");
					System.out.println(address_book[i][4]);}
						    												
				     not_available=false;
				     count=false;
				     if(enter.equals("edit")||enter.equals("update")) {
				    	 return i;
				     }
		    		}//if    	
		    	}//for j
		    		 count=true;
		    		}//for i
		    	    if( not_available){
		    		System.out.println("<------CONTACT NOT AVAILABLE------>");
	                }
		    	    return -1;
	        }
	
	public void edit_contact(int i,int num) {
		
		     if(num==0||num==1) {
		         System.out.println("Enter name:");
		         address_book[i][0]=sc.nextLine();
		       }
		     if(num==0||num==2) {
		    	 while(regex_count) {
		    		 System.out.println("Enter phone number 1:");
		    			String input=sc.nextLine();	
		    				 boolean tf1=regex_num(input);
		    				 if(tf1==true) {
		    					 address_book[i][1]=input;
		    					regex_count=false;
		    				 }	
		    				 else {System.out.println("please enter a valid Phone number!");}
		    		     }
		    		regex_count=true;
		       } 
             if(num==0||num==3) {
            	 while(regex_count) {
            		 System.out.println("Enter phone number 2:");
		    			String input=sc.nextLine();	
		    				 boolean tf1=regex_num(input);
		    				 if(tf1==true) {
		    					 address_book[i][2]=input;
		    					regex_count=false;
		    				 }	
		    				 else {System.out.println("please enter a valid Phone number!!");}
		    		     }
		    		regex_count=true;
               }
             if(num==0||num==4) {
            	 while(regex_count) {
            		 System.out.println("Enter mail id 1:");
            			String input=sc.nextLine();	
            				 boolean tf1=regex_mail(input);
            				 if(tf1==true) {
            					 address_book[i][3]=input;
            					regex_count=false;
            				 }
            				 else {System.out.println("please enter a valid email address!");}
            		     }
            		regex_count=true; 
            	
               }
             if(num==0||num==5) {
            	 while(regex_count) {
            		 System.out.println("Enter mail id 2:");
            			String input=sc.nextLine();	
            				 boolean tf1=regex_mail(input);
            				 if(tf1==true) {
            					 address_book[i][4]=input;
            					regex_count=false;
            				 }
            				 else {System.out.println("please enter a valid email address!");}
            		     }
            		regex_count=true; 
               
		   }
		}
	
	public void update_contact(int i) {
		while(regex_count) {
			System.out.println("Enter phone number 2:");
   			String input=sc.nextLine();	
   				 boolean tf1=regex_num(input);
   				 if(tf1==true) {
   					address_book[i][2]=input;
   					regex_count=false;
   				 }	
   				 else {System.out.println("please enter a valid Phone number!!");}
   		     }
   		regex_count=true;
		
   		while(regex_count) {
   			System.out.println("Enter mail id 2:");
   			String input=sc.nextLine();	
   				 boolean tf1=regex_mail(input);
   				 if(tf1==true) {
   					address_book[i][4]=input;
   					regex_count=false;
   				 }
   				 else {System.out.println("please enter a valid email address!");}
   		     }
   		regex_count=true; 
		
	}
	private  boolean regex_num(String input) {
		// TODO Auto-generated method stub
	    Pattern regex = Pattern.compile("[6-9][0-9]{9}");
	    Matcher matcher = regex.matcher(input);
	    boolean present=matcher.find();
	    return present;
   }
	
	private  boolean regex_mail(String input) {
		// TODO Auto-generated method stub
	    Pattern regex = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
	    Matcher matcher = regex.matcher(input);
	    boolean present=matcher.find();
	    return present;
   }

}
