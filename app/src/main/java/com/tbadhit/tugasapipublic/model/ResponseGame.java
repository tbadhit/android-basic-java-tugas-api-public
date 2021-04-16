package com.tbadhit.tugasapipublic.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseGame{

	@SerializedName("next")
	private String next;

	@SerializedName("nofollow")
	private boolean nofollow;

	@SerializedName("noindex")
	private boolean noindex;

	@SerializedName("nofollow_collections")
	private List<String> nofollowCollections;

	@SerializedName("previous")
	private Object previous;

	@SerializedName("count")
	private int count;

	@SerializedName("description")
	private String description;

	@SerializedName("seo_h1")
	private String seoH1;

	@SerializedName("filters")
	private Filters filters;

	@SerializedName("WARNING")
	private String wARNING;

	@SerializedName("seo_title")
	private String seoTitle;

	@SerializedName("seo_description")
	private String seoDescription;

	@SerializedName("results")
	private List<ResultsItem> results;

	@SerializedName("seo_keywords")
	private String seoKeywords;

	public void setNext(String next){
		this.next = next;
	}

	public String getNext(){
		return next;
	}

	public void setNofollow(boolean nofollow){
		this.nofollow = nofollow;
	}

	public boolean isNofollow(){
		return nofollow;
	}

	public void setNoindex(boolean noindex){
		this.noindex = noindex;
	}

	public boolean isNoindex(){
		return noindex;
	}

	public void setNofollowCollections(List<String> nofollowCollections){
		this.nofollowCollections = nofollowCollections;
	}

	public List<String> getNofollowCollections(){
		return nofollowCollections;
	}

	public void setPrevious(Object previous){
		this.previous = previous;
	}

	public Object getPrevious(){
		return previous;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setSeoH1(String seoH1){
		this.seoH1 = seoH1;
	}

	public String getSeoH1(){
		return seoH1;
	}

	public void setFilters(Filters filters){
		this.filters = filters;
	}

	public Filters getFilters(){
		return filters;
	}

	public void setWARNING(String wARNING){
		this.wARNING = wARNING;
	}

	public String getWARNING(){
		return wARNING;
	}

	public void setSeoTitle(String seoTitle){
		this.seoTitle = seoTitle;
	}

	public String getSeoTitle(){
		return seoTitle;
	}

	public void setSeoDescription(String seoDescription){
		this.seoDescription = seoDescription;
	}

	public String getSeoDescription(){
		return seoDescription;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	public void setSeoKeywords(String seoKeywords){
		this.seoKeywords = seoKeywords;
	}

	public String getSeoKeywords(){
		return seoKeywords;
	}
}