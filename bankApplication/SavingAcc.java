package bankApp;

public abstract class SavingAccount extends BankAcc {
	private boolean isSalary;
	private float MINBAL;
	
	public abstract void withdraw(float MINBAL);

	@Override
	public String toString() {
		return "SavingAccount [isSalary=" + isSalary + ", MINBAL=" + MINBAL + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
