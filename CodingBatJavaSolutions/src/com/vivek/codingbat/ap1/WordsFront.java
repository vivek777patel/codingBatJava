package com.vivek.codingbat.ap1;

public class WordsFront {

	public String[] wordsFront(String[] words, int n) {
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			result[i] = words[i];
		}
		return result;
	}

}
