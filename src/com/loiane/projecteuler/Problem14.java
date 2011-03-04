package com.loiane.projecteuler;

/**
 * It can be seen that this sequence (starting at 13 and finishing
 * at 1) contains 10 terms. Although it has not been proved yet
 * (Collatz Problem), it is thought that all starting numbers finish at 1.
 *
 * Which starting number, under one million, produces the longest chain?
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 * 
 * Answer is 837799
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class Problem14 {

	public static void main(String[] args) {

		int maxCount = 0;
		int count;
		int number = 0;
		
		for (int i=1; i<=1000000; i++){
			count = collatz(i);
			if (maxCount < count){
				maxCount = count;
				number = i;
			}
		}
		
		System.out.println(number);
	}

	static int collatz(long n){
		 
        int count = 1;
        
        while (n > 1){
            if ((n % 2) == 0){
                n /= 2;
            } else{
                n = (n*3)+1;
            }
            count++;
        }
        
        return count;
    }

}
