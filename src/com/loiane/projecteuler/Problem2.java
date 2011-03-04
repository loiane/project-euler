package com.loiane.projecteuler;

/**
 * Each new term in the Fibonacci sequence is generated by
 * adding the previous two terms. By starting with 1 and 2,
 * the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose
 * values do not exceed four million, find the sum of the even-valued terms.
 * 
 * Answer is 4613732
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class Problem2 {

	public static void main(String[] args) {
		
		long sum = 0;
		long prev = 1;
		long current = 2;
		long n;
		
		while (current < 4000000){
			sum = sum + current;
		    n = current;
		    current += 2 * (current + prev);
		    prev += 2 * n;
		}
		
		System.out.println(sum);
	}

}