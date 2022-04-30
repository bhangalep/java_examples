package com.bhangalep.polymorphism;

public class PolyTest {

	public static void main(String[] args) {
		
		//Static methods cannot be overridden because they are not dispatched on the object instance at runtime. 
		//The compiler decides which method gets called. 
		//Static methods can be overloaded (meaning that you can have the same method name for several methods as long as they have different parameter types).
		ParentPoly parent = new ChildPoly();
		parent.run();
	}
}
