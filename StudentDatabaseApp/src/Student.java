/*
 * Author: Rehna Anthru
 * Subject: Project on StudentDatabase 
 * Date: 4/14/2022
 */


import java.util.Scanner;

public class Student {
	
		
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses= null;
	private int tuitionBalance =0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	Student() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Student's First Name: ");
		this.firstName = input.nextLine();
		
		System.out.println("Enter Student's Last Name: ");
		this.lastName = input.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student class level");
		this.gradeYear = input.nextInt();
		
		setStudentID();
			

	}

	//generate an id
	private void setStudentID() {
		//grade level id
		id++;
		this.studentID = gradeYear + ""+ id;
	}

	public void enroll () {
		//getting inside the loop when the user enters 0

		do {
			System.out.print("Enter the course to enroll (Q to Quit): ");
			Scanner input = new Scanner(System.in);
			String course =input.nextLine();

			if(!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;

			}
			else {
				
				break;
			}
		} while (1 !=0);

	}
	
	//view balalnce
	public void viewBalance() {
		System.out.println("Your balance is : $" + tuitionBalance);
	}
	
	//payTuition
	public void payTuition() {		
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner input = new Scanner(System.in);
		int payment = input.nextInt();
		tuitionBalance = tuitionBalance -payment;
		System.out.println("Thank you for your payment of $: " + payment);
		viewBalance();
		
	}
	public String toString() {
		
		return "Name: " + firstName + " "+ lastName +
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: "+ studentID + 
				"\nCourses Enrolled: "+ courses +
				"\nBalalnce: $" + tuitionBalance;		
	}
}
