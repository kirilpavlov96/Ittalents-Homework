package homework;

public class Employee {
	private static final int STARTING_DAY_WORKING_HOURS = 8;
	private String name;
	private Task currentTask;
	private float hoursLeft;
	private AllWork allwork;

	public Employee(final String name) {
		this.setName(name);
		this.setCurrentTask(null);
		this.setHoursLeft(0f);
	}

	public void startWoringDay() {
		this.hoursLeft = STARTING_DAY_WORKING_HOURS;
		if (this.currentTask == null) {
			Task t = this.allwork.getNextTask();
			this.currentTask = t;
			t.setAssignedTo(this);
		}
		System.out.println("For " + this.name + " the day started!");
	}

	public void work() {
		while (this.getHoursLeft() > 0.0 && !this.allwork.isAllWorkDone()) {
			if (this.currentTask == null) {
				Task t = this.allwork.getNextTask();
				if (t != null) {
					this.currentTask = this.allwork.getNextTask();
				} else {
					break;
				}
			}
			if (this.currentTask.getWorkingHours() > this.hoursLeft) {
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
				this.hoursLeft = 0;
				System.out.println(this.name + " worked on " + this.currentTask.getName() + ".");
			} else if (this.currentTask.getWorkingHours() < this.hoursLeft) {
				this.hoursLeft -= this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
				this.currentTask.setAssignedTo(null);
				System.out.println(this.currentTask.getName()+" was finished by "+ this.name + " !");
				//this.allwork.deleteTask(this.currentTask);
				this.setCurrentTask(this.allwork.getNextTask());
			} else {
				this.currentTask.setWorkingHours(0);
				this.hoursLeft = 0;
				System.out.println(this.currentTask.getName()+" was finished by "+ this.name + " !");
			}
		}
	}

	private static void showReport(final Employee worker) {
		System.out.print("Name: " + worker.getName() + " ");
		if (worker.getCurrentTask() != null)
			System.out.print("Task' name: " + worker.getCurrentTask().getName() + " ");
		else
			System.out.print("Task' name: None ");
		System.out.print("Employee' hours left: " + worker.getHoursLeft() + " ");
		if (worker.getCurrentTask() != null)
			System.out.print("Current Task' hours left: " + worker.getCurrentTask().getWorkingHours() + " ");
		System.out.println("");

	}

	public void setAllwork(AllWork allwork) {
		this.allwork = allwork;
		if (this.allwork != null) {
			this.currentTask = this.allwork.getNextTask();
		}
	}

	public AllWork getAllwork() {
		return allwork;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			this.name = "Unnamed";
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
		if (this.currentTask != null)
			this.currentTask.setAssignedTo(this);
	}

	public float getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(float hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		} else {
			this.hoursLeft = 0;
		}
	}

}
