package bankApp;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	public abstract void withdraw(float accBal);
	public abstract void deposite(float accBal);
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
