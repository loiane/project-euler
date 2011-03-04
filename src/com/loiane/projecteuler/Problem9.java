package com.loiane.projecteuler;

/**
 * A Pythagorean triplet is a set of three natural numbers,
 * a  b  c, for which a^2 + b^2 = c^2
 *
 * There exists exactly one Pythagorean triplet for which
 * a + b + c = 1000.
 * Find the product abc.
 * 
 * Answer is 31875000
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class Problem9 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		for (a=1; a<500; a++){
			for (b=1; b<500; b++){
				if (((1000 -b -a) * (1000 - b - a)) == ((a * a) + (b * b))){
					c = (1000 -b -a);
					System.out.println(a * b * c);
					return;
				}
			}
		}
	}

}
