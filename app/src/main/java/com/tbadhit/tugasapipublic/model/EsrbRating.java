package com.tbadhit.tugasapipublic.model;

import com.google.gson.annotations.SerializedName;

public class EsrbRating{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("slug")
	private String slug;

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

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}
}