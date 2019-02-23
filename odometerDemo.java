public class OdometerDemo
{
	public static void main(String[] args)
	{
		int i=1;
		Odometer car1;
		car1= new Odometer();
		while (i==1)
		{
		car1.getZero();
		car1.getFuel();
		car1.getMiles();
		car1.accessor();
		car1.moreTrips();
		}
	}
}


