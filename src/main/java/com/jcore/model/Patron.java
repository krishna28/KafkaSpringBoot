package com.jcore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "patron")
public class Patron {
	
	@Id
	String name;
    Integer age;
    Integer points;
    public Patron(){}
    
    public Patron(String name,Integer age,Integer points){
    	this.name=name;
    	this.age=age;
    	this.points=points;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	public String toString(){
		return "Name:"+this.name;
	}

}
