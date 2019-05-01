
public class Teachers extends Person implements Comparable<Teachers>{
	String subject;
	Integer passing;
	boolean exclusive;
	
	public String getSubject() {
		return subject;
	}
	public Teachers(String ppl, String job, String subject, int passing) {
		super(ppl, job, subject);
		this.ppl = ppl;
		this.job =  job;
		this.subject = subject + "teacher";
		this.passing = passing;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Teachers other) {
		if(this.passing == other.passing) {
		return 0;
	}else { if(this.passing > other.passing) {
		return 1;
	}else {
		return -1;
	}
	}
	}
	public String toString() {
		return "Name: " + ppl + " job: " + "subject: " + subject + "\n";

	}
	public boolean isExclusive() {
	
		return exclusive;
		
	}
}
