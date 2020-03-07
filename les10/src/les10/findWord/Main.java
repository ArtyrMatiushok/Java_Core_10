package les10.findWord;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter you text: ");
		String text = in.nextLine();
		String[] arr = text.split("\\W+");
		int[] num = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j]))
					num[i]++;
			}
		}
		int max = num[0];
		int index = 0;
		for (int i = 0; i < num.length; i++)
			if (num[i] > max) {
				max = num[i];
				index = i;
			}
		System.out.println("The most common word: " + arr[index] + " - " + num[index]);
		/*
		 * HashMap<String, Integer> store = new HashMap<String, Integer>(); int c; for
		 * (int i = 0; i < arr.length; i++) { c = 0; for (int j = 0; j < arr.length;
		 * j++) if (arr[i].equalsIgnoreCase(arr[j])) c++; store.put(arr[i], c); }
		 * System.out.println(store);
		 */
	}

}
