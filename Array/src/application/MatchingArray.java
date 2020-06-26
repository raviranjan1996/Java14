package application;

public class MatchingArray {

	int a = 3;
	int b = 4;
	String str1 = "ravi";
	String str2 = "ravi";

	int[] array1 = { 1, 2, 3 ,6};
	int[] array2 = { 2, 2, 3 ,6 };
	int count = 0;

	boolean intMatch() {
		if (a == b) {
			return true;
		}
		return false;
	}

	boolean stringMatch() {
		if (str1.equals(str2)) {
			return true;
		}
		return false;
	}

	boolean intArrayMatch() {
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (array1[i] == array2[j] && array1.length == array2.length) {
					count++;
					break;
				}
				if (array1.length > array2.length || array2.length > array1.length) {
					break;
				}
			}
		}

		if (count == array1.length) {
			return true;
		} else {
			return false;
		}
	}
}
