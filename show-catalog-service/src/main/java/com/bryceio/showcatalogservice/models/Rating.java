package com.bryceio.showcatalogservice.models;

public class Rating {
	private String showID;
	private int rating;
	
	public Rating(String showID, int rating) {
		this.showID = showID;
		this.rating = rating;
	}
	
	public String getShowID() {
		return showID;
	}
	public void setShowID(String showID) {
		this.showID = showID;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
