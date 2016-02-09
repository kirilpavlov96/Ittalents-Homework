
public abstract class Credit extends BankProduct{
	private int monthSum;
	
	protected float getMonthInterest(){
		return this.getCash()*this.getAnnualInterest()/12/100;
	}
	
	Credit(Client client,float cash,int period,float interest) throws BankProductException{
		super(client, cash, period, interest);
	}
	
	abstract void makePayment() throws BankProductException;
}
