package les10.palindromPack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter your string: ");
		Scanner in = new Scanner(System.in);
		String palindrom = in.nextLine();
		if (palindrom.length()!=5)
			throw new Exception("Your word hasn't 5 letters");
		else {
			StringBuilder sb = new StringBuilder(palindrom);
			if (palindrom.equalsIgnoreCase(sb.reverse().toString()))
					System.out.println("It's palindrom!");
		}
	}

}
