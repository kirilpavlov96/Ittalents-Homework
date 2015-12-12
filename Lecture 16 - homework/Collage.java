
public class Collage {

	public static void main(String[] args) {
		StudentGroup group1=new StudentGroup("Computer science");
		Student s1=new Student("Misho","Computer science",19);
		s1.setGrade(5);
		Student s2=new Student("Kireto","Computer science",29);
		s2.setGrade(5.99f);
		
		group1.addStudent(s1);
		group1.addStudent(s2);
		
		s1.upYear();
		s2.recieveScholarship(4.5f, 20000);
		
		group1.printStudentsInGroup();
		
		System.out.println(group1.theBestStudent());
		
		group1.emptyGroup();
		group1.printStudentsInGroup();
	}

}
