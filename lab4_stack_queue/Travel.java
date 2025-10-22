/*
Travel.java
fall 2021
prof. lehman
sample class for exam1
 */

public class Travel {

	//class data
    private String destination; 
    private int miles; 

	//default constructor
    public Travel()
    {
        destination = "unknown";
        miles = 0;
    }
	
	//alternate constructor
	public Travel(String d, int m)
    {
        destination = d;
        miles = m;
    }

	//setter for miles
    public void updateMiles(int m)
    {
        miles = m;
    }

	//setter for destination
    public void updateDestination(String d)
    {
        destination = d;
    }

	//getter for miles
    public int miles()
    {
        return miles;
    }

	//getter for destination
    public String destination()
    {
        return destination;
    }

    public String toString()
    {
        return "Destination: " + destination + ", Miles: " + miles;
    }

}//Travel
