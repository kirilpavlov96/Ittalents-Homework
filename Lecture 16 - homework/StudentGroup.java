
public class StudentGroup {
	private String groupSubject;
	private Student[] students;
	private int freePlaces;

	public StudentGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
		this.groupSubject = "None";
	}

	public StudentGroup(String subject) {
		this();
		if (subject != null) {
			this.groupSubject = subject;
		}
	}

	public void addStudent(final Student s) {
		if (s.getSubject().equals(this.groupSubject) && this.freePlaces >= 1) {
			this.students[this.students.length - this.freePlaces] = s;
			this.freePlaces--;
		}
	}

	public void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	public String theBestStudent() {
		if (this.students.length - this.freePlaces == 0) {
			return "No students in this group";
		} else {
			float max = 0;
			String name = "";
			for (int i = 0; i < this.students.length - this.freePlaces; i++) {
				if (this.students[i].getGrade() > max) {
					max = this.students[i].getGrade();
					name = this.students[i].getName();
				}
			}
			return name;
		}
	}

	public void printStudentsInGroup() {
		if (this.students.length - this.freePlaces == 0) {
			System.out.println("No students in this group");
		} else {
			for (int i = 0; i < this.students.length - this.freePlaces; i++) {
				System.out.println("Student:" + (i + 1));
				System.out.println("Name: " + this.students[i].getName());
				System.out.println("Subject: " + this.students[i].getSubject());
				System.out.println("Age: " + this.students[i].getAge());
				System.out.println("Grade: " + this.students[i].getGrade());
				System.out.println("Money: " + this.students[i].getMoney());
				System.out.println("Year: " + this.students[i].getYearInCollage());
			}
		}
	}
}