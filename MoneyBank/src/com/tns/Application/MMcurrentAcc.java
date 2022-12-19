package com.tns.Application;

import com.tns.framework.CurrentAcc;

public class MMcurrentAcc extends CurrentAcc {
 
		
	public MMcurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		
	}
	

	public void withdraw(float accBal)
	{
		System.out.println("dear currentAcc customer ,Your accBal is="+" "+accBal+" "+"and credit limit is="+" "+ getCreditLimit());

	}


	@Override
	public String toString() {
		return "MMcurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal="
				+ accBal + ", getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	}
