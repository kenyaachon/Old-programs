import java.util.Scanner;
import java.util.ArrayList;

public class Arrays {
	
	public static void main(String args[]){
		 String race;
		 String name;
		 String languages_spoken;
		 double weight;
		 double height;
		 String residence;
		 String favorite_food;
		 String career;
		 ArrayList<People> humans = new ArrayList<People>();
		 Scanner sc = new Scanner(System.in);
		 /*
		  * ask user for informtion 
		  * and reseond back with the methods created in another class
		  * 
		  */
		 String response = "yes"; 
		 while (response == "yes"){
		
		 System.out.println("What is the race of the person");
		 race = sc.next();
		 System.out.println("What is the name of the individual");
		 name = sc.nextLine();
		 System.out.println("What languages does the person speak");
		 languages_spoken = sc.next();
		 System.out.println("What is the weight of the person");
		 weight = sc.nextDouble();
		 System.out.println("What is the height of the person");
		 height = sc.nextDouble();
		 System.out.println("Where does the person live?");
		 residence = sc.next();
		 System.out.println("What is the favorite food of the person");
		 favorite_food = sc.next();
		 System.out.println("What is the career of the person");
		 career = sc.next();
		 
		 System.out.println("Would you like to add information about another person , yes or no");
		 response = sc.next();
		 
		 People homosapein = new People(race, name, languages_spoken, weight, height, residence, favorite_food, career);
		 humans.add(homosapein);
		 }
	}

}
