package com.bryceio.showcatalogservice.models;

public class Show {
	private String showId;
	private String name;
	
	public Show() {
		
	}
	
	public Show(String showId, String name) {
		this.showId = showId;
		this.name = name;
	}

	
	public String getShowId() {
		return showId;
	}
	public void setShowId(String showId) {
		this.showId = showId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
