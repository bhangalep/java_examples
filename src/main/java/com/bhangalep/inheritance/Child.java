package com.bhangalep.inheritance;


public class Child extends Parent{

	public void run() { //throws Exception{ // this willl give you compilation error
		//If the exception is thrown by the parent’s class method then child class’s overridden method may not be required to throw the exception (not mandatory but it can throw)
	}
}
