package com.vivek.codingbat.ap1;

import java.util.ArrayList;
import java.util.List;

public class WordsWithout {

	public String[] wordsWithout(String[] words, String target) {
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals(target)) {
				result.add(words[i]);
			}
		}
		return result.toArray(new String[result.size()]);
	}

}
