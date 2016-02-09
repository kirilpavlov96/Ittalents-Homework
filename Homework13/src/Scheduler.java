import java.util.LinkedList;
import java.util.Queue;

public class Scheduler {
	private Queue<ITask> tasks;
	
	public Scheduler() {
		this.tasks=new LinkedList<ITask>();
	}
	
	public void push(ITask task){
		this.tasks.add(task);
	}
	
	public void main(){
		if(this.tasks.isEmpty()){
			System.out.println("No more tasks!");
			return;
		}
		this.tasks.poll().doWork();
	}
}
