/**
 * 
 */
package com.moviecentral.pojos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author ravitejakommalapati
 *
 */

/**
 * @author ravitejakommalapati
 *
 */
@Document(indexName="movieelastic" ,type="movieelastic", shards=1)
public class MovieElastic  {
		
	@Id
	private String id;
	
	private String movieid;
	private String title;
	private String genre;
	private String releasedate;
	private String studio;
	private String synopsis;
	private String image;
	private String movieurl;
	private String actors;
	private String director;
	private String country;
	private String rating;
	private String availability;
	private String price;
	
	
	
	
	public String getMovieid() {
		return movieid;
	}
	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private Date registereddate;
	
	public Date getRegistereddate() {
		return registereddate;
	}
	public void setRegistereddate(Date registereddate) {
		this.registereddate = registereddate;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getMovieurl() {
		return movieurl;
	}
	public void setMovieurl(String movieurl) {
		this.movieurl = movieurl;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getPrice() {
		return price;
		
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
