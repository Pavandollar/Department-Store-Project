package com;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Departmentalstore {
 Scanner scan=new Scanner(System.in);
 LinkedHashMap<Integer,Product> db=new LinkedHashMap<Integer,Product>();
 int totalBill=0;
 public void addProduct()
 {
	 db.put(1,new Product("chocolates",10,20));
	 db.put(2,new Product("Biscuits",15,10));
	 db.put(3,new Product("chocolates",20,30));
	 
 }
 public void displayproduct()
 {
	 Set<Integer> keys=db.keySet();
	 for(int key:keys)
	 {
		 Product p=db.get(key);
		 System.out.println("enter "+key+" to order  "+p.getName());
		 System.out.println("-------------------------------------");
		 System.out.println("Available quantity  "+p.getQuantity()+" cost  "+p.getCost());
	 }
 }
	 public void buyproduct()
	 {
		 System.out.println("Enter choice");
		 int choice=scan.nextInt();// choice-->key
			Product p=db.get(choice);//getting the product based on key
		 if(p!=null)
		 {
			 System.out.println("Enter choice");
			 int qty=scan.nextInt();
			 if(qty<=p.getQuantity())
			 {
				 int productCost=qty*p.getCost();
				 totalBill=totalBill+productCost;
				 p.setQuantity(p.getQuantity()-qty);
				 System.out.println("orederd"+qty+" "+p.getName()+"at the cost of Rs."+productCost);
				 System.out.println("Total Bill as of now:"+totalBill);
			 }
			 else
			 {
				 try
				 {
					 String message="Invalid Quantity"+p.getName()+"are not availble";
					 throw new InvalidQuantityException(message);
				 }
				 catch(Exception e)
				 {
					 System.out.println(e.getMessage());
				 }
			 }
	 }
		 else
		 {
			 try
			 {
				 throw new InvalidChoiceException("Invalid choice,kindly enter valid choice");
			 }
			 catch(Exception e)
			 {
				 System.out.println(e.getMessage());
			 }
		 }
	 }
		 public void checkOut()
		 {
			 System.out.println("Total Bill:Rs."+totalBill);
			 System.out.println("Thank you for shopping");
			 
 }
}
