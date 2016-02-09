
public interface IBank {
	public boolean acceptDeposit(Deposit deposit) throws BankException;
	
	void addInterestToAllDeposits() throws BankProductException;
	
	Credit grantCredit(String credit,float sum,int period,Client client) 
			throws BankException, BankProductException;
}
