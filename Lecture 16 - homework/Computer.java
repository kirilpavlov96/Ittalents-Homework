
public class Computer {
	int year;
	float price,hardDiskMemory,freeMemory;
	boolean isNotebook;
	String operationSystem;
	
	Computer(){
		this.isNotebook=false;
		this.operationSystem="Win XP";
	}
	
	Computer(int year,float price,float hardDiskMemory,float freeMemory){
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
	}
	
	Computer(int year,float price,float hardDiskMemory,float freeMemory,boolean isNotebook,String operationSystem){
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook=isNotebook;
		if(operationSystem!=null){
			this.operationSystem=operationSystem;
		}
	}
	
	int comparePrice(Computer c){
		if(this.price>c.price) return -1;
		else if(this.price<c.price) return 1;
		else return 0;
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
