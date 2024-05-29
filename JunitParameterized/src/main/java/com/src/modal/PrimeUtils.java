package com.src.modal;
public class PrimeUtils {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number) + 1; i++) {
            if (number % i == 0) {
                return true;
            }
        }
		return false;
    }
    public static boolean iseven(int number) {
		return number % 2 == 0;
    	
    }

}
