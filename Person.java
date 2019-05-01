
public class Person {
	protected String ppl;
	protected String job;
	protected int pay;
	boolean ItsJasonBorne;

	public Person(String ppl, String job, int pay) {
		this.ppl = ppl;
		this.job = job;
		this.pay = pay;
	}

	public Person(String ppl, String job, String subject) {
		// TODO Auto-generated constructor stub
	}
	public boolean notTeach() {
		return ItsJasonBorne;
	}
	public String toString() {
		return "Name: " + ppl + " job: " + job + " Salary: " + pay;
	}
}
