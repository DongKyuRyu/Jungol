package Qize.Q121;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("zero");
		} else if (num > 0) {
			System.out.println("plus");
		} else if (num < 0) {
			System.out.println("minus");
		}
		sc.close();
	}
}
