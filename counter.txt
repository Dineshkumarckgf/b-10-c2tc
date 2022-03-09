package basics;

import java.util.Scanner;

public class helloworld implements Runnable 
{
	    static int count = 0,i; 
	     static void incCount() 
	     {
	    	
	          System.out.println(Thread.currentThread().getName() + ": " + count);
	          count++;
	        
	          while(count==i)
	          {

	          count=0;
	         
	          	}
	     }

	     public void run() 
	     {
	          while(count<i)
	          {
	        	 
	               incCount();
	          }
	     }   
	

public static void main(String[] args) 
	  
	{
	    	 Scanner sc = new Scanner(System.in);
	    	 i=sc.nextInt();
	    	 
	          helloworld tc = new helloworld();
	          Thread t1 = new Thread(tc);
	          
	          t1.start();
	                 
	     }
}


	 