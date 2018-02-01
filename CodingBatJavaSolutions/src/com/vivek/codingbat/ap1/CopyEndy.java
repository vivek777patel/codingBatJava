package com.vivek.codingbat.ap1;

/*We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). 
 * Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array. 
 * Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.
*/
public class CopyEndy {

	public int[] copyEndy(int[] nums, int count) {
		int result[] = new int[count];
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] >= 0 && nums[i] <= 10) || (nums[i] >= 90 && nums[i] <= 100)) {
				result[counter++] = nums[i];
				if (counter == count)
					break;
			}
		}
		return result;
	}

}
