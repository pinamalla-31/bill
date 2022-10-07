package com.test.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.connect.db.ConnectionFactory;


public class Product_info implements ProductDao {

	@Override
	public void displayElectronics() {
		try {
			
			Connection connection =ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs= statement.executeQuery("select * from `Product_info`.electronics");
			while(rs.next())
			{
				//System.out.println("product id is:"+"\t"+"product_name:"+"\t"+"Product_price"+"\t"+"Product_quanty"+"\t"+"product_description");
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
		
	}

	@Override
	public void diplayKitchen() {
		
try {
			
			Connection connection =ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs= statement.executeQuery("select * from `Product_info`.kitchen");
			while(rs.next())
			{
			//	System.out.println("product id is:"+"\t"+"product_name:"+"\t"+"Product_price"+"\t"+"Product_quanty"+"\t"+"product_description");
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getDouble(4)+" "+rs.getString(5)+" "+rs.getString(6));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void displayCloths() {
		
try {
			
			Connection connection =ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs= statement.executeQuery("select * from `Product_info`.cloth_store");
			while(rs.next())
			{
				//System.out.println("product id is:"+"\t"+"product_name:"+"\t"+"Product_price"+"\t"+"Product_quanty"+"\t"+"product_description");
				System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getDouble(5)+" "+rs.getString(6));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

	@Override
	public void displayBath() {
		// TODO Auto-generated method stub
try {
			
			Connection connection =ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs= statement.executeQuery("select * from `Product_info`.bath");
			while(rs.next())
			{
			//	System.out.println("product id is:"+"\t"+"product_name:"+"\t"+"Product_price"+"\t"+"Product_quanty"+"\t"+"product_description");
				System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getDouble(5)+" "+rs.getString(6));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}

	
	

	

