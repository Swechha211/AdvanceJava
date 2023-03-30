package com.form;

interface Eatable{
	void eat();
}
public class AnonymousInnerClass {
	public static void main(String[] args){
		Eatable e = new Eatable(){
			public void eat(){
				System.out.println("nice fruit");
			}
			
		};
		e.eat();
	}

}
