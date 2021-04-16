package com.tbadhit.tugasapipublic.model;

import com.google.gson.annotations.SerializedName;

public class StoresItem{

	@SerializedName("id")
	private int id;

	@SerializedName("store")
	private Store store;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setStore(Store store){
		this.store = store;
	}

	public Store getStore(){
		return store;
	}
}