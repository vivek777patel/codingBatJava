package com.vivek.codingbat.ap1;

import java.util.*;

/*Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. 
 * Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, 
 * taking advantage of the fact that they are in alphabetical order.*/


public class CommonTwo {

	public int commonTwo(String[] a, String[] b) {
		int result=0;
		List<String> avail = new ArrayList<String>();
		List<String> list =  Arrays.asList(a);
		for(int i=0;i<b.length;i++) {
			if(list.contains(b[i]) && !avail.contains(b[i])) {
				result++;
				avail.add(b[i]);
			}
		}
		return result;
	}

	
}
