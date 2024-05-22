package javapratice;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


public class Removecommon {

	void remove(int[] arr1, int[] arr2) {
		List<Integer> set1 = new ArrayList<Integer>();
		List<Integer> set2 = new ArrayList<Integer>();

		for (int i : arr1) {
			set1.add(i);
		}
		for (int i : arr2) {
			set2.add(i);
		}
		set1.removeAll(set2);
		set2.removeAll(set1);
		System.out.println("unique element" + set1);
		System.out.println("unique element" + set2);
	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 4,4, 1, 6 };
		int[] arr2 = { 5, 2, 1, 7 };
		//System.out.println("Array1:"+ Arrays.toString(arr1));
		//System.out.println("Array1:"+ Arrays.toString(arr2));
		
		
		new Removecommon().remove(arr1, arr2);

	}

}
