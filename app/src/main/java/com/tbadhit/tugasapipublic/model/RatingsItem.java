package com.tbadhit.tugasapipublic.model;

import com.google.gson.annotations.SerializedName;

public class RatingsItem{

	@SerializedName("count")
	private int count;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("percent")
	private double percent;

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setPercent(double percent){
		this.percent = percent;
	}

	public double getPercent(){
		return percent;
	}
}