package com.tbadhit.tugasapipublic.model;

import com.google.gson.annotations.SerializedName;

public class ShortScreenshotsItem{

	@SerializedName("image")
	private String image;

	@SerializedName("id")
	private int id;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}
}