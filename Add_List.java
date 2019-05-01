import java.util.ArrayList;
import java.util.Scanner;

public class Add_List {
	public void listing() {
		Scanner in = new Scanner(System.in);
		String choice;
		String choice2;
		String choice3;
		boolean yn;
		ArrayList<String> Person = new ArrayList<String>();
		ArrayList<String>Student = new ArrayList<String>();

		
		System.out.println("Do you have someone you want to add to the list? ");
			choice = in.nextLine();
			switch(choice) {
			case "yes":
			
				yn = false;
					System.out.println("Is this person a student?");
					choice2 = in.nextLine();
					switch (choice2) {
					case "yes":
						yn = false;
						System.out.println("Please enter their name...");
						Student.add(in.nextLine());
						break;
					case "no":
						System.out.println("Are they a teacher?");
						//make teacher path
							choice3 = in.nextLine();
							switch(choice3) {
							case "yes": 
								yn = false;
								System.out.println("What");
								//goes enter name
								break;
							case "no":
								System.out.println("Add third option here");
									//next choice is citizen with standard job.jpg
								break;
							
							}
						break;
					}
					
			case "no":
				yn = true;
				System.out.println("Oh ok then...");
				break;
				default:
					System.out.println("Ok thanks for the info. Do you want to add another");
					return;
			}
		//	System.out.println("Is this person a student?");
	//	switch(choice) {
		//	yn = false;
		//	
		//	}
	}
}
