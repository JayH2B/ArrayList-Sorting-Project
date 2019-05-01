import java.util.Scanner;

public class Student extends Person {
	String grade;
	boolean college;
	
Scanner in = new Scanner(System.in);
	public String getGrade() {
		return grade;
	}
	public Student(String ppl, String job, String grade) {
		super(ppl, job, 0);
		this.ppl = ppl;
		this.job = job ;
		this.grade = grade;
		// TODO Auto-generated constructor stub
		//ppl = name
		//job in this case is dream occupation
	}
	public boolean inCollege() {
		return college;
	}
	public String toString() {
		
		return "Name: " + ppl + " Dream job: " + job + " Grade level: " + grade + " \n ";
	}
		public String regards() {
			return ppl;
		}
}
