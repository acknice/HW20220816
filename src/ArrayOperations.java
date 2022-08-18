import java.util.*;

public class ArrayOperations {

	public static void toPower(int size, int power) {
		int[] powerArray = new int[size];
		for (int i = 0; i < powerArray.length; i++) {
			int result = 1;
			for (int p = 0; p < power; p++) {
				result *= i;
			}
			powerArray[i] = result;
		}
		System.out.println(Arrays.toString(powerArray));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Write a program to sum all the values of a given Array in Java

			System.out.println("Exercise 1:");
		
			Double randomNum = ((Math.random() * 8) + 3);
			int arrayLength = randomNum.intValue();
			
			int[] sampleArray = new int[arrayLength];
			
			
			for (int i = 0; i < arrayLength; i++) {
				randomNum = (Math.random() * 100);
				int arrayValue = randomNum.intValue();
				sampleArray[i] = arrayValue;
			}
			
			System.out.println("The randomly generated array for this excercise is:");
			System.out.println(Arrays.toString(sampleArray));
			
			int arraySum = 0;
					
			for(int i = 0; i < sampleArray.length; i++) {
				arraySum += sampleArray[i];
			}
			
			System.out.println("The sum of the numbers in this array is:");
			System.out.println(arraySum);
			
		//2. The sample code in the hw assignment will output the number 2, which is the index of the highest value in the array (6).
			
		//3. Write a public static method called "toPower" that takes in as parameters two integers called size and power. 
		//		The method should return an array of size "size" with each array index raised to the value of "power."
			
		//  method is declared above
			System.out.println("Exercise 2:");
			
			Scanner parameter = new Scanner(System.in);
			
			System.out.println("Please set the size of the array:");
			int arraySize = parameter.nextInt();
			System.out.println("Please set the power of the array:");
			int arrayPower = parameter.nextInt();
			
			toPower(arraySize, arrayPower);	
	}

}
