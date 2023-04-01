package com.psja;

import static java.lang.System.out;

import com.psja.block.InvokerClassLevelBlock;
import com.psja.block.InvokerClassMethodLevelBlock;
import com.psja.block.InvokerInterface;
import com.psja.block.InvokerObjectLevelBlock;

public class BlockSynchronization {

	public static void main( String args[] ) {
		out.println( "In block synchronization" );
		
		//InvokerClassMethodLevelBlock invokerClassMethodLevelBlock = new InvokerClassMethodLevelBlock();
		//invokerClassMethodLevelBlock.invoke();
		
		//InvokerInterface invoker = new InvokerClassLevelBlock();
		InvokerInterface invoker = new InvokerObjectLevelBlock();		
		invoker.invoke();
	}
	
}
