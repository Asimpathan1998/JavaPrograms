package part1;

import java.util.Date;

//import java.sql.Date;

public class GarbageGC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		 System.out.println("Total JVM memory: " + rt.totalMemory());
		 
		System.out.println("Before Memory = " + rt.freeMemory());
		
		Date d = null;
		for(int i = 0;i<10000;i++) {
		d = new Date(i);
		d = null;
		}
		System.out.println("After Memory = " + rt.freeMemory());
	
		rt.gc(); // an alternate to System.gc()
		
		System.out.println("After GC Memory = "	+ rt.freeMemory());
	}

}
