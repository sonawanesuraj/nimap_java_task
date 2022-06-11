package com.abstraction;

public class Main {
	public static void main(String[] args) {
		Bank bank;
		bank=new ICICI();
		System.out.println("ICICI Rate of interest is:"+bank.getInterestRate()+"%");
		
		bank = new SBI();
		System.out.println("SBI Rate of interest is:"+bank.getInterestRate()+"%");
		
		bank = new BOI();
		System.out.println("BOI Rate of interest is:"+bank.getInterestRate()+"%");
	}

}
