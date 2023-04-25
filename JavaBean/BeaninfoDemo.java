package com.bean;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

public class BeaninfoDemo {
	
	public static void main(String[] args) throws Exception{
		BeanInfo info = Introspector.getBeanInfo(Person.class);
		PropertyDescriptor[] props = info.getPropertyDescriptors();
		for(PropertyDescriptor prop : props){
			System.out.println(prop.getName() + "-" + prop.getPropertyType());
		}
		System.out.println("Method Descriptors");
		
		for(MethodDescriptor pd : info.getMethodDescriptors()){
			System.out.println(pd.getName() + "-" + pd.getName());
			
		}
	}
	
}

 class Person implements java.io.Serializable{
	 
	 int age;
	 String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
