import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class paper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		    * create SimpleDateFormat Object to convert the date in particular string format
		    */
		    DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		    Date dt = new Date();
		 
		    /**
		    * format method is used to convert the date in MM/dd/yyyy format
		    */
		    System.out.println("Date in MM/dd/yyyy format: "+df.format(dt));
		    
		    DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
		    System.out.println("France time: "+df2.format(dt));
		    
		    Calendar kDeath = new GregorianCalendar();
		    Date exactTime = new Date();
		    exactTime.setYear(1963);
		    exactTime.setMonth(11);
		    exactTime.setDate(22);
		    exactTime.setHours(12);
		    exactTime.setMinutes(30);
		    
		    kDeath.setTime(exactTime);
		    System.out.println("----------------------------------------");
		    System.out.println("YEAR: " + kDeath.get(Calendar.YEAR));
		    System.out.println("MONTH: " + kDeath.get(Calendar.MONTH));
		    System.out.println("WEEK_OF_YEAR: " + kDeath.get(Calendar.WEEK_OF_YEAR));
		    System.out.println("WEEK_OF_MONTH: " + kDeath.get(Calendar.WEEK_OF_MONTH));
		    System.out.println("DATE: " + kDeath.get(Calendar.DATE));
		    System.out.println("DAY_OF_MONTH: " + kDeath.get(Calendar.DAY_OF_MONTH));
		    System.out.println("DAY_OF_YEAR: " + kDeath.get(Calendar.DAY_OF_YEAR));
		    System.out.println("-----------------------------------------");
		    
		    
		    System.out.println(getPi(10));
		    System.out.println(getPi(100));
		    System.out.println(getPi(1000));
		    System.out.println(getPi(10000));
		    System.out.println(getPi(100000));
	}
	public static double getPi(int numPoints){
		int inCircle = 0;
		for(int  i = 0;i < numPoints; i++){
			double randX = (Math.random() * 2) - 1;
			double randY = (Math.random() * 2) - 1;
			
			double dist = Math.sqrt(randX * randX + randY * randY);
			
			inCircle++;
		}
		return 4.0 * inCircle/numPoints;
	}

}
