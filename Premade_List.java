
public class Premade_List implements Comparable<Premade_List>{
	Integer passing;
	String Subject;
	String name;
	public Premade_List(int passing, String Subject, String name) {
		this.passing = passing;
		
		this.Subject = Subject;
		this.name = name;
	}

	@Override
	public int compareTo(Premade_List other) {
		if(this.passing == other.passing) {
		return 0;
	} 
		else {
			if(this.passing > other.passing) {
				return 1;
			} else
				return -1;
		}
	}
	public String toString() {
		return "name: " + name + " subject: " + Subject + " No. of passing students: " + passing + " \n ";
	} 
}


