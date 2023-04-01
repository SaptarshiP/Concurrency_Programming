package com.psja;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface CheckFunctionalInterface{
	public void check( Integer i );
}

public class FirstMultithreading {

	public static void print( Integer i ) {
		System.out.println( "In the main thread" + i);
	}
	
	public static void main(String args[]) {
		System.out.println( "In the main class" );
		
		MyThread myThread = new MyThread();
		myThread.start();
		
		CheckFunctionalInterface checkFunctionalInterface = FirstMultithreading::print;
		for ( Integer i = 0; i<10; i++ )
			checkFunctionalInterface.check( i );
	}
	
}
