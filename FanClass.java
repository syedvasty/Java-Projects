/**
 * CIS 2571-002
 * @author Syed Vasty (Sunny)
 * @version 4/4/2016
 *
 * Description: This class file will create a fan object.
 * There are three public Variables with pre-defined fan speed, 
 * There are also 4 private variables for which we will be
 * using setters and getters to store the information.
 * At last, there is a toString function which will be used to 
 * display the fan.
 *
 */
public class FanClass {

	//Public Variables
	public static int slow = 1;
	public static int medium = 2;
	public static int fast = 3;
	
	//Private Variables
	private int speed = slow;
	private boolean on = false;
	private double radius = 5;
	private String color = "white";
	
	//Start of Setter and Getters
	public int getSpeed() 
	{
		return speed;
	}
	public void setSpeed(int speed) 
	{
		this.speed = speed;
	}
	public boolean isOn() 
	{
		return on;
	}
	public void setOn(boolean on) 
	{
		this.on = on;
	}
	public double getRadius() 
	{
		return radius;
	}
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}
	//End of Setters and getters
	
	//start of Constructors
	//no Argument Constructor
	FanClass()
	{
		
	}
	//End of Constructor
	
	//toString function to display the result
	  public String toString()
	  {
	    return "The speed of the fan is " + speed 
	    		+ " and the current state of the fan is " 
	    		+ on + " radius of the fan is " + radius 
	    		+ " color of the fan is " + color + "\n";
	  }
}
