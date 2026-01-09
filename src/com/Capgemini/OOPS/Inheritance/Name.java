package com.Capgemini.OOPS.Inheritance;

public class Name {
     private String fName;
     private String mName;
     private String lName;
	 Name(String fName){
		 this.fName = format(fName);
	 }
	 Name(String fName,String lName){
		 this(fName);
		 this.lName =format(lName);
	 }
	 Name(String fName,String mName,String lName){
		 this(fName,lName);
		 this.mName = format(mName);
	 }
	 
	 String format(String name) {
		 if(name==null || name.isEmpty()) {
			 return null;
		 }
		 return name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
	 }
	 void display() {
		 System.out.println("FirstName: "+fName);
		 if(mName !=null) {
			 System.out.println("middleName: "+mName);
		 }
		 if(lName!=null) {
			 System.out.println("Last Name: "+lName);
		 }
	 }
	 
}
