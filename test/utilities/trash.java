package utilities;

import java.util.ArrayList;

public class trash {

	public static void main(String args[]) {

		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(print(num));

	}

	public static boolean print(int num[]) {

		for (int i = 0; i < num.length; i++) {
			if (num[i] == 10) {
				return true;
			}
		}
		return false;
	}

}
