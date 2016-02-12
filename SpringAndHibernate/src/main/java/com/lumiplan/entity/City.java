package com.lumiplan.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table (name="city")
public class City {
	@Id @GeneratedValue
	@Column (name="City_id")
	private int cityId;
	@Column (name="City_name")
	private String cityName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn (name = "State_id")
	private State state;
	
	public State getState(){
		return state;
	}
	
	public int getCityId(){
		return cityId;
	}
	
	public String getCityName(){
		return cityName;
	}
	
	public void setCityName(String CityName){
		this.cityName = CityName;
	}
	
	public void setCityId(int CityId){
		this.cityId = CityId;
	}
	
	public void setStateId(State state){
		this.state = state;
	}
	
}
