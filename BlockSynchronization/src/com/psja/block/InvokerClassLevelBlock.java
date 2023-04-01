package com.psja.block;

import java.lang.Thread;

public class InvokerClassLevelBlock implements InvokerInterface {

	@Override
	public void invoke() {
		
		ClassLevelBlock classLevelBlock = new ClassLevelBlock();
		ThreadClassLevelBlock threadClassLevelBlock = new ThreadClassLevelBlock( classLevelBlock );
		Thread th1 = new Thread( threadClassLevelBlock );
		th1.start();
		
		ClassLevelBlock classLevelBlock2 = new ClassLevelBlock();
		ThreadClassLevelBlock threadClassLevelBlock2 = new ThreadClassLevelBlock( classLevelBlock2 );
		Thread th2 = new Thread( threadClassLevelBlock2 );
		th2.start();
	}
	
}
