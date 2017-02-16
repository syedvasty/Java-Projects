/*
 * Author : Syed Vasty (Sunny)
 * 
 * Version: 3/19/2016 
 * 
 * Description: 
 * This program will create three objects using the base class
 * and will pass the value to the constructor, the default constructor 
 * will set the radius to the zero for the first object with no parameter
 * and for the second two objects that are passing a parameter
 * a constructor will call the checkRadius() function to verify if the 
 * radius of the object is valid and will return true or false 
 * accordingly. If the result of the result of the checkRadius is 
 * true then the getSurfaceArea() will calculate the area and pass it back to 
 * the main class and if the result if false then surface area will remain 0 and it will
 * print an error that the radius cant be equal to or less than 0.
 * 
 * 
 */

//Public class
public class SphereClass{

	public static void main(String[] args)
	{
		//Creates a spehere with a default radius which is 0
		SphereClass sphere1 = new SphereClass();
		System.out.println("The Surface Area of the spehere 1 is: " 
		+sphere1.getSurfaceArea() +" with a radius of: "+sphere1.radius);
		
		//Creates a spehere with a radius of 12
		SphereClass sphere2 = new SphereClass(12);
		System.out.println("The Surface Area of the spehere 2 is: " 
		+sphere2.getSurfaceArea() +" with a radius of: "+sphere2.radius);
		
		//Creates a spehere with a radius of -15
		SphereClass sphere3 = new SphereClass(-15);
		System.out.println("The Surface Area of the spehere 3 is: " 
		+sphere3.getSurfaceArea() +" with a radius of: "+sphere3.radius);
	}
	//Variables
	double radius;
	boolean finalResult;
	double surfaceArea;
	
	//Default constructor
	SphereClass()
	{
		radius = 0;
	}
	
	//Constructor with a specified value
	SphereClass(double newRadius)
	{
		radius = newRadius;
		finalResult = checkRadius(newRadius);
	}
	
	/*
	 * if the result from the checkRadius() is true it will 
	 * calculate the surface area else it will print an error.
	 */
	double getSurfaceArea()
	{
		if(finalResult == true)
		{
			surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		}
		else if (finalResult == false)
		{
			System.out.println("Radius can not be less than 0 or "
					+ "equal to 0 and current radius is: " + radius);
			return surfaceArea = 0;
		}
		return surfaceArea;	
	}
	/*
	 * This function will check to see 
	 * if the radius is valid, if the radius is less than
	 * or equal to 0 checkRadius() will return false, else it will
	 * return true
	 */
	boolean checkRadius(double nRad)
	{
		boolean result = false;
		if(nRad > 0)
		{
			result = true;
		}
		
		return result;
		
	}
	
	
	
}
