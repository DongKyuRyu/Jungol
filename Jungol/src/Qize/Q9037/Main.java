package Qize.Q9037;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. ");
		int score = sc.nextInt();
		sc.close();

		if (score > 90) {
			System.out.println("A");
		} else if (score > 80) {
			System.out.println("B");
		} else if (score > 70) {
			System.out.println("C");
		} else if (score > 60) {
			System.out.println("D");
		} else if (score > 50) {
			System.out.println("F");
		}
	}
}
