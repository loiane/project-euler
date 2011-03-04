package com.loiane.projecteuler;

import java.math.BigInteger;

/**
 * What is the first term in the Fibonacci sequence to contain 1000 digits?
 * 
 * Answer is 4782
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class Problem25 {

public static void main(String[] args) {
		
		BigInteger prev = new BigInteger("1");
		BigInteger current = new BigInteger("2");;
		BigInteger n;
		int count = 3;
		
		while (true){
		    n = new BigInteger(current.toString());
		    current = current.add(prev);
		    prev = new BigInteger(n.toString());
		    count++;
		    
		    if (current.toString().length() >= 1000){
		    	break;
		    }
		    
		}
		
		System.out.println(count);
	}
}
