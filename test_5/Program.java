package test_5;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String path = "fibonacci";
		String pathReverse = "";
		
		for (int i = path.length() - 1; i >= 0; i--) {
			pathReverse += path.charAt(i);
		}
		
		System.out.println(path);
		System.out.println(pathReverse);
	}

}
