package com.psja;

import static java.lang.System.out;
import java.lang.Thread;
import java.util.function.Consumer;

import com.psja.check.MyChildThreadWillWaitMain;
import com.psja.check.MyThread;
import com.psja.check.MyThreadInterrupt;
import com.psja.check.MyThreadWithJoinAndSleep;
import com.psja.check.MyThreadWithName;
import com.psja.check.MyThreadWithPriority;
import com.psja.check.MyThreadWithYield;

public class RunnableInterface {

	public static void main( String args[] ) throws InterruptedException {
		out.println("In the runnable interface");
//		MyThread myThread = new MyThread();
//		
//		Thread th = new Thread( myThread );
//		th.start();
//		
//		for ( Integer i =0; i<10; i++ ) {
//			out.println( "In the main thread" + Thread.currentThread().getName() );
//		}
		
		//Seting the name of the thread
//		out.println( "********Setting the name of the thread*************" );
//		Consumer<Thread> checkName = (t)->System.out.println("In main thread: "+t.getName());
//		MyThreadWithName myThreadWithName = new MyThreadWithName();
//		
//		Thread th2 = new Thread( myThreadWithName, "PSJA_CHILD_1" );
//		th2.start();
//		
//		Thread.currentThread().setName("PSJA_MAIN_1");
//		Integer t = 0;
//		for ( ;t<10; ) {
//			checkName.accept( Thread.currentThread() );
//			t++;
//		}
		
		//Setting the priority of thread
//		out.println( "*******Setting the priority of the thread with name**********" );
//		MyThreadWithPriority myThreadWithPriority = new MyThreadWithPriority();
//		Thread th3 = new Thread( myThreadWithPriority, "PSJA_CHILD" );
//		th3.setPriority(9);
//		th3.start();
//		
//		Thread.currentThread().setName( "PSJA_MAIN" );
//		Thread.currentThread().setPriority(6);
//		
//		for ( Integer i =0; i<10; i++ ) {
//			out.println( "with loop"+Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority() );
//		}
//		out.println( "******Setting the yield*******" );
//		MyThreadWithYield myThreadWithYield = new MyThreadWithYield();
//		
//		Thread th4 = new Thread( myThreadWithYield );
//		th4.start();
//		th4.setPriority(1);
//		for ( Integer i =0; i<10; i++ ) {
//			out.println( "with loop   "+Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority() );
//			Thread.sleep(2000);
//		}
		//Setting the join and sleep
//		out.println( "*****Setting the join and sleep method*******" );
//		MyThreadWithJoinAndSleep myThreadWithJoinAndSleep = new MyThreadWithJoinAndSleep();
//		
//		Thread th5 = new Thread( myThreadWithJoinAndSleep );
//		th5.start();
//		Thread.currentThread().join(5000);
//		for ( Integer i =0; i<10; i++ ) {
//			out.println( "with loop   "+Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority() );
//			//Thread.sleep(2000);
//		}
		
		//The child thread will wait for main thread
//		out.println("The child thread will wait for main thread");
//		MyChildThreadWillWaitMain myChildThreadWillWaitMain = new MyChildThreadWillWaitMain( Thread.currentThread() );
//		Thread th6 = new Thread( myChildThreadWillWaitMain );
//		th6.start();
//		
//		for ( Integer i =0; i<10; i++ ) {
//			out.println( "The main thread" );
//			Thread.currentThread().sleep(2000);
//		}
		
		//Setting the interrupt in child thread for main thread
		MyThreadInterrupt myThreadInterrupt = new MyThreadInterrupt( Thread.currentThread() );
		Thread th7 = new Thread( myThreadInterrupt );
		
		
		Consumer< Integer > cons = ( data )->{
						out.println( data );
						try {
							
							Thread.currentThread().sleep(2000);
						} catch( Exception exp ) {
							System.out.println( "The exception in:"+data );
						}
		};
		th7.start();
		for ( Integer i = 0; i<10; i++ ) {
			cons.accept(i);
			if ( i == 2 ) {
				th7.interrupt();
			}
			
		}
	}
	
}
