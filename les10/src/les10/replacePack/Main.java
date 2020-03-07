package les10.replacePack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = in.nextLine();
		System.out.println("New str: " + str.replaceAll("[aeiouyAEIOUY]", "-"));
	}

}
