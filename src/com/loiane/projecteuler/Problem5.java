package com.loiane.projecteuler;

/**
 * 2520 is the smallest number that can be divided by
 * each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly
 * divisible by all of the numbers from 1 to 20?
 * 
 * Answer is 232792560
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class Problem5 {

	public static void main(String[] args) {

		long result = 2520;

		while (!Check(result)){
			result += 2520;
		}

		System.out.println(result);
	}

	private static boolean Check(long result) {

		for (int i = 11; i <= 20; ++i)
		{
			if (result % i != 0)
				return false;
		}

		return true;
	}
}
