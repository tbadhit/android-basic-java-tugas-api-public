package com.tbadhit.tugasapipublic.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class YearsItem{

	@SerializedName("filter")
	private String filter;

	@SerializedName("nofollow")
	private boolean nofollow;

	@SerializedName("decade")
	private int decade;

	@SerializedName("count")
	private int count;

	@SerializedName("from")
	private int from;

	@SerializedName("to")
	private int to;

	@SerializedName("years")
	private List<YearsItem> years;

	@SerializedName("year")
	private int year;

	public void setFilter(String filter){
		this.filter = filter;
	}

	public String getFilter(){
		return filter;
	}

	public void setNofollow(boolean nofollow){
		this.nofollow = nofollow;
	}

	public boolean isNofollow(){
		return nofollow;
	}

	public void setDecade(int decade){
		this.decade = decade;
	}

	public int getDecade(){
		return decade;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setFrom(int from){
		this.from = from;
	}

	public int getFrom(){
		return from;
	}

	public void setTo(int to){
		this.to = to;
	}

	public int getTo(){
		return to;
	}

	public void setYears(List<YearsItem> years){
		this.years = years;
	}

	public List<YearsItem> getYears(){
		return years;
	}

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}
}