package com.Adrian;

import java.util.Scanner;

/**
 * @author Adrian Cieplicki
 * date 06/07/2024
 * Java class for number properties
 */

public class NumberStats {
	/**
	 * Main Method
	 * @param args Command line arguments
	 */
    public static void main(String[] args) {
    	// Get the user's input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        MyNumber number = new MyNumber(num);
        
        // Printing out number stats
        System.out.println(number.isEven());
        System.out.println(number.isOdd());
        System.out.println(number.isPrime());
        
    }
}
/**
 * Class for getting number stats
 */
class MyNumber {
	/**
	 * The value to be passed into the object
	 */
    private int val;
    
    /**
     * The constructor for the class
     * @param val The value to be given to the object
     */
    public MyNumber(int val) {
    	this.val = val;
    }

    /**
     * Getter for the value of the object's number
     * @return The number assigned to the object
     */
	public int getVal() {
		return val;
	}

	/**
	 * Checks whether the object's value is odd
	 * @return Whether the object's value is odd
	 */
	public boolean isOdd() {
		if (this.val % 2 != 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Checks whether the object's value is even
	 * @return Whether the object's value is even
	 */
	public boolean isEven() {
		if (this.val % 2 == 0) {
			return true;
		}
		return false;
	}
	/**
	 * Checks whether the object's value is prime
	 * @return Whether the object's value is prime
	 */
	public boolean isPrime() {
		if (this.val == 1) {
			return false;
		}
		for (int i = 2; i < this.val; i++) {
			if (this.val % i == 0) {
				return false;
			}
		}
		return true;
	}
}

