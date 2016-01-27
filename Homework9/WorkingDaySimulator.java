package homework;

import java.util.Scanner;

public class WorkingDaySimulator {

	public static void main(String[] args) {
		AllWork work=new AllWork();
		work.addTask(new Task("Bake potatoes!",4));
		work.addTask(new Task("Clean the toiler!",8));
		work.addTask(new Task("Have fun!",12));
		work.addTask(new Task("Smoke a cigarette!",2));
		work.addTask(new Task("Eat a bannana!",1));
		work.addTask(new Task("Brake sth!",4));
		work.addTask(new Task("Tell a joke!",5));
		work.addTask(new Task("Kill your pet!",6));
		work.addTask(new Task("Wash the dishes!",9));
		work.addTask(new Task("Make some noise!",1));
		
		
		Employee e1=new Employee("Misho");
		e1.setAllwork(work);
		Employee e2=new Employee("Chocho");
		e2.setAllwork(work);
		Employee e3=new Employee("Pencho");
		e3.setAllwork(work);
		Employee e4=new Employee("Goshko");
		e4.setAllwork(work);

		while(true){
			e1.startWoringDay();
			e2.startWoringDay();
			e3.startWoringDay();
			e4.startWoringDay();
			
			e1.work();
			e2.work();
			e3.work();
			e4.work();
			
			System.out.println("End of the day:");
			if(work.isAllWorkDone()) {
				System.out.println("Everything is done!");
				break;
			}
			work.showReport();
			
			
		}
	}

}
