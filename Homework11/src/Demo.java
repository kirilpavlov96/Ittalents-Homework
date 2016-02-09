import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {
	public static void main(String[] args) {
		try {
			
			Bank bulgarianBank=new Bank("BNB", "Sofia", 1000000);
			List<Client> clients=new ArrayList<Client>();
			Random rand=new Random();
			for(int i=0;i<20;i++){
				Client c=new Client("Client"+i, "Sofia", rand.nextInt(10000)+420, rand.nextFloat()*rand.nextInt(100000)+10);
				c.createDeposit((80+rand.nextInt(20)+1)*c.getMoney()/100, 12, 3, bulgarianBank);
				if(rand.nextInt(2)+1==1)
					c.askForCredit("HomeCredit", rand.nextInt(1000)+100, 12, bulgarianBank);
				else{
					c.askForCredit("ConsumerCredit",rand.nextInt(1000)+100, 12, bulgarianBank);
				}
				clients.add(c);
			}
			
			System.out.println("BNB-money: " + bulgarianBank.getMoney());
			System.out.println("BNB-reserve: " + bulgarianBank.getReserve());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
