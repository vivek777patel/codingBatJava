package com.vivek.codingbat.ap1;

/*We'll say that a positive int divides itself if every digit in the number divides into the number evenly. 
 * So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. 
 * We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. 
 * Note: use % to get the rightmost digit, and / to discard the rightmost digit.*/

public class DividesSelf {

	public boolean dividesSelf(int n) {
		int input = n;
		while (n > 0) {
			int x = n % 10;
			if (x == 0)
				return false;
			if (input % x != 0)
				return false;
			n = n / 10;
		}

		return true;
	}
}
