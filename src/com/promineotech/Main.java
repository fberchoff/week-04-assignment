package com.promineotech;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Coding step #1 - Create the array of ages
		
		int ages[] = {3, 9, 23, 64, 2, 8, 28, 93};
		
		
		// Coding Steps #1a - Calculate difference between last and first elements
		
		/* The printCalculations method will print the list as well as the difference between
		 * the last and first elements
		 */
		
		printCalculations(ages);
		
		
		// Coding Step #1c - Print the average of a set of elements
		
		// The printAverage method will print the average of the elements
		
		printAverage(ages);
		
		
		// Coding step #1b - Create a new array of integers
		
		// Next we will create a new array of retired New York Mets numbers to test with
		
		int retired[] = {14, 16, 17, 18, 24, 31, 36, 37, 41};


		// Coding Step #1b - Re-test the difference calculation using the new array
		
		/* The printCalculations method will print the list as well as the difference between
		 * the last and first elements
		 */
		
		System.out.println("");		
		System.out.println("");
		
		printCalculations(retired);
		
		
		// Repeat step #1c for the new array
		
		// The printAverage method will print the average of the elements
		
		printAverage(retired);
		
		
		// Coding step #2 - Create the array of names
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		
		// Coding step #2a - Calculate average number of letters per name
		
		/* We need a variable to hold the sum of all the letters across all the names. We will make
		 * it a double so that our calculation of the average gets decimal places for a more accurate
		 * result
		 */
		
		double letterSum = 0;
		
		for (String name : names) {
			letterSum += name.length();
		}
		
		// Now let's print the average number of letters per name
		
		System.out.println("");
		System.out.println("");
		System.out.println("List of names: " + Arrays.toString(names));
		System.out.println("Average number of letters per name: " + (letterSum / names.length));
		
		
		// Step #2b - Concatenate the names
		
		// Let's create a string variable that will hold the concatenated list of names
		
		String concatenated = "";
		
		for (String name : names) {
			concatenated += (name + " ");
		}
		
		// Next let's print the names concatenated by spaces
		
		System.out.println("List of names concatenated: " + concatenated);
		
		
		// Step #3 - You access the last element of an array as follows:
		
		System.out.println("The last element of names is: " + names[names.length - 1]);
		
		
		// Step #4 - You access the last element of an array as follows:
		
		System.out.println("The first element of names is: " + names[0]);
		
		
		// Step #5 - Create an array of name lengths
		
		int nameLengths[] = new int[names.length];
		
		for (int i=0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		System.out.println("The lengths of the names: " + Arrays.toString(nameLengths));
		
		
		// Step #6 - Sum up all the lengths of the names array and write to the console
		
		// We need a variable to keep track of the sum
		
		int sumOfLengths = 0;
		
		for (int nameLength : nameLengths) {
			sumOfLengths += nameLength;
		}
		
		System.out.println("The sum of the name lengths is: " + sumOfLengths);
		
		
		System.out.println("");
		System.out.println("");
		
		
		//Step # 7 - Concatenate a word n number of times
		
		System.out.println("Here is a word concatenated three times: " + concatenateWord("Hello", 3));
		

		System.out.println("");
		System.out.println("");
		
		
		//Step #8 - Give a first name and last name and get back the full name
		
		System.out.println("Here is a full name: " + fullName("Frank", "Berchoff"));
		
		System.out.println("");
		System.out.println("");
		
		
		//Step #9 - See if the sum of a list of integers is greater than 100
		
		// Let's first test an array we already have.  We have an array called retired
		
		System.out.println("Does array retired have a sum greater than 100 (true or false)? "
									+ isGreater(retired, 100));
		
		// Now let's make a new array that has a sum of values = 99
		
		int[] numberList = {33, 33, 33};
		
		System.out.println("Does array numberList have a sum greater than 100 (true or false)? "
				                    + isGreater(numberList, 100));
		
		System.out.println("");
		System.out.println("");
		
		
		//Step #10 - Give an array of double and get the average
		
		//Let's define the needed array
		
		double[] doubleArray = {15.21, 5.45, 54.635, 10, 8};
		
		System.out.println("Here is my doubleArray: " + Arrays.toString(doubleArray));
		System.out.println("The average of all the values is: " + getAverage(doubleArray));
		
		System.out.println("");
		System.out.println("");
		
		
		/*Step #11 - Find out if the average of the elements in the first array is greater than the
		 * average of the elements in the second array
		 */
		
		// Let's create our two arrays of double.
		
		double[] firstArray = {5.25, 3.143, 2.67, 4, 1.89, 3.14};
		double[] secondArray = {8, 4.54876, 3.25, 6.13};
		
		System.out.println("First Array is: " + Arrays.toString(firstArray));
		System.out.println("Second Array is: " + Arrays.toString(secondArray));
		System.out.println("Is the average of the first array greater (true or false)? "
				 + isFirstAverageGreater(firstArray, secondArray));
		
		System.out.println("");
		System.out.println("");
		
		
		// Now let's swap the arrays and we should get a different answer:
		
		System.out.println("First Array is: " + Arrays.toString(secondArray));
		System.out.println("Second Array is: " + Arrays.toString(firstArray));
		System.out.println("Is the average of the first array greater (true or false)? "
				 + isFirstAverageGreater(secondArray, firstArray));
		
		System.out.println("");
		System.out.println("");
		

		//Step #12 - Method willBuyDrink
		
		// Let's first test where we can get the drink
		
		System.out.println("It is hot outside and I have $10.51.  Can I get a drink (true or false)? "
				                + willBuyDrink(true, 10.51));
		
		// Let's next test where I don't have enough money
		
		System.out.println("It is hot outside and I have $10.50.  Can I get a drink (true or false)? "
				                + willBuyDrink(true, 10.50));
		
		// Let's next test where I it's not hot outside
		
		System.out.println("It's not hot outside and I have $12.00.  Can I get a drink (true or false)? "
				                + willBuyDrink(false, 12.00));
		
		
		System.out.println("");
		System.out.println("");
		
		
		/* Step #13 - Here is a method that will decode a string of letters to create a meaningful 
		 * message. This can be used if you want to send someone a secret message without another person
		 * understanding.  The method will use each letter that appears in the character position that
		 * is divisible by 3 
		 */
		
		// Let's create the secret message
		
		String secretMsg = "crhadflpolwetoohxselupiqoxdlpliwvcnmeot!";
		
		System.out.println("The secret message is: " + secretMsg);
		System.out.println("The decoded message is: " + decodeMessage(secretMsg));	
		
		
	}
	
	
	public static void printCalculations (int ages[]) {
		
		System.out.println("List of integers: " + Arrays.toString(ages));
		System.out.println("Difference between last and first: " + (ages[ages.length - 1] - ages[0]));
		
	}
	
	
	public static void printAverage(int ages[]) {
		
	// this method will print the average of a set of numbers.
		
	/* We need a variable to keep track of the sum of the numbers.  We will make sum a double
	 * so that when we perform the calculation of the average, we will get decimal places for
	 * a more accurate value
	 */
		
		double sum = 0;
		
	// Next let's loop through the numbers to get the sum
		
		for (int age : ages) {
			sum += age;
		}
	
	// Now that we have the sum of the numbers, let's print the average
		
		System.out.println("The average is: " + (sum / ages.length));
		
	}
	
	
	//Step #7 - Method that concatenates a word to itself
	
	public static String concatenateWord(String word, int n) {
		
	// Let's create a variable to hold the string to be returned
		
		String returnString = "";
		
		for (int i=1; i <= n; i++) {
			returnString += word;
		}
		
		return returnString;
		
	}
	
	
	//Step #8 - Method that creates a full name
	
	public static String fullName(String firstName, String lastName) {
		
		return (firstName + " " + lastName);
	}
	
	
	/*Step #9 - Take an Array of int and return whether the sum of the ints is greater than
	 * a given number (in my version of this method, you can give any number)
	 */
	
	public static boolean isGreater(int[] intList, int inValue) {
		
	// Let's create a variable to hold the sum of the elements
		
		int intSum = 0;
		
		for (int value : intList) {
			intSum += value;
		}
		
		return (intSum > inValue);
	}
	
	
	
	// Step #10 - Take an Array of double and calculate the average
	
	public static double getAverage(double[] inArray) {
		
	// Create a variable to hold the sum of all the incoming values
		
		double sumOfValues = 0;
		
		for (double value : inArray) {
			sumOfValues += value;
		}
		
		return sumOfValues / inArray.length;
	}
	
	
	/* Step #11 - Take two arrays of double and say whether the average of the elements in the first
	 * array is greater than the average of the elements in the second array
	 */
	
	public static boolean isFirstAverageGreater(double[] firstArray, double[] secondArray) {
		
		// Let's create variables to hold the sums of the elements in each array.  We will use two
		// different loops because it's possible that each array contains a different number of values
		
		double sumOfFirst = 0;
		double sumOfSecond = 0;
		
		for (double firstValue : firstArray) {
			sumOfFirst += firstValue;
		}
		
		for (double secondValue : secondArray) {
			sumOfSecond += secondValue;
		}
		
		
		return ((sumOfFirst / firstArray.length) > (sumOfSecond / secondArray.length));
		
	}
	
	
	// Step #12 - method willBuyDrink
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		return (isHotOutside && (moneyInPocket > 10.50));
	}
	
	
	// Step #13 - This method will decode a message by accepting a string and then using each
	//            letter that is in a character position divisible by three. The result will be
	//            an important message.
	
	
	public static String decodeMessage(String secretMsg) {
		
    // We need to define a variable that will hold the return message
		
		String returnMsg = "";
		
		for (int i=0; (i < secretMsg.length()); i++) {
			if (i % 3 == 0) {
				returnMsg += secretMsg.substring(i, i + 1);
			}
		}
		
		return returnMsg;
	}
	

}
