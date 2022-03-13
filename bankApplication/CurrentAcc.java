package bankApp;

public abstract class CurrentAccount extends BankAcc {
	private float creditLimit;
	public abstract void withdraw();
	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
