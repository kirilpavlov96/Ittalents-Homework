
public abstract class BankProduct implements IBankProduct{
	private float annualInterest;
	private int period;
	private float cash;
	private Client client;
	
	public BankProduct(Client client,float cash,int period,float interest) throws BankProductException {
		this.setClient(client);
		this.setAnnualInterest(interest);
		this.setCash(cash);
		this.setPeriod(period);
	}
	
	abstract int getMoney();
	
	static BankProduct factoryMethod(String product,float interest,Client client,float cash,int period) throws BankProductException{
		if(product.equals("deposit")){
			if(interest==3) return new ShortDeposit(client, cash);
			if(interest==5) return new LongDeposit(client, cash);
		}
		if(product.equals("credit")){
			if(interest == 6) return new HomeCredit(client, cash, period);
			if(interest == 10) return new ConsumerCredit(client, cash, period);
		}
		throw new BankProductException("Invalid factory arguments!");
	}

	protected float getAnnualInterest(){
		return annualInterest;
	}

	protected void setAnnualInterest(float interest) throws BankProductException{
		if(interest<=0) {
			throw new BankProductException("Invalid argument");
		}
		this.annualInterest = interest;
	}

	protected int getPeriod(){
		return period;
	}

	protected void setPeriod(int period) throws BankProductException{
		if(period<=0) {
			throw new BankProductException("Invalid argument");
		}
		this.period = period;
	}

	protected float getCash() {
		return cash;
	}

	protected void setCash(float f) throws BankProductException{
		if(f<=0) {
			throw new BankProductException("Invalid argument");
		}
		this.cash = f;
	}

	protected Client getClient(){
		return client;
	}

	protected void setClient(Client client) throws BankProductException{
		if(client==null) {
			throw new BankProductException("Invalid argument");
		}
		this.client = client;
	}
	
	
}
