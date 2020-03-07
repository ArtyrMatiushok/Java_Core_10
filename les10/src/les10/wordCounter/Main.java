package les10.wordCounter;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = in.nextLine();
		String[] arr = str.split("\\W+");
		System.out.println(Arrays.toString(arr));
		System.out.println("Count of words in str: " + arr.length);
	}

}
