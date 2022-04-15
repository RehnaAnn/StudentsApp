import java.util.Scanner;

public class StudentDatabase {
	public static void main(String[] args) {

		//prompt asking to add more students
		System.out.println("Enter number of new students to enroll: ");
		Scanner input = new Scanner(System.in);
		int numofStudents =input.nextInt();
		Student [] students = new Student[numofStudents];
		
		//creates i number of students
		for(int i =0; i < numofStudents; i++) {
			students [i] = new Student();			
			students [i].enroll();
			students [i].payTuition();
		}

		for(int i =0; i < numofStudents; i++) {
			System.out.println(students [i].toString());
		}

	}

}
