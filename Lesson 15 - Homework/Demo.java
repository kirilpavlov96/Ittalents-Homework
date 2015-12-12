
public class Demo {

	public static void main(String[] args) {
		//Demo for Computer
//		Computer pC1=new Computer(2002, 2000, 1000, 100, false, "Windows XP");
//		Computer pC2=new Computer(2012, 2000, 100000, 10000, true, "Windows 7");
//		
//		pC2.useMemory(100);
//		pC1.changeOperationSystem("Debian x32");
//		
//		pC1.showCharacteristics();
//		pC2.showCharacteristics();
		//
		
		//Demo for Call and Gsm
		GSM gsm1=new GSM("Iphone 4s");
		GSM gsm2=new GSM("Samsumg s3");
		
		gsm1.insertSimCard("0888546496");
		gsm2.insertSimCard("0878546496");
		
		gsm1.call(gsm2, 2.3f);
		
		gsm2.call(gsm1, 10f);
		
		gsm1.printInfoForTheLastIncomingCall();
		System.out.println(gsm1.getSumForCall());
	}

}
