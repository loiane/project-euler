package com.loiane.projecteuler;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * Answer is 6857
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class Problem3 {

	public static void main(String[] args) {

		double x = 600851475143d; 
		double prime;

		while (x != 1){
			prime = getFirstPrimeFactor(x);
			System.out.println(prime);
			x = x / prime;
		}

	}

	static double getFirstPrimeFactor(double x){

		for (double z = 2; z*z <= x; z++) {

			if (x%z == 0) {
				return z;
			}
		}
		return x;
	}
}
