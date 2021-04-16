package com.tbadhit.tugasapipublic.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResultsItem{

	@SerializedName("added")
	private int added;

	@SerializedName("rating")
	private double rating;

	@SerializedName("metacritic")
	private int metacritic;

	@SerializedName("playtime")
	private int playtime;

	@SerializedName("short_screenshots")
	private List<ShortScreenshotsItem> shortScreenshots;

	@SerializedName("platforms")
	private List<PlatformsItem> platforms;

	@SerializedName("user_game")
	private Object userGame;

	@SerializedName("rating_top")
	private int ratingTop;

	@SerializedName("reviews_text_count")
	private int reviewsTextCount;

	@SerializedName("ratings")
	private List<RatingsItem> ratings;

	@SerializedName("genres")
	private List<GenresItem> genres;

	@SerializedName("saturated_color")
	private String saturatedColor;

	@SerializedName("id")
	private int id;

	@SerializedName("added_by_status")
	private AddedByStatus addedByStatus;

	@SerializedName("parent_platforms")
	private List<ParentPlatformsItem> parentPlatforms;

	@SerializedName("ratings_count")
	private int ratingsCount;

	@SerializedName("slug")
	private String slug;

	@SerializedName("released")
	private String released;

	@SerializedName("suggestions_count")
	private int suggestionsCount;

	@SerializedName("stores")
	private List<StoresItem> stores;

	@SerializedName("tags")
	private List<TagsItem> tags;

	@SerializedName("background_image")
	private String backgroundImage;

	@SerializedName("tba")
	private boolean tba;

	@SerializedName("dominant_color")
	private String dominantColor;

	@SerializedName("esrb_rating")
	private EsrbRating esrbRating;

	@SerializedName("name")
	private String name;

	@SerializedName("updated")
	private String updated;

	@SerializedName("clip")
	private Clip clip;

	@SerializedName("reviews_count")
	private int reviewsCount;

	public void setAdded(int added){
		this.added = added;
	}

	public int getAdded(){
		return added;
	}

	public void setRating(double rating){
		this.rating = rating;
	}

	public double getRating(){
		return rating;
	}

	public void setMetacritic(int metacritic){
		this.metacritic = metacritic;
	}

	public int getMetacritic(){
		return metacritic;
	}

	public void setPlaytime(int playtime){
		this.playtime = playtime;
	}

	public int getPlaytime(){
		return playtime;
	}

	public void setShortScreenshots(List<ShortScreenshotsItem> shortScreenshots){
		this.shortScreenshots = shortScreenshots;
	}

	public List<ShortScreenshotsItem> getShortScreenshots(){
		return shortScreenshots;
	}

	public void setPlatforms(List<PlatformsItem> platforms){
		this.platforms = platforms;
	}

	public List<PlatformsItem> getPlatforms(){
		return platforms;
	}

	public void setUserGame(Object userGame){
		this.userGame = userGame;
	}

	public Object getUserGame(){
		return userGame;
	}

	public void setRatingTop(int ratingTop){
		this.ratingTop = ratingTop;
	}

	public int getRatingTop(){
		return ratingTop;
	}

	public void setReviewsTextCount(int reviewsTextCount){
		this.reviewsTextCount = reviewsTextCount;
	}

	public int getReviewsTextCount(){
		return reviewsTextCount;
	}

	public void setRatings(List<RatingsItem> ratings){
		this.ratings = ratings;
	}

	public List<RatingsItem> getRatings(){
		return ratings;
	}

	public void setGenres(List<GenresItem> genres){
		this.genres = genres;
	}

	public List<GenresItem> getGenres(){
		return genres;
	}

	public void setSaturatedColor(String saturatedColor){
		this.saturatedColor = saturatedColor;
	}

	public String getSaturatedColor(){
		return saturatedColor;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setAddedByStatus(AddedByStatus addedByStatus){
		this.addedByStatus = addedByStatus;
	}

	public AddedByStatus getAddedByStatus(){
		return addedByStatus;
	}

	public void setParentPlatforms(List<ParentPlatformsItem> parentPlatforms){
		this.parentPlatforms = parentPlatforms;
	}

	public List<ParentPlatformsItem> getParentPlatforms(){
		return parentPlatforms;
	}

	public void setRatingsCount(int ratingsCount){
		this.ratingsCount = ratingsCount;
	}

	public int getRatingsCount(){
		return ratingsCount;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	public void setReleased(String released){
		this.released = released;
	}

	public String getReleased(){
		return released;
	}

	public void setSuggestionsCount(int suggestionsCount){
		this.suggestionsCount = suggestionsCount;
	}

	public int getSuggestionsCount(){
		return suggestionsCount;
	}

	public void setStores(List<StoresItem> stores){
		this.stores = stores;
	}

	public List<StoresItem> getStores(){
		return stores;
	}

	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	public List<TagsItem> getTags(){
		return tags;
	}

	public void setBackgroundImage(String backgroundImage){
		this.backgroundImage = backgroundImage;
	}

	public String getBackgroundImage(){
		return backgroundImage;
	}

	public void setTba(boolean tba){
		this.tba = tba;
	}

	public boolean isTba(){
		return tba;
	}

	public void setDominantColor(String dominantColor){
		this.dominantColor = dominantColor;
	}

	public String getDominantColor(){
		return dominantColor;
	}

	public void setEsrbRating(EsrbRating esrbRating){
		this.esrbRating = esrbRating;
	}

	public EsrbRating getEsrbRating(){
		return esrbRating;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUpdated(String updated){
		this.updated = updated;
	}

	public String getUpdated(){
		return updated;
	}

	public void setClip(Clip clip){
		this.clip = clip;
	}

	public Clip getClip(){
		return clip;
	}

	public void setReviewsCount(int reviewsCount){
		this.reviewsCount = reviewsCount;
	}

	public int getReviewsCount(){
		return reviewsCount;
	}
}