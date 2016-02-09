import java.util.LinkedList;
import java.util.List;

public class Client implements IClient{
	private String name;
	private String address;
	private int salary;
	private List<Deposit> deposits;
	private List<Credit> credits;
	private float money;
	
	
//	• Може да открива депозит за определена сума и определен период
//	• Може да иска отпускането кредит
//	• Може да внася пари по кредити.
	public Client(String name,String address,int salary,float money) throws ClientException {
		this.setName(name);
		this.setAddress(address);
		this.setSalary(salary);
		this.setMoney(money);
		this.deposits=new LinkedList<Deposit>();
		this.credits=new LinkedList<Credit>();
	}
	
	public void createDeposit(float sum,int period,float interest,Bank bank) throws BankProductException, ClientException, BankException{
		if(sum>this.money) {
			throw new ClientException("Not enough money to create deposit!");
		}
		BankProduct d=BankProduct.factoryMethod("deposit", interest, this, sum, period);
		if(bank.acceptDeposit((Deposit)d)){
			this.money-=sum;
			this.deposits.add((Deposit) d);
		}
		else{
			throw new ClientException("Not enough money to create deposit!");
		}

	}
	
	public boolean askForCredit(String credit,float sum,int period,Bank bank) throws BankException, BankProductException{
		Credit c=bank.grantCredit(credit, sum, period, this);
		if(c!=null){
			this.credits.add(c);
			return true;
		}
		return false;
	}
	
	public void makePayment(Credit credit){
		
	}
	
	
	

	private void setMoney(float money) {
		this.money = money;
	}

	private void setName(String name) throws ClientException {
		if(name==null){
			throw new ClientException("Invalid name!");
		}
		this.name = name;
	}

	private void setAddress(String address) throws ClientException {
		if(address==null){
			throw new ClientException("Invalid address!");
		}
		this.address = address;
	}

	private void setSalary(int salary) throws ClientException {
		if(salary<0){
			throw new ClientException("Invalid salary!");
		}
		this.salary = salary;
	}

	protected String getName() {
		return name;
	}

	protected String getAddress() {
		return address;
	}

	protected float getMoney(){
		return this.money;
	}
	
	protected int getSalary() {
		return salary;
	}

	public float getCreditPayments(){
		float res=0;
		for(Credit credit : this.credits){
			res+=credit.getMonthInterest();
		}
		return res;
	}
}
