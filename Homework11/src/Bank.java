import java.util.LinkedList;
import java.util.List;

public class Bank implements IBank{
	private String name;
	private String address;
	private List<BankProduct> products;
	private float money;
	private float reserve;
	
	
	public Bank(String name,String address,int money) throws BankException {
		if(name!=null && address!=null && money!=0){
			this.name=name;
			this.address=address;
			this.money=money;
			this.products=new LinkedList<BankProduct>();
		}
		else {
			throw new BankException("Invalid arguments.");
		}
	}
	
	public boolean acceptDeposit(Deposit deposit) throws BankException{
		if(deposit==null || deposit.getCash()<=0){
			return false;
		}
		this.products.add(deposit);
		this.money+=deposit.getCash();
		this.reserve+=deposit.getCash()*90/100;
		return true;
	}

	public void addInterestToAllDeposits() throws BankProductException{
		for(BankProduct product : this.products){
			if(product instanceof Deposit){
				product.setCash(product.getCash()+((Deposit)product).getInterest());
			}
		}
	}
	
	public Credit grantCredit(String credit,float sum,int period,Client client) throws BankException, BankProductException{
		Credit result;
		if(credit.equals("HomeCredit")){
			result=new HomeCredit(client, sum, period);
			if(result.getMonthInterest()+client.getCreditPayments()<=client.getSalary()/2){
				return result;
			}
			else return null;
		}
		else if(credit.equals("ConsumerCredit")){
			result=new ConsumerCredit(client, sum, period);
			if(result.getMonthInterest()+client.getCreditPayments()<=client.getSalary()/2){
				return result;
			}
			else return null;
		}
		else{
			throw new BankException("Invalid arguments for granting credit!");
		}
	}
	
	public float getMoney(){
		return this.money;
	}
	
	public float getReserve(){
		return this.reserve;
	}
}
