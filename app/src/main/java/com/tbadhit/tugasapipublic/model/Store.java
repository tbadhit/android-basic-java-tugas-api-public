package com.tbadhit.tugasapipublic.model;

import com.google.gson.annotations.SerializedName;

public class Store{

	@SerializedName("games_count")
	private int gamesCount;

	@SerializedName("domain")
	private String domain;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("image_background")
	private String imageBackground;

	@SerializedName("slug")
	private String slug;

	public void setGamesCount(int gamesCount){
		this.gamesCount = gamesCount;
	}

	public int getGamesCount(){
		return gamesCount;
	}

	public void setDomain(String domain){
		this.domain = domain;
	}

	public String getDomain(){
		return domain;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setImageBackground(String imageBackground){
		this.imageBackground = imageBackground;
	}

	public String getImageBackground(){
		return imageBackground;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}
}