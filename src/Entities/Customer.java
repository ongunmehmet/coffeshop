package Entities;

public class Customer implements IEntitiy {
	
	public Customer() {}
	public Customer(int id, String name, String surName, String nationalIdentity,int starCount) {
		
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.nationalIdentity = nationalIdentity;
		this.starCount= starCount;
		
	}
	
	
	private int id;
	private String name;
	private String surName;
	private String nationalIdentity;
	private int starCount;
	public int getId()
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	public int getStarCount() {
		return starCount;
	}
	public void setStarCount(int starCount) {
		this.starCount = starCount;
		
	}
	
	

}
