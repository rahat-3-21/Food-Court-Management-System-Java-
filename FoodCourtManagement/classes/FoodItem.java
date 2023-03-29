package classes;
import java.lang.*;
import interfaces.*;
public abstract class FoodItem implements IQuantity
{
	protected String fid;
	protected String name;
	protected int availableQuantity;
	protected double price;

	public FoodItem()
	{
		System.out.println("E-FI");
	}

	public FoodItem(String fid, String name, int availableQuantity, double price)
	{
		this.fid = fid;
		this.name = name;
		this.availableQuantity = availableQuantity;
		this.price = price;
		System.out.println("P-FI");		
	}

	public void setFid(String fid)
	{
		this.fid = fid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAvailableQuantity(int quantity)
	{
		this.availableQuantity = availableQuantity;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public String getFid()
	{
		return fid;
	}
	public String getName()
	{
		return name;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}
	public double getPrice()
	{
		return price;
	}


	public void addQuantity(int a)
	{
		availableQuantity+=a;

	}
	public void sellQuantity(int a)
	{
		availableQuantity-=a;
	}







   public abstract void showInfo();

}