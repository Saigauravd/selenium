package pojo;

public class CreateProduct {

	 String name;
	  String description;
	  float price;
	  int category;
	  
	  int brand_id;
	  int product_image_id;
	  int is_location_offer;
	  int is_rental;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	public int getProduct_image_id() {
		return product_image_id;
	}
	public void setProduct_image_id(int product_image_id) {
		this.product_image_id = product_image_id;
	}
	public int getIs_location_offer() {
		return is_location_offer;
	}
	public void setIs_location_offer(int is_location_offer) {
		this.is_location_offer = is_location_offer;
	}
	public int getIs_rental() {
		return is_rental;
	}
	public void setIs_rental(int is_rental) {
		this.is_rental = is_rental;
	}
}
