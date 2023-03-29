package classes;

import java.lang.*;

public class Appetizer extends FoodItem
{
	private String size;
	
	public Appetizer()
	{
		super();
		System.out.println("E-A");
	}
	public Appetizer(String fid , String name , int availableQuantity, double price, String size)
	{
		super(fid, name, availableQuantity, price);

		this.size = size;
		System.out.println("P-A");
	}
	public void setSize(String size)
	{
		this.size = size;
	}
	public String getSize()
	{
		return size;
	}
	public void showDetails()
	{
		System.out.println("Food Id: "+fid);
		System.out.println("Food Name: "+name);
        System.out.println("Available Quantity: "+availableQuantity);
		System.out.println("Food Price: "+price);
		System.out.println("Appetizer: "+size);
	}
}