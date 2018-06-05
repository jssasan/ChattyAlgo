package base;

import java.util.Arrays;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/*
 * what a class will look like:
 * 
 *  Define class properly: check scope and associated classes, interfaces and packages
 *  
 *  Define variables and check their initiation : data type, initialization, 
 *   Create constructors : default and the required
 *   Create methods: static, private, public - check for the following
 *   	Method arguments; method return type; method's local variables 
 *   	Create try-catch block to handle exceptions
 *      Method overloading; 
 *      Recursive OR Non-recursive . If recursive then what is the base condition and how it is reducing the bigger problem into the smaller chunks
 *      Look for space-time efficiency 
 *   Create a main method for unit testing and check the method for different types of inputs 
 *  
 *  
 * commit-1
 * 
 * 
 */
public class BinarySearch1 {

	private BinarySearch1() {}
	

public static int indexOf(int[] a , int key) {
	int lo= 0;
	int hi= a.length -1;
	while(lo <= hi) {
		
		int mid = lo +(hi - lo)/2;
		if (key < a[mid]) hi = mid -1;
		else if (key > a[mid]) hi= mid +1 ;
		else return mid;
	}
	return -1;
}
    
    
	
	public static void main1(String[] args) {
	
	    // read the integers from a file
	    In in = new In(args[0]);
	    int[] whitelist = in.readAllInts();
	
	    // sort the array
	    Arrays.sort(whitelist);
	
	    // read integer key from standard input; print if not in whitelist
	    while (!StdIn.isEmpty()) {
	        int key = StdIn.readInt();
	        if (BinarySearch.indexOf(whitelist, key) == -1)
	            StdOut.println(key);
	    }
	}


	public static void main(String [] args) {
		
		In in = new In(args[0]);
		int[] whitelist = in.readAllInts();
		
		Arrays.sort(whitelist);
		
		while(!StdIn.isEmpty()) {
			
			int key = StdIn.readInt()	;
			if(BinarySearch.indexOf(whitelist, key)== -1)
				StdOut.println(key);
		}
	}
	
	
}
	
	
	
	
