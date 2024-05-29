package junit2;

public class Calculate {
	  public static double calculateSquareRoot(double number) {
	        if (number < 0) {
	            throw new IllegalArgumentException("Number must be non-negative");
	        }
	        return Math.sqrt(number);
	    }
	}