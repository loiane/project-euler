package com.loiane.projecteuler;

import java.util.ArrayList;
import java.util.List;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11,
 * and 13, we can see that the 6th prime is 13.
 *
 * What is the 10001st prime number?
 * 
 * Answer is 104743
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class Problem7 {

	public static void main(String[] args) {

		List<Double> primes = new ArrayList<Double>();
		primes.add(2d);

		double number = 3d;

		while (primes.size() < 10001){
			if (isprime(number)){
				primes.add(number);
			}
			number += 2;
		}
		
		System.out.println(primes.get(10000));
	}

	static boolean isprime(double number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}


	static double calcprime(double number) {
		for (double i = number; i > 2; i--) {
			if ((number % i == 0) && (isprime(i))) {
				return i;
			}
		}
		return 0;
	}

}
