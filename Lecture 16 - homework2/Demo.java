
public class Demo {

	public static void main(String[] args) {
		Employee worker1=new Employee(null);
		worker1.setCurrentTask(new Task(null, -11));
		worker1.setHoursLeft(0);
		worker1.work();
	}

}
