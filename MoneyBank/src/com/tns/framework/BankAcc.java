package com.tns.framework;

public abstract class BankAcc {
	protected int accNo;
	protected String accNm;
	protected float accBal;
	
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	public void withdraw(float accBal)
	{
		System.out.println("The accBal of a customer after withdrawing is" + accBal);
	}
	public void deposit(float accBal)
	{
		System.out.println("The accBal of a customer after depositing is" + accBal);
	}
	
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
