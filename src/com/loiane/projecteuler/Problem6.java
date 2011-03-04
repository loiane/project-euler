package com.loiane.projecteuler;

/**
 * The sum of the squares of the first ten natural numbers is 385.
 * The square of the sum of the first ten natural numbers is 3025.
 *
 * Hence the difference between the sum of the squares of the first
 * ten natural numbers and the square of the sum is 3025-385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first
 * one hundred natural numbers and the square of the sum.
 * 
 * Answer is 25164150
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class Problem6 {

	public static void main(String[] args) {
		
		long totalSumSquares = 0;
		long totalSquareSum = 0;
		int max = 100;
		
		for (int i=1; i<=max; i++){
			totalSumSquares += Math.pow(i, 2);
			totalSquareSum += i;
		}
		
		totalSquareSum = (long) Math.pow(totalSquareSum, 2);
		
		System.out.println(totalSquareSum-totalSumSquares);
	}
	
}
