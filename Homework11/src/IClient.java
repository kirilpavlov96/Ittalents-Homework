
public interface IClient {
	public void createDeposit(float sum,int period,float interest,Bank bank) 
			throws BankProductException, ClientException, BankException;
	
	public boolean askForCredit(String credit,float sum,int period,Bank bank) 
			throws BankException, BankProductException;
	
	void makePayment(Credit credit);
	
	float getCreditPayments();
}
