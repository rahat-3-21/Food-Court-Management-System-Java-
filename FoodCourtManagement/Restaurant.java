package classes;
import java.lang.*;
import interfaces.*;

public class Restaurant implements FoodItemOperations 
{
	private String rid;
	private String name;
	private String rmobileNum;
	private FoodItem listOfFoodItems[] = new FoodItem[10];


	public Restaurant()
	{
		System.out.println("e-r");
	}
	public Restaurant(String rid, String name, String rmobileNum)
	{
		System.out.println("p-r");
		this.rid = rid;
		this.name = name;
		this.rmobileNum = rmobileNum;

	}

	public void setRid(String rid)
	{
		this.rid = rid;
	}
	public void setName(String name)
	{
        this.name = name;
	}
	public void setRMobileNumber(String rmobileNum)
	{
		this.rmobileNum = rmobileNum;
	}
	public String getRid()
	{
		return rid;
	}
	public String getName()
	{
		return name;
	}
	public String getRMobileNumber()
	{
		return rmobileNum;
	}

	public boolean insertFoodItem(FoodItem a)
	{
		boolean flag = false;
		for(int i=0; i<listOfFoodItems.length; i++)
		{
			if(listOfFoodItems[i] == null)
			{
				listOfFoodItems[i] = a;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean removeFoodItem(FoodItem a)
	{
		boolean flag = false;
		for(int i=0; i<listOfFoodItems.length; i++)
		{
			if(listOfFoodItems[i] == a)
			{
				listOfFoodItems[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	public FoodItem searchFooditem(String fooditems)
	{
		FoodItem a = null;
		
		for(int i=0; i<listOfFoodItems.length; i++)
		{
			if(listOfFoodItems[i] != null)
			{
				if(listOfFoodItems[i].getFooditems().equals(fooditems))
				{
					a = listOfFoodItems[i];
					break;
				}
			}
		}
		return a;
	}
	public void showAllFoodItem()
	{
		System.out.println("Restaurant ID: "+rid);
		System.out.println("Restaurant Name: "+name);
		System.out.println("Restaurant Mobile Number: "+rmobileNum);
		
		for(int i=0; i<listOfFoodItems.length; i++)
		{
			if(listOfFoodItems[i] != null)
			{
				System.out.println("*******************");
				listOfFoodItems[i].showDetails();
				System.out.println();
				
			}
		}
	}
	
}
