package bankApp;

public abstract class MMCurrentAcc {
	public abstract void withdraw();

	@Override
	public String toString() {
		return "MMCurrentAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
