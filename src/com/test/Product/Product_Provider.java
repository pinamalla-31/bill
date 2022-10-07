package com.test.Product;

import java.util.Scanner;

public class Product_Provider {
	public static void options()
	{
		Scanner scan= new Scanner(System.in);
		 System.out.println("Enter your choice");
		 System.out.println("1.Electronics"+"\n"+"2.Bath"+"\n"+"3.Kitchen"+"\n"+"4.Cloths"+"\n");
		 int choice=scan.nextInt();
		
		 if(choice==1)
		 {
			 
			 electronics();
			 
			 
			
		 }
		 else if(choice==2)
		 {
			 bath();
		 }
		 else if(choice==3)
		 {
			 kitchen();
		 }
		 else if(choice==4)
		 {
			cloths();
		 }
		 
		 else
		 {
			 System.out.println("inavlid section");
		 }
	}
	
	public static void electronics()
	{
		System.out.println("select what you want:");
		System.out.println("1:mobile"+"\n"+"2.ac");
		Scanner sc= new Scanner(System.in);
		int choose= sc.nextInt();
		if(choose==1)
		{
		    
		}
		
	}
	public static void bath()
	{
		System.out.println("select what you want:");
		System.out.println("1.soap"+"\n"+"2.shapoo");
		Scanner sc= new Scanner(System.in);
		int choose= sc.nextInt();
	}
		
	public static void kitchen()
	{
		System.out.println("select what you want:");
		System.out.println("1.salt"+"\n"+"2.sugar");
		Scanner sc= new Scanner(System.in);
		int choose= sc.nextInt();
	}
	public static void cloths()
	{
		System.out.println("select what you want:");
		System.out.println("1:T-shit"+"\n"+"2.saree");
		Scanner sc= new Scanner(System.in);
		int choose= sc.nextInt();
	}
		
		
	public static  void display()
	{
		Product_info product= new Product_info();
		product.displayElectronics();
		
	}
	
	
	
	public static void main(String[] args) {
		options();
		Product_Provider.display();
		
		
	}

}
