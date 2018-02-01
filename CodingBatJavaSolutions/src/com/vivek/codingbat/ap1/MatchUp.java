package com.vivek.codingbat.ap1;

/*Given 2 arrays that are the same length containing strings, 
 * compare the 1st string in one array to the 1st string in the other array, 
 * the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty and start with the same char. 
 * The strings may be any length, including 0.*/

public class MatchUp {

	public int matchUp(String[] a, String[] b) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			if (!"".equals(a[i]) && !"".equals(b[i]) && (a[i].startsWith(b[i]) || b[i].startsWith(a[i])))
				result++;
		}
		return result;
	}
}
