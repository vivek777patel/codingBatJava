package com.vivek.codingbat.ap1;

/*Given an array of scores, return true if there are scores of 100 next to each other in the array. 
 * The array length will be at least 2.*/

public class Scores100 {

	public boolean scores100(int[] scores) {
		int first = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (first == 100 && scores[i] == first)
				return true;
			first = scores[i];
		}

		return false;
	}

}
