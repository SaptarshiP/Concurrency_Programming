package com.psja;

import static java.lang.System.out;

import com.psja.execution.Invoker;
import com.psja.execution.MainThread;

public class WaitNotify {

	public static void main( String args[] ) {
		out.println("The wait and ntify method");
		//MainThread mainThread = new MainThread();
		//mainThread.ch();
		Invoker.invoke();
	}
	
}
