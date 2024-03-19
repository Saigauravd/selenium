package api;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import pojo.CreateProduct;
import pojo.CreateProductResponce;

public class Post {

	public static void main (String []args)
	{
		CreateProduct postt = new CreateProduct();
		postt.setName("Vapes");
		postt.setDescription("Vapes are the E-type ciggrette");
		postt.setPrice(567);
		postt.setCategory(11);
		postt.setIs_location_offer(1);
		postt.setProduct_image_id(21);
		postt.setIs_rental(2);
		postt.setBrand_id(6754);
		
		RestAssured.baseURI  = "https://api.practicesoftwaretesting.com";
		 CreateProductResponce postresponce = given().log().all().header("Content-Type", "application/json")
					.body(postt)
					.when()
					.post("/Product")
					.then()
					.log().all()
					.extract()
					.response().as(CreateProductResponce.class);
	
}
}