package com.tns.Application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	private static final float MINBAL=1000;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}

public void withdraw(float MINBAL)
{
System.out.println("Dear savingacc customer your account balance is " +getAccBal()+"minimum balance"+MINBAL);	
}
	
	
@Override
public String toString() {
	return "MMSavingAcc [MINBAL=" + MINBAL + ", isSalaried=" + isSalaried + ", accNo=" + accNo + ", accNm=" + accNm
			+ ", accBal=" + accBal + ", toString()=" + super.toString() + ", isSalaried()=" + isSalaried()
			+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}
}


