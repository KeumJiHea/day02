package day02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է�: ");
		int su1 = sc.nextInt();
		
		String s = (su1%2==0)? "¦��":"Ȧ��";
		System.out.println(su1 + " = " + s);
		
		String s3 = (su1%3==0)? "3�� ����̴�":"3�� ����� �ƴϴ�";
		System.out.println(su1 + " = " + s3);
		
		System.out.print("�� �� �Է�: ");
		int su2 = sc.nextInt();
		int su3 = sc.nextInt();
		
		System.out.println("num1: " + su2 + ", num2: " + su3);
		String big = (su2>su3)? "num1�� num2���� ũ��":"num2�� num1���� ũ��";
		System.out.println(big);
		
	}

}
