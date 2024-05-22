package javapratice;

import java.util.Arrays;

public class Pratice76 {
	
	void getMaxNumber(int[] arr1, int[] arr2){
		int[] output= new int[arr1.length];
		for(int i=0; i< arr1.length; i++) {
			output[i]= arr1[i]>arr2[i]?arr1[i]:arr2[i];
			//System.out.println(output[i]);
		}
		System.out.println("MaxNumber"  + Arrays.toString(output));
	}
	void getMinNumber(int[] arr1, int[] arr2){
		int[] output= new int[arr1.length];
		for(int i=0; i< arr1.length; i++) {
			output[i]= arr1[i]<arr2[i]?arr1[i]:arr2[i];
			//System.out.println(output[i]);
		}
		System.out.println("MinNumber"  + Arrays.toString(output));
	}
	void getunionOfArray(int[] arr1, int[] arr2){
		int count=0;
		int[] output= new int[arr1.length+ arr2.length];
		for(int i=0; i<arr1.length; i++) {
			output[i]=arr1[i];
			count++;
			//System.out.println(count);
		}
		for(int i=0; i<arr2.length; i++) {
			output[count]=arr2[i];
			count++;
			//System.out.println(count);
		}
		System.out.println(   Arrays.toString(output));
	}
	void printunion(int[] arr1, int[] arr2) {
		int[]output= new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			output[i]= arr1[i]+arr2[i];
		}
		Arrays.sort(output);
		System.out
		.println("Condition 4: Array sortedv after indexwise addition of numbers: " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] num1 = { 23, 34, 46, 67, 87 };
		int[] num2 = { 65, 43, 78, 45, 90 };
		Pratice76 pratice76 = new Pratice76();
		pratice76.getMaxNumber(num1, num2);
		pratice76.getMinNumber(num1, num2);
		pratice76.getunionOfArray(num1, num2);
		pratice76.printunion(num1, num2);
	}

}
