package com.loiane.projecteuler;

import java.math.BigInteger;

/**
 * 2(15) = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 2(1000)?
 * 
 * Answer is 1366
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class Problem16 {

	public static void main(String[] args) {
		
		BigInteger number = new BigInteger("2");
		number = number.pow(1000);
		
		String n = number.toString();
		long total = 0;
		
		for (int i=0; i<n.length(); i++){
			total += Integer.parseInt(""+n.charAt(i));
		}
		
		System.out.println(total);
	}
}
