package interfaces;


import java.lang.*;
import classes.*;

public interface FoodItemOperations
{
	boolean insertFoodItem(FoodItem a);
	boolean removeFoodItem(FoodItem a);
	void showAllFoodItem();
	FoodItem searchFooditem(String fooditems);
}