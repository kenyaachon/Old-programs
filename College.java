import java.util.Scanner;
public class Challenge2 {
	/**
	 * 
	 * @param medicine
	 * @param labservice
	 * @param overnightcharges
	 * @param nights
	 * @return total of hospital charges
	 */
	public static double charges(double medicine, double labservice, double overnightcharges, int nights ) {
		Double total = medicine + labservice + overnightcharges*nights;
	
		return total;
	}
	/**
	 * hospital program
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total;
		double overnightcharges;
		int nights;
		String response = "";
		
		do{
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the name of the patient");
		String name = sc.next();
		System.out.println("What are the medication charges "
				+ "and lab service charges");
		double medicine = sc.nextDouble();
		double labservice = sc.nextDouble();
		System.out.println("Did the patient stay overnight, yes or no");
		String overnight = sc.next();
		if (overnight.equalsIgnoreCase("yes")) {
			System.out.println("How many nights did the patient stay, and how much are overnight charges per night");
			overnightcharges = sc.nextDouble();
			nights = sc.nextInt();
			total = charges(medicine, labservice, overnightcharges, nights);
		}
		else {
			overnightcharges = 0;
			nights = 0;
			total = charges(medicine, labservice, overnightcharges, nights);
		}
		
		System.out.println("The patients charges for " + name + " are: $" + total);
		System.out.println("Do you want to do another patient, yes");
		response = sc.next();
		if (response.equalsIgnoreCase("yes")){
			System.out.println("Okay let me calculate the charges for the next patient");
		}
		else{
		System.out.println("Have a nice day");
		}
		}
		while (response.equalsIgnoreCase("yes"));
		
	}

}
