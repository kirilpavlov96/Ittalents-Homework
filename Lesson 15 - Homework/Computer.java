
public class Computer {
	int year;
	float price,hardDiskMemory,freeMemory;
	boolean isNotebook;
	String operationSystem;
	
	Computer(){
		this.year=0;
		this.price=0;
		this.hardDiskMemory=0;
		this.freeMemory=0;
		this.isNotebook=false;
		this.operationSystem="None";
	}
	
	Computer(int year,float price,float hardDiskMemory,float freeMemory,boolean isNotebook,String operationSystem){
		this();
		if(year>0){
			this.year=year;
		}
		if(price>0){
			this.price=price;
		}
		if(hardDiskMemory>0){
			this.hardDiskMemory=hardDiskMemory;
		}
		if(freeMemory>0){
			if(freeMemory>hardDiskMemory){
				this.freeMemory=hardDiskMemory;
			}
			else{
				this.freeMemory=freeMemory;
			}
		}
		else this.freeMemory=freeMemory;
		this.isNotebook=isNotebook;
		this.operationSystem=operationSystem;
	}
	
	void changeOperationSystem(String newOperationSystem){
		this.operationSystem=newOperationSystem;
	}
	
	void useMemory(float memory){
		if(this.freeMemory<memory){
			System.out.println("Not enough free memory!");
		}
		else{
			this.freeMemory-=memory;
		}
	}
	
	void showCharacteristics(){
		System.out.println(	"Year: " + this.year + "\n" +
							"Price: " + this.price + "\n" +
							"HardDiskMemory: " + this.hardDiskMemory + "\n" +
							"FreeMemory: " + this.freeMemory + "\n" +
							"IsNotebook: " + this.isNotebook + "\n" +
							"Operation System: " + this.operationSystem);
	}
}
