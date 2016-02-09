
public class Demo {
	public static void main(String[] args) {
		Scheduler sc=new Scheduler();
		sc.push(new ITask() {
			@Override
			public void doWork() {
				System.out.println("The home chores are done!");
			}
		});
		sc.push(new ITask() {
			@Override
			public void doWork() {
				System.out.println("I am back from Paris!");
			}
		});
		sc.push(new ITask() {
			@Override
			public void doWork() {
				System.out.println("I've done my homework!");
			}
		});
		sc.push(new ITask() {
			@Override
			public void doWork() {
				System.out.println("I took the car to the technical inspection!");
			}
		});
		
		sc.main();
		sc.main();
	}
}
