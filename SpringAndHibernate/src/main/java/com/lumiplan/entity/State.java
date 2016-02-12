
package com.lumiplan.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table (name="state")
public class State {
	@Id @GeneratedValue
	@Column (name="State_id")
	private int stateId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn (name = "Country_id")
	private Country country;
	@Column (name = "State_name")
	private String stateName;
	@OneToMany(mappedBy = "state")
	
	private List<City> cities;
	
	public List<City> getCities(){
		return cities;
	}
	
	public int getStateId(){
		return stateId;
	}
	
	public Country getCountry(){
		return country;
	}
	
	public String getStateName(){
		return stateName;
	}
	
	public void setStateId(int StateId){
		this.stateId = StateId;
	}
	
	public void setStateName(String StateName){
		this.stateName = StateName;
	}
	
	public void setCountryId(Country country){
		this.country = country;
	}
	
	public void setCities(List<City> cities){
		this.cities = cities;
	}
}
