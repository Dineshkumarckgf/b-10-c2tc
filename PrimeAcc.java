package marchCaseStudy;

public abstract class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
    private static final float deliveryCharges = 0;
	PrimeAcc()
	{
		
	}
	public PrimeAcc(boolean isPrime) {
		super();
		this.isPrime = isPrime;
	}
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
		
		
			
		}
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	public static float getDeliverycharges() {
		return deliveryCharges;
	}
	
	@overridden
	public void BookProduct (float delieverycharges ) {
		return();
	}
	
	public String toString()
	{
		
	}
	}


	
