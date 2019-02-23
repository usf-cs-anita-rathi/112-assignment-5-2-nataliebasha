import java.util.Scanner;
import java.lang.Math;
public class Odometer
{
	private int milesDrive, milesGal, gallons;
		public void getZero()
		{
			milesDrive=0;
		}

		public void getFuel()
		{
			Scanner input= new Scanner(System.in);
			System.out.println("What is the fuel efficiency of your car (mpg)? ");
			milesGal=input.nextInt();
			System.out.println("The input miles gal is: "+milesGal);
		}

		public void getMiles()
		{
			Scanner input= new Scanner(System.in);
			System.out.println("How many miles did you drive? ");
			milesDrive=input.nextInt();
			System.out.println("The input miles driven is: "+milesDrive);
			//milesTotal+=milesDrive;

		}

		public void accessor()
		{
			gallons= milesGal/milesDrive;
			System.out.println("The number of gallons of gasoline your vehicle has consumed is:  "+ gallons);
		}
		
		public void moreTrips()
		{
			int i;
			String selection;
			Scanner input=new Scanner(System.in);
			System.out.println("Would you like to continue? ");
	    	selection = input.next();
	     	switch(selection)
	     	{
	     		case "yes":
	     		case "Yes": i=1;
	     		break;
	     		case "no":
	     		case "No": i=0;
	     		break;
           		default: System.out.println("Invalid input, please enter 'yes', or 'no.' ");
           		break;
		}	

     }
}