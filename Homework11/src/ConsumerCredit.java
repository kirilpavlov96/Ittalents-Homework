
public class ConsumerCredit extends Credit {

	public ConsumerCredit(Client client,float cash,int period) throws BankProductException {
		super(client, cash, period, 10);
	}
	
	@Override
	int getMoney() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void makePayment() throws BankProductException {
		this.setCash(this.getCash()-this.getMonthInterest());
		this.setPeriod(this.getPeriod()-1);
	}

}
