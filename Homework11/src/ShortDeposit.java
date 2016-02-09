
public class ShortDeposit extends Deposit{

	public ShortDeposit(Client client,float cash) throws BankProductException {
		super(client, cash, 3, 3);
	}
	
	@Override
	int getMoney() {
		// TODO Auto-generated method stub
		return 0;
	}

}
