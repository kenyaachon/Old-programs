import java.util.Scanner;
import java.lang.StringBuilder;
public class College {
	static Scanner sc = new Scanner(System.in);
	/**
	 * 
	 * @param args 
	 * Mostly call other methods
	 */
	public static void main(String args[]){
		System.out.println(profile().toString());
		
	}
	
	static StringBuilder profile(){
		System.out.println("What is your name ");
		String name = sc.next();
		System.out.println("What Year are you entering ex: Freshman, Sophmore etc.");
		String schoolYear = sc.next();
		System.out.println("What is the name of the school you attend");
		String school = sc.next();
		System.out.println("What is your intended major");
		String intendedMajor = sc.next();
		
		
		String start = ", your cost at ";
		
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(start);
		sb.append("");
		sb.append(school);
		sb.append(" as a ");
		sb.append(schoolYear);
		sb.append(" with your intention of majoring in ");
		sb.append(intendedMajor);
		sb.append(" is: $");
		sb.append(total());
		return sb;
	}
	/**
	 * @param locale - place the student lives
	 * @return if the student lives on dorm then returns that value but if lives at home then returns 0
	 */
	static double Location(){
		double total;
		System.out.println("Do you Live in a dorm or at home");
		String site = sc.next();
		
		if (site.equalsIgnoreCase("dorm")){
			total = dorm();
		}
		else {
			total = 0;
		}
		return total;
	}
	
	/**
	 * 
	 * @return total cost of living in the dorm
	 */
	static double dorm(){
		System.out.println("What is the cost of room and board");
		double room = sc.nextDouble();
		System.out.println("What are your weekly expenses");
		double expenses = sc.nextDouble();
		System.out.println("How many weeks are you going to be at school");
		int numWeeks = sc.nextInt();
		
		double total = room + (numWeeks * expenses);		
		return total;
	}
	
	/**
	 * 
	 * @return Looks at Tution cost of the school the student attends
	 */
	static double tutionCost(){
		System.out.println("What is the cost of your supplies");
		double supplies = sc.nextDouble();
		System.out.println("What is the cost of your textbooks");
		double textbooks = sc.nextDouble();
		System.out.println("What is cost per hour for credits at your school");
		double creditCost = sc.nextDouble();
		System.out.println("How many credits are you taking");
		int credits = sc.nextInt();
		
		
		double total = supplies + textbooks + (creditCost * credits);
		return total;
	}
	/**
	 * 
	 * @param dorm - price of living in a dorm, tutiion - price of classes
	 * @return
	 */
	static double total( ){
		double locale = Location();
		double tution = tutionCost();
		return locale + tution;
	}
}
