package com.Capgemini.OOPS.Inheritance;

public class Parent {
  String faName,maName;

  public Parent(String faName, String maName) {
	this.faName = faName;
	this.maName = maName;
  }
  public void display() {
	  System.out.println("Parent Name: "+faName+" "+maName);
  }
  
}
