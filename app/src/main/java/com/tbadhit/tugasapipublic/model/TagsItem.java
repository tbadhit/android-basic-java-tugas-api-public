package com.tbadhit.tugasapipublic.model;

import com.google.gson.annotations.SerializedName;

public class TagsItem{

	@SerializedName("games_count")
	private int gamesCount;

	@SerializedName("name")
	private String name;

	@SerializedName("language")
	private String language;

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

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
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