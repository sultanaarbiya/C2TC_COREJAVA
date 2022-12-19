package com.tns.framework;

public abstract class SavingAcc extends BankAcc {
protected boolean isSalaried;
  protected static final float MINBAL=1000;
   
  
public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
	super(accNo, accNm, accBal);
	this.isSalaried = isSalaried;
}

public void withdraw(float accBal)
   {
	  System.out.println("Dear Saving Accountcustomer your current balance is "+accBal); 
   }

@Override
public String toString() {
	return "SavingAcc [isSalaried=" + isSalaried + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}

public boolean isSalaried()
{
	return isSalaried;
}

public void setSalaried(boolean isSalaried) {
	this.isSalaried = isSalaried;
}


}
