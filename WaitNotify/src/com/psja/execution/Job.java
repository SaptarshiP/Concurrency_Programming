package com.psja.execution;

import java.lang.FunctionalInterface;

import java.util.Queue;
import java.util.LinkedList;
import java.util.function.Supplier;

@FunctionalInterface
interface CheckInterfaceAdd<E>{
	public void add( E data1 );
}
@FunctionalInterface
interface CheckInterfaceRetrieve<E>{
	public E retrieve();
}

public class Job<T> {

	public Queue<T> queue = new LinkedList<>();
	
	public void add( T d ) {
		CheckInterfaceAdd<T> checkInterfaceAdd = ( data1 )-> queue.add( data1 );
		
		checkInterfaceAdd.add( d );
	}
	
	public T retrieve() {
		
		Supplier<T> supplier = ()-> queue.poll();
		
		CheckInterfaceRetrieve<T> checkInterface = supplier::get;
		return checkInterface.retrieve();
	}
	
}
