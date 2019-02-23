public class Temperature
{
	double temp;
	char scale;
	public Temperature(char scale)
	{
		this.scale=scale;
		temp=0;
	}

	public Temperature(double temp)
	{
		this.temp=temp;
		scale='C';
	}

	public Temperature(double temp, char scale)
	{
		this.temp=temp;
		this.scale=scale;
	}
	public Temperature()
	{
		temp=0;
		scale= 'C';
	}

	public double getCelsius()
	{
		if(scale=='C')
			return temp;
		else
			return ((double)(Math.round((5*(temp-32.0)/9.0))));
	}
	public double getFahrenheit()
	{
		if(scale=='F')
			return temp;
		else
			return (Math.round((9*(temp/5)+32)));
	}

	public void setTemp(double temp)
	{
		this.temp=temp;
	}

	public void setScale(char scale)
	{
		this.scale=scale;
	}
	public void setTempScale(double temp, char scale)
	{
		this.temp= temp;
		this.scale=scale;
	}
	public double getTemperature()
	{
		return temp;
	}
	public char getScale()
	{
		return scale;
	}
	public boolean equals(Temperature temp)
		{
			if((this.getCelsius()==temp.getCelsius()))
				return true;
			else
				return false;
		}
	public boolean tempGreater(Temperature temp)
	{
		if(this.getCelsius()> temp.getCelsius())
			return true;
		else
			return false;
	}

	public boolean tempLess(Temperature temp)
	{
		if(this.getCelsius()< temp.getCelsius())
			return true;
		else 
			return false;
	}

	public String toString()
	{
		if(getScale()=='F')
			return getTemperature() + " Degrees F= "+ getCelsius() + " Degrees C";
		else
			return getTemperature() + " Degrees C= "+ getFahrenheit()+" Degrees F";
	}
}
