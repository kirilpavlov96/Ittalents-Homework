
public abstract class Deposit extends BankProduct{
	private int monthlyPayment;
	
	protected Deposit(Client client,float cash,int period,float interest) throws BankProductException{
		super(client, cash, period, interest);
	}
	
	protected float getInterest(){
		return this.getCash()*this.getAnnualInterest()/12*this.getPeriod()/100;
	}

	protected int getMonthlyPayment() {
		return monthlyPayment;
	}

	protected void setMonthlyPayment(int monthlyPayment) throws BankProductException {
		if(monthlyPayment<=0){
			throw new BankProductException("Inavlid argument!");
		}
		this.monthlyPayment = monthlyPayment;
	}
	
	
}
