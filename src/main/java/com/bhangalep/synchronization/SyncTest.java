package com.bhangalep.synchronization;

public class SyncTest {

	public synchronized void run() {
		System.out.println("Sync run method");
	}
	
	public static void runStatic() {
		System.out.println("Static Run method");
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				SyncTest syncTest = new SyncTest();
				syncTest.run();
			}
		});
		
	
	Thread t2 = new Thread(new Runnable() {
		
		public void run() {
			SyncTest.runStatic();
		}
	});
	t1.start();
	t2.start();
	
	}
}
