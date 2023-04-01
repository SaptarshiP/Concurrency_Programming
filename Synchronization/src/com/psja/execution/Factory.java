package com.psja.execution;

class CHOOSE{
	
	public final static String SYNCHRONIZED = "SYNCHRONIZED";
	public final static String NON_SYNCHRONIZED = "NON_SYNCHRONIZED";
	public final static String MULTIPLE_METHOD = "MULTIPLE_METHOD";
}

public class Factory {

	private InvokerInterface invokerInterface;
	
	public void factoryMethod( String status ) {

		if ( status.equalsIgnoreCase( CHOOSE.SYNCHRONIZED ) ) {
			invokerInterface = new InvokerClassStaticSynchronized();
			invokerInterface.invoke();
		} else if ( status.equalsIgnoreCase( CHOOSE.NON_SYNCHRONIZED ) ) {
			invokerInterface = new InvokerClass();
			invokerInterface.invoke();
		} else if ( status.equalsIgnoreCase( CHOOSE.MULTIPLE_METHOD ) ) {
			invokerInterface = new InvokerClassMoreThanOneMethod();
			invokerInterface.invoke();
		}
			
	}
	
}
