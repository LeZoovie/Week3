package W3Class;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Hashtable;


public class Week3CodingAssingment{
	Set<String> Dealership = new HashSet<String>();
	
	public static void main(String[] args) {
		
		
//	 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
//	   
//        a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		System.out.println(ages[0] - ages.length); 
		
 //       b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[] newAges = new int[ages.length];
		System.out.println(newAges[ages.length - 1]);
		
//        c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sumAges = 0;
		
		for (int i = 0; i < ages.length; i++) { 
		sumAges += ages[i];	
			
		}
			
		int averageAge = sumAges/ages.length;
		System.out.println(averageAge);
		
//    2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Sally", "Buck", "Bob"};
		
		
//        a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int lettersPerName = 0;
		
		for (int i = 0; i < names.length; i++) {
			lettersPerName += names[i].length();
		}
		int letterAverage = lettersPerName / names.length;
		System.out.println(letterAverage);
		
//        b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String concatenatedNames = "";
		
		for (int i = 0; i < names.length; i++) {
			concatenatedNames += names[i] + " ";
		}
			System.out.println(concatenatedNames);
		
 //  3. How do you access the last element of any array?
//   4. How do you access the first element of any array?
		String first = names[0];
		String last = names[names.length - 1];
		
			System.out.println("First: " + first + " " + "Last: "+ last );
					
 //   5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[7];	
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
				
 //   6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sumOfNameLengths = 0;
		
		for (int i = 0; i < nameLengths.length; i++) {
			sumOfNameLengths += nameLengths[i];
		}
			System.out.println(sumOfNameLengths);
	}	
 //   7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public class methods{ 
		
			static String methodOne(String word, int n) {
				String concatenatedWord = word;
				for (int i = 1; i < n; i++) {
					concatenatedWord += word;
				}
				return concatenatedWord;
			}
			
  //  8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		static String fullName(String firstName, String lastName) {
			return firstName + " " + lastName;
		}
			static String fullNameTwo(String x, String y) {
				return x + " " + y;	
		}	
			
			
 //   9. Write a method that takes an array of int and returns true if the sum of all the ints in the array are greater than 100.	
		static boolean greaterThanOneHundred(int[] numbers) {
			int sum = 0;
			for(int number : numbers) {
				sum += number;
			}
			if (sum > 100) {
				return true;
			}else {
				return false;
			}
			
		}			
		
  //  10. Write a method that takes an array of double and returns the average of all the elements in the array.
		static double arrayAverage(double[] array) {
			double sum = 0;
			double average = 0;
			for (double numbers : array) {
				sum += numbers;
				average = sum/array.length;
			}
			return average;
		}
		
		
 //   11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	 static boolean firstAverageIsGreater(double array1[], double array2[]) {
		 
		 System.out.print("Does the first array have a greater average than the second array? ");
			System.out.println(firstAverageIsGreater(array1, array2));
			System.out.println();
	
		 	double sum1 = 0;
			double average1 = 0;
			
			for (double numbers : array1) {
				sum1 += numbers;
				average1 = sum1/array1.length;
			}
			double sum2 = 0;
			double average2 = 0;
			
			for (double numbers : array2) {
				sum2 += numbers;
				average2 = sum2/array2.length;
			}
			return average1 > average2;				
			
	 }	
		
 //   12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	 static boolean willBuyDrink(Boolean isHotOutside, double moneyInPocket) {
		 return (isHotOutside && moneyInPocket > 10.50);
			
		}
		 
	 }
 //   13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	// this hashMap uses two arrays that can be used to look up flowers by colors.
	
	public static Map<String, String> Color(String names[], String flowers[]) {
		Map <String, String> newMap = new HashMap<>();
		for (int i = 0; i < flowers.length; i++) {
			newMap.put(names[i], flowers[i]);  
		}
		return newMap;
	}
  }	