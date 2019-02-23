public class TemperatureDemo
{
	public static void main(String[] args)
	{
		System.out.println("Fahrenheit to Celsius: ");
		Temperature fToC = new Temperature(0, 'F');
		System.out.println(fToC.toString());
		fToC.setTempScale(-40, 'F');
		System.out.println(fToC.toString());
		fToC.setTempScale(100, 'F');
		System.out.println(fToC.toString());
		System.out.println();
		
		System.out.println("Celsius to Fahrenheit: ");
		Temperature cToF = new Temperature(0, 'C');
		System.out.println(cToF.toString());
		cToF.setTempScale((-40), 'C');
		System.out.println(cToF.toString());
		cToF.setTempScale(100, 'C');
		System.out.println(cToF.toString());
		System.out.println();
		
		System.out.println("Compare Fahrenheit Temperatures: ");

		Temperature f1 = new Temperature(130, 'F');
		Temperature f2 = new Temperature(200, 'F');
		if (f1.equals(f2))
			System.out.println( f1.getFahrenheit() + " " + f2.getScale() + " is equal to " + f2.getFahrenheit() + " " + f2.getScale());
		else if (f1.tempLess(f2))
			System.out.println(f1.getFahrenheit() + " " + f1.getScale()+ " is less than " + f2.getFahrenheit() + " "+ f2.getScale());
		else
			System.out.println(f1.getFahrenheit() + " " + f1.getScale()+ " is greater than " + f2.getFahrenheit() + " "+ f2.getScale());

		Temperature c1 = new Temperature(50, 'C');
		Temperature c2 = new Temperature(26, 'C');
		if (c1.equals(c2))
			System.out.println(c1.getCelsius() + " " + c1.getScale()+ " temperature is equal to " + c2.getCelsius() + " " + c2.getScale());
		else if (c1.tempLess(c2))
			System.out.println(c1.getCelsius() + " " + c1.getScale()+ " is less than " + c2.getCelsius() + " " + c2.getScale());
		else
			System.out.println(c1.getCelsius() + " " + c1.getScale()+ " is greater than " + c2.getCelsius() + " " + c2.getScale());

	}

}
