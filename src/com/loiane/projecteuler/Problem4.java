package com.loiane.projecteuler;

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of
 * two 2-digit numbers is 9009 = 91  99.
 *
 * Find the largest palindrome made from the product
 * of two 3-digit numbers.
 * 
 * Answer is 906609
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class Problem4 {

	public static void main(String[] args) {
		
		long palindrome = 0;
		long product;
		
		for (int i=100; i<=999; i++){
			for (int j=i+1; j<=999; j++){
				
				product = i*j;
				
				if (isPalindrome(product)){
					if (palindrome < product){
						palindrome = product;
					}
				}
			}
		}
		
		System.out.println(palindrome);
	}
	
	private static boolean isPalindrome(long product){
		
		String string = ""+product;
		StringBuffer inverse = new StringBuffer(string);
		
		if (string.equals(inverse.reverse().toString())){
			return true;
		}
		
		return false;
	}
}
