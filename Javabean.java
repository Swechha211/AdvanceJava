package com.bean;

public class Javabean implements java.io.Serializable{
	int id;
	String name;
	boolean active;
	int data[];
	
	public Javabean(){
		
	}
	public int getId() {
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
	public boolean isActive(){
		return active;
	}
	public void setActive(boolean active){
		this.active = active;
	}
	
	public static void main(String[] args){
		Javabean obj = new Javabean();
		obj.setId(1);
		obj.setName("Ram");
		obj.setActive(false);
		
		System.out.println("Details of the objects are:");
		System.out.println("ID " + obj.getId());
		System.out.println("Name " + obj.getName());
		System.out.println("Active " + obj.isActive());
		
	}
	public int[] getData() {
		return data;
	}
	public void setData(int[] data) {
		this.data = data;
	}

}
