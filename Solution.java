package com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
	System.out.println("Welcome to Departmental store");
	System.out.println("**********************************");
	Scanner scan=new Scanner(System.in);
	Departmentalstore store=new Departmentalstore();
	store.addProduct();
	int choice=1;
	while(choice==1)
	{
		
	store.displayproduct();
	store.buyproduct();
	System.out.println("=====================================");
	System.out.println("Enter 1 to continue or any other number to checkout");
	}
	store.checkOut();
}
}
