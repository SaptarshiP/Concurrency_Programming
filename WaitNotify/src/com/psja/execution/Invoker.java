package com.psja.execution;

import java.lang.Thread;

public class Invoker {

	public static void invoke() {
	
		Job<Integer> jobInteger = new Job<>();
		ProducerThread< Integer > producerThreadInteger = new ProducerThread<>();
		producerThreadInteger.setJobThread( jobInteger );
		producerThreadInteger.setData( 10 );
		ConsumerThread<Integer> consumerIntegerThread = new ConsumerThread<>( jobInteger );
		Thread threadIntegerConsumer = new Thread( consumerIntegerThread );
		threadIntegerConsumer.start();
		Thread threadIntegerProducer = new Thread( producerThreadInteger );
		threadIntegerProducer.start();
		
	}
}
