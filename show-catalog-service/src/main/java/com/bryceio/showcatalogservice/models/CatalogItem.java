package com.bryceio.showcatalogservice.models;

public class CatalogItem {
	private String name;
	private String desc;
	private int episodes;
	private int rating;
	public CatalogItem(String name, String desc, int episodes, int rating) {
		super();
		this.name = name;
		this.desc = desc;
		this.episodes = episodes;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getEpisodes() {
		return episodes;
	}
	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	
	

}
