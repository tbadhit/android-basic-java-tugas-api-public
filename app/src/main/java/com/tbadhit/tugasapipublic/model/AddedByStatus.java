package com.tbadhit.tugasapipublic.model;

import com.google.gson.annotations.SerializedName;

public class AddedByStatus{

	@SerializedName("owned")
	private int owned;

	@SerializedName("beaten")
	private int beaten;

	@SerializedName("dropped")
	private int dropped;

	@SerializedName("yet")
	private int yet;

	@SerializedName("playing")
	private int playing;

	@SerializedName("toplay")
	private int toplay;

	public void setOwned(int owned){
		this.owned = owned;
	}

	public int getOwned(){
		return owned;
	}

	public void setBeaten(int beaten){
		this.beaten = beaten;
	}

	public int getBeaten(){
		return beaten;
	}

	public void setDropped(int dropped){
		this.dropped = dropped;
	}

	public int getDropped(){
		return dropped;
	}

	public void setYet(int yet){
		this.yet = yet;
	}

	public int getYet(){
		return yet;
	}

	public void setPlaying(int playing){
		this.playing = playing;
	}

	public int getPlaying(){
		return playing;
	}

	public void setToplay(int toplay){
		this.toplay = toplay;
	}

	public int getToplay(){
		return toplay;
	}
}