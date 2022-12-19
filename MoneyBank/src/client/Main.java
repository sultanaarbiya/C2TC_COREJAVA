package client;

import com.tns.Application.MMBankfactory;
import com.tns.Application.MMSavingAcc;
import com.tns.Application.MMcurrentAcc;

public class Main {

	public static void main(String[] args) {
		MMBankfactory Factory=new MMBankfactory();
		MMcurrentAcc mmc=(MMcurrentAcc)Factory.getNewCurrentAccount(15,"CurrentAcc",100);
		mmc.deposit(mmc.getAccBal());
		MMSavingAcc mms=(MMSavingAcc)Factory.getNewSavingAccount(20,"savingAcc",20000,false);
		mms.deposit(mms.getAccBal());
		
	}

}
