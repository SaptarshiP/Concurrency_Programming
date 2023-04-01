package com.psja.block;

public class ObjectLevelBlock {

	private TestLockClass testLockClass1; 
	
	ObjectLevelBlock( TestLockClass testLockClass1 ){
		this.testLockClass1 = testLockClass1;
	}
	public void check() {
		
		synchronized( testLockClass1 ) {
			
			for ( Integer i = 0; i<10; i++ )
				testLockClass1.test();
		}
	}
	
}
