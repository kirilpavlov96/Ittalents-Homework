package homework;

public class AllWork {
	
	private static final int NO_UNASSIGNED_TASKS = -1;
	private static final int AVAILABLE_PLACES_FOR_TASKS = 10;
	
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	
	public AllWork() {
		this.tasks=new Task[AVAILABLE_PLACES_FOR_TASKS];
		this.freePlacesForTasks=AVAILABLE_PLACES_FOR_TASKS;
		this.currentUnassignedTask=NO_UNASSIGNED_TASKS;
	}
	
	private int checkForUnassignedTasks(){
		for(int i=0;i<=AVAILABLE_PLACES_FOR_TASKS-this.freePlacesForTasks-1;i++){
			if(this.tasks[i].getAssignedTo()==null && this.tasks[i].getWorkingHours()!=0) return i;
		}
		return NO_UNASSIGNED_TASKS;
	}
	
	public void addTask(Task newTask){
		if(this.freePlacesForTasks==0){
			System.out.println("Not enough space for more Tasks.");
		}
		else{
			this.tasks[AVAILABLE_PLACES_FOR_TASKS-this.freePlacesForTasks]=newTask;
			this.freePlacesForTasks--;
		}
	}
	
	private int getIndexOfTask(Task task){
		for(int i=0;i<=AVAILABLE_PLACES_FOR_TASKS-this.freePlacesForTasks-2;i++){
			if(this.tasks[i]==task) return i;
		}
		return -1;
	}
	
	public void deleteTask(Task task){
		int index=this.getIndexOfTask(task);
		if(index==-1) return;
		
		for(int i=index;i<=AVAILABLE_PLACES_FOR_TASKS-this.freePlacesForTasks-2;i++){
			this.tasks[i]=this.tasks[i+1];
		}
		this.tasks[AVAILABLE_PLACES_FOR_TASKS-this.freePlacesForTasks-1]=null;
		this.freePlacesForTasks--;
	}
	
	public Task getNextTask(){
		this.currentUnassignedTask=this.checkForUnassignedTasks();
		if(this.currentUnassignedTask==NO_UNASSIGNED_TASKS){
			return null;
		}
		else {
			return this.tasks[this.currentUnassignedTask];
		}
	}
	
	public boolean isAllWorkDone(){
		for(int i=0;i<=AVAILABLE_PLACES_FOR_TASKS-this.freePlacesForTasks-1;i++){
			if(this.tasks[i].getWorkingHours()>0) return false;
		}
		return true;
	}

	public void showReport() {
		for(int i=0;i<=AVAILABLE_PLACES_FOR_TASKS-this.freePlacesForTasks-1;i++){
			System.out.println("Task name:" + this.tasks[i].getName() + "Left Hours:" + this.tasks[i].getWorkingHours());
		}
	}
	
	
}
