package com.vivek.codingbat.ap1;

/*Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. 
 * The original array will contain at least "count" even numbers.*/

public class CopyEvens {

	public int[] copyEvens(int[] nums, int count) {
		int result[] = new int[count];
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				result[counter] = nums[i];
				counter++;
				if (counter == count)
					break;
			}
		}
		return result;
	}

}
