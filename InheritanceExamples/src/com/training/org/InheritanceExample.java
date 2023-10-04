package com.training.org;
class Parent{
	
	private int aVal;
	
	public Parent() {
		System.out.println("Default constructor of Parent");
		aVal=0;
	}
	
	public Parent(int aVal) {
		System.out.println("Parameterized constructor of Parent");
		this.aVal = aVal;
	}

	public void showParent() {
		System.out.println("Child Class show "+ aVal);
	}
	
}

class Child extends Parent{
	
	private int bVal;
	public Child() {
		System.out.println("Default constructor of Child");
		bVal = 0;
	}
	
	public Child(int aVal, int bVal) {
		super(aVal); //calling parent class parameterized constructor
		System.out.println("Parameterized constructor of Child");
		this.bVal = bVal;
	}
	
	public void showChild() {
		System.out.println("Parent Class show " + bVal);
		super.showParent();
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Child c= new Child(10,20);
		c.showParent();
		System.out.println("------------");
		c.showChild();

	}

}
