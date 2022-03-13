package bankApp;

public abstract class BankFactry{
	public abstract SavinsgAccount getNewSavingsAccount(int accNo, String accNm, float accBal, boolean iSsalaried);
	public abstract CurrentAccount getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit);
}
