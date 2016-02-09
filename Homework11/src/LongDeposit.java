
public class LongDeposit extends Deposit{

	public LongDeposit(Client client,float cash) throws BankProductException {
		super(client, cash, 12, 5);
	}
	
	@Override
	int getMoney() {
		// TODO Auto-generated method stub
		return 0;
	}

}
