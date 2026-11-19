package app.components;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MenuService {
	
	@GET("http://localhost:8080/menu/getFoodItem")
	public Call<FoodItem> getFoodItem(@Query("foodItemPk") Long foodItemPk);
	
	@GET("http://localhost:8080/menu/updateQuantity")
	public Call<FoodItem> updateQuantity(@Query("foodItemPk") Long foodItemPk, @Query("qty") int quantity);


}
