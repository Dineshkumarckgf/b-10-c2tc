package marchCaseStudy;

public abstract class ShopAcc 
{
	private int accNo;
	private String accNm;
	private float charges;
	ShopAcc()
	{
		
	}
	
	public ShopAcc(int accNo, String accNm, float charges) 
	{
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
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

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges)
	{
		this.charges = charges;
	}
	
	abstract public void bookProduct(float charges);
	
	
	abstract public void items(float charges);
	
	
	@Override
	public String toString()
	{
		return "["+this.accNm+","+this.accNo+","+this.charges+"]";
	}
	
	
}
