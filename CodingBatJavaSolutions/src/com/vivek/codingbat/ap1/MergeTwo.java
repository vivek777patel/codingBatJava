package com.vivek.codingbat.ap1;

/*Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. 
 * Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates. 
 * A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B, 
 * taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.*/

public class MergeTwo {

	public String[] mergeTwo(String[] a, String[] b, int n) {
		String[] result = new String[n];
		int aIndex = 0;
		int bIndex = 0;
		for (int i = 0; i < n; i++) {
			int compare = a[aIndex].compareTo(b[bIndex]);
			if (compare < 0) {
				result[i] = a[aIndex];
				aIndex++;
			} else if (compare > 0) {
				result[i] = b[bIndex];
				bIndex++;
			} else {
				result[i] = a[aIndex];
				aIndex++;
				bIndex++;
			}

		}
		return result;
	}

}
