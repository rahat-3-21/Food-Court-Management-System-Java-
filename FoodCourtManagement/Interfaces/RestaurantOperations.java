package interfaces;


import java.lang.*;
import classes.*;

public interface RestaurantOperations
{
	boolean insertRestaurant(Restaurant a);
	boolean removeRestaurant(Restaurant a);
	Restaurant searchRestaurant(int nid);
	void showAllRestauran();
}