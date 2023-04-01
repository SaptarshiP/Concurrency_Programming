package com.psja.check;

import java.util.function.Consumer;
import java.util.function.Function;

public class MyThreadWithPriority implements Runnable {

	class Employee{
		private String empId;
		private String empName;
		
		public void setEmpId( String empId ) {
			this.empId = empId;
		}
		public String getEmpId() {
			return this.empId;
		}
		public void setEmpName( String empName ) {
			this.empName = empName;
		}
		public String getEmpName() {
			return this.empName;
		}
	}
	
	@Override
	public void run() {
		
		MyThreadWithPriority myThreadWithPriority = new MyThreadWithPriority();
		Employee emp = myThreadWithPriority.new Employee();
		Function<Employee, Employee> empFun = (em)-> {
													em.setEmpId( "PSJA_Thread_ID" );
													em.setEmpName( "PSJA_Thread_NAME" );
													return em;
												};
		empFun.apply(emp);
		Consumer<Employee> empCons = ( em )->System.out.println(Thread.currentThread().getName()+":"+
																	em.getEmpId()+" : "+
																	Thread.currentThread().getPriority());
		for( Integer i =0; i<10; i++ ) {
			empCons.accept( emp );
		}
		
	}
	
}
