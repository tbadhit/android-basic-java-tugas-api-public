package com.tbadhit.tugasapipublic.model;

import com.google.gson.annotations.SerializedName;

public class PlatformsItem{

	@SerializedName("requirements_ru")
	private Object requirementsRu;

	@SerializedName("requirements_en")
	private Object requirementsEn;

	@SerializedName("released_at")
	private String releasedAt;

	@SerializedName("platform")
	private Platform platform;

	public void setRequirementsRu(Object requirementsRu){
		this.requirementsRu = requirementsRu;
	}

	public Object getRequirementsRu(){
		return requirementsRu;
	}

	public void setRequirementsEn(Object requirementsEn){
		this.requirementsEn = requirementsEn;
	}

	public Object getRequirementsEn(){
		return requirementsEn;
	}

	public void setReleasedAt(String releasedAt){
		this.releasedAt = releasedAt;
	}

	public String getReleasedAt(){
		return releasedAt;
	}

	public void setPlatform(Platform platform){
		this.platform = platform;
	}

	public Platform getPlatform(){
		return platform;
	}
}