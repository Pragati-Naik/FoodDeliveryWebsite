package com.food.model;

public class Restaurant {

	 private int restaurantId;
	    private String name;
	    private String address;
//	    private int phone;
	    private float rating;
	    private String cuisineType;
	    private boolean isActive;
	    private int estimatedDeliveryTime;
	    private int userId;
	    private String imagePath;
		
	    public Restaurant() {
			
		}

		public Restaurant(int restaurantId, String name, String address,  float rating, String cuisineType,
				boolean isActive, int estimatedDeliveryTime, int userId, String imagePath) {
//			super();
//			String phone,
			this.restaurantId = restaurantId;
			this.name = name;
			this.address = address;
//			this.phone = phone;
			this.rating = rating;
			this.cuisineType = cuisineType;
			this.isActive = isActive;
			this.estimatedDeliveryTime = estimatedDeliveryTime;
			this.userId = userId;
			this.imagePath = imagePath;
		}

		/**
		 * @return the restaurantId
		 */
		public int getRestaurantId() {
			return restaurantId;
		}

		/**
		 * @param restaurantId the restaurantId to set
		 */
		public void setRestaurantId(int restaurantId) {
			this.restaurantId = restaurantId;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the address
		 */
		public String getAddress() {
			return address;
		}

		/**
		 * @param address the address to set
		 */
		public void setAddress(String address) {
			this.address = address;
		}

		/**
		 * @return the phone
		 */
//		public String getPhone() {
//			return phone;
//		}

		/**
		 * @param phone the phone to set
		 */
//		public void setPhone(String phone) {
//			this.phone = phone;
//		}

		/**
		 * @return the rating
		 */
		public float getRating() {
			return rating;
		}

		/**
		 * @param rating the rating to set
		 */
		public void setRating(float rating) {
			this.rating = rating;
		}

		/**
		 * @return the cuisineType
		 */
		public String getCuisineType() {
			return cuisineType;
		}

		/**
		 * @param cuisineType the cuisineType to set
		 */
		public void setCuisineType(String cuisineType) {
			this.cuisineType = cuisineType;
		}

		/**
		 * @return the isActive
		 */
		public boolean isActive() {
			return isActive;
		}

		/**
		 * @param isActive the isActive to set
		 */
		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}

		/**
		 * @return the estimatedDeliveryTime
		 */
		public int getEstimatedDeliveryTime() {
			return estimatedDeliveryTime;
		}

		/**
		 * @param estimatedDeliveryTime the estimatedDeliveryTime to set
		 */
		public void setEstimatedDeliveryTime(int estimatedDeliveryTime) {
			this.estimatedDeliveryTime = estimatedDeliveryTime;
		}

		/**
		 * @return the userId
		 */
		public int getUserId() {
			return userId;
		}

		/**
		 * @param userId the userId to set
		 */
		public void setUserId(int userId) {
			this.userId = userId;
		}

		/**
		 * @return the imagePath
		 */
		public String getImagePath() {
			return imagePath;
		}

		/**
		 * @param imagePath the imagePath to set
		 */
		public void setImagePath(String imagePath) {
			this.imagePath = imagePath;
		}
}
