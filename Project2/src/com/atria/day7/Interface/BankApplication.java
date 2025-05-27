package com.atria.day7.Interface;

public class BankApplication {

	public static void main(String[] args) {
		
		Bank bank = new BankImpl();//dynamic 
		Account acc= new Account(111,"apoorva",20000,bank);
		acc.deposit(0);
		System.out.println(acc);//tostring
		acc.withdraw(20000);
		System.out.println(acc);
	
	}

}