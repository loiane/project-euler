package com.loiane.projecteuler;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 * 
 * Answer is 142913828922
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class Problem10 {

	public static void main(String[] args) {
		
		long sum = 2;
		
		for (int i=3; i<2000000; i++){
			if (isprime(i)){
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

	static boolean isprime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
