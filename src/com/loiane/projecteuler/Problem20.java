package com.loiane.projecteuler;

import java.math.BigInteger;

/**
 * Find the sum of the digits in the number 100!
 * 
 * Answer is 648
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class Problem20 {

	public static void main(String[] args) {
		
		BigInteger number = new BigInteger("1");
		
		for (int i=2; i<=100; i++){
			number = number.multiply(new BigInteger(""+i));
		}
		
		String n = number.toString();
		long total = 0;
		
		for (int i=0; i<n.length(); i++){
			total += Integer.parseInt(""+n.charAt(i));
		}
		
		System.out.println(total);
	}

}
