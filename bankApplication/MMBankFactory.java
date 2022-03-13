package bankApp;

public abstract class MMBankFactory {
	public abstract MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried);
	public abstract MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit);
}
