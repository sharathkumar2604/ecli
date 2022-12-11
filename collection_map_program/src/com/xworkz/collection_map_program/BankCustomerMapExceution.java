package com.xworkz.collection_map_program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BankCustomerMapExceution {

	public static void main(String[] args) {


		Bank hdfcBank = new Bank();
		hdfcBank.setBankName("HDFC");
		hdfcBank.setLocation("Mysore");

		Bank sbiBank = new Bank();
		sbiBank.setBankName("SBI");
		sbiBank.setLocation("Mandya");

		Bank karnatakaBank = new Bank();
		karnatakaBank.setBankName("Karnataka Bank");
		karnatakaBank.setLocation("banglore ");

		Customer customer1 = new Customer();
		customer1.setName("Sharath");
		customer1.setAccNo("HDFC520101000482l");
		customer1.setLocation("Mysore");

		Customer customer2 = new Customer();
		customer2.setName("Rohan");
		customer2.setAccNo("HDFC5201010004822");
		customer2.setLocation("Mysore");

		Customer customer3 = new Customer();
		customer3.setName("Shreyas");
		customer3.setAccNo("HDFC5201010004823");
		customer3.setLocation("Mysore");

		Customer customer4 = new Customer();
		customer4.setName("Chandana");
		customer4.setAccNo("HDFC5201010004824");
		customer4.setLocation("Mysore");

		Customer customer5 = new Customer();
		customer5.setName("Ramesh");
		customer5.setAccNo("SBI5201010004825");
		customer5.setLocation("Bangalore");

		Customer customer6 = new Customer();
		customer6.setName("Chidu");
		customer6.setAccNo("SBI5201010004826");
		customer6.setLocation("Bangalore");

		Customer customer7 = new Customer();
		customer7.setName("Gunesh");
		customer7.setAccNo("SBI5201010004827");
		customer7.setLocation("Bangalore");

		Customer customer8 = new Customer();
		customer8.setName("Vidhya");
		customer8.setAccNo("UBIN5201010004828");
		customer8.setLocation("Malavalli");

		Customer customer9 = new Customer();
		customer9.setName("Sathish");
		customer9.setAccNo("UBIN5201010004829");
		customer9.setLocation("Malavalli");

		ArrayList<Customer> customerlist1 = new ArrayList<>();
		customerlist1.add(customer1);
		customerlist1.add(customer2);
		customerlist1.add(customer3);
		customerlist1.add(customer4);

		ArrayList<Customer> customerlist2 = new ArrayList<>();
		customerlist2.add(customer5);
		customerlist2.add(customer6);
		customerlist1.add(customer7);

		ArrayList<Customer> customerlist3 = new ArrayList<>();
		customerlist3.add(customer8);
		customerlist3.add(customer9);

		HashMap<Bank, ArrayList<Customer>> bankCustomerMap = new HashMap<>();
		bankCustomerMap.put(hdfcBank, customerlist1);
		bankCustomerMap.put(sbiBank, customerlist2);
		bankCustomerMap.put(karnatakaBank, customerlist3);
		

		for (Map.Entry<Bank, ArrayList<Customer>> entry : bankCustomerMap.entrySet()) {
			if(entry.getKey().getBankName().equals("Karnataka Bank"))
				{
				System.out.println("Karnataka bank customer details :");
				for(Customer customer :entry.getValue()) {
				
				System.out.println("name :" + customer.getName() +" ");
                System.out.println("accountnumber :" + customer.getAccNo());
                System.out.println("location : " + customer.getLocation());
				
				System.out.println();
				}
			

		}

	}
}
}