package bankApp;

public abstract class MMSavingAcc {
	private float MINBAL;
	public abstract void withdraw(float MINBAL);
	@Override
	public String toString() {
		return "MMSavingAcc [MINBAL=" + MINBAL + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
