package com.vivek.codingbat.ap1;

/*Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.*/

public class WordsFront {

	public String[] wordsFront(String[] words, int n) {
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			result[i] = words[i];
		}
		return result;
	}

}
