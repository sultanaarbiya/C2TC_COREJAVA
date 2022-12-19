package com.tns.framework;

public abstract class CurrentAcc extends BankAcc {
	protected float creditLimit=50000;
	
	
	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
	}
	
	
	public float getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(float creditLimit) {
		this.creditLimit = creditLimit;
	}

	public void withdraw(float accBal)
	{
		System.out.println("The amount after withdrawing is= +accBal ");
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
