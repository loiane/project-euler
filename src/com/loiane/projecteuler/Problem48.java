package com.loiane.projecteuler;

import java.math.BigInteger;

/**
 * The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
 *
 * Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 * 
 * Answer is 9110846700
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class Problem48 {

	public static void main(String[] args) {
		
		BigInteger sum = new BigInteger("10405071317");
		
		for (int i=11; i<1000; i++){
			sum = sum.add(new BigInteger(""+i).pow(i));
		}
		
		String number = sum.toString();
		
		System.out.println(number.substring(number.length()-10));
	}
}
