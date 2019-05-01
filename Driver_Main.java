import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Driver_Main {
	public static void main(String [] args) {
		ArrayList r1 = new ArrayList();
		String choice;
		Scanner in = new Scanner(System.in);
		ArrayList<Premade_List> Teachers = new ArrayList<Premade_List>();
		Teachers.add(new Premade_List(40, "Economics", "Ms.Opportunity"));
		Teachers.add(new Premade_List(50, "Math", "Mrs.Blonde"));
		Teachers.add(new Premade_List(45, "Chemistry", "Ms.Corn"));
		Teachers.add(new Premade_List(30, "Computer Lab", "Ms.City"));
		Teachers.add(new Premade_List(55, "American Government", "Mr.Leaves"));
		System.out.println("Here's that list of teachers you wanted... " + Teachers);
		Collections.sort(Teachers);
		System.out.println("Oh! You want me to sort the list? I can do that for you. " + Teachers.toString());
		System.out.println("There you go!");
		
		System.out.println("//////////////////////////////////////////////////////////////////////////////////");
		System.out.println("Oh you have some more files on teachers? Pass on the info please.");
		Teachers p1 = new Teachers("Mrs.Nisan", "teacher", "Grammar", 37);
		System.out.println("Teacher 1: " + p1.toString());
		Teachers p2 = new Teachers("Mr.Hills ", "teacher", "Precalculus", 25);
		System.out.println("Teacher 2: " + p2.toString());
		boolean exclusive = p2.isExclusive();
			if(exclusive = true) {
				System.out.println("The Precal class is small so there are only 30 students in it, this is cause of the requirements to enter the class");
			}
			Person p4 = new Person("Mr.Borne", "Cleaner", 100000);
			boolean ItsJasonBorne = p4.ItsJasonBorne;
			System.out.println("Here we have: " + p4.toString());
				if(ItsJasonBorne = true) {
					System.out.println("Wait a minute, he's not a teacher... Must be the local janitor, nobody else fits the bill.");
				}
		System.out.println("We have a list on students around the area, here's what learned from them");
		
			Student s1 = new Student("Son", "Mathematician", "Freshman");
			Student s2 = new Student("Amon", "Musician", "Freshman");
			Student s3 = new Student("Lai" , "Actress", "Highschooler");
			boolean college = s1.inCollege();
			boolean college1 = s2.inCollege();
			ArrayList<Student> students = new ArrayList<Student>();
			students.add(s1);
			students.add(s2);
			students.add(s3);
			System.out.println("Heres's that list I was talking about " + students.toString());
			if(college1 = true){
				System.out.println(s1.regards() + " and " + s2.regards() + " are college students. Make sure you send them your regards");
			}
	}
}
