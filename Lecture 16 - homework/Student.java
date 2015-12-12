
public class Student {
	private String name;
	private String subject;
	private float grade;
	private int yearInCollage;
	private int	age;
	private boolean isDegree;
	private float money;
	
	public Student(){
		this.name="No name";
		this.subject="No subject";
		this.age=19;
		this.grade=4.0f;
		this.yearInCollage=1;
		this.money=0;
		this.isDegree=false;
	}
	
	public Student(final String name,final String subject,final int age){
		this();
		if(name!=null){
			this.name=name;
		}
		if(subject!=null){
			this.subject=subject;
		}
		if(age<0){
			this.age=19;
		}
	}
	
	public void upYear(){
		if(this.isDegree){
			System.out.println("The student has graduated.");
		}
		else{
			this.yearInCollage++;
			if(this.yearInCollage==4){
				this.isDegree=true;
			}
		}
	}
	
	public float recieveScholarship(final float min,final float amount){
		if(this.age<30 && this.grade>=min){
			this.money+=amount;
		}
		return this.money;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public float getGrade() {
		return grade;
	}

	public int getYearInCollage() {
		return yearInCollage;
	}

	public int getAge() {
		return age;
	}

	public boolean isDegree() {
		return isDegree;
	}

	public float getMoney() {
		return money;
	}

	public void setName(String name) {
		if(this.name!=null) this.name = name;
	}

	public void setSubject(String subject) {
		if(this.subject!=null) this.subject = subject;
	}

	public void setGrade(float grade) {
		if(this.grade>0) this.grade = grade;
	}

	public void setAge(int age) {
		if(this.age>0) this.age = age;
	}
	
}
