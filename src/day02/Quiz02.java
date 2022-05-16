package day02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력: ");
		int su1 = sc.nextInt();
		
		String s = (su1%2==0)? "짝수":"홀수";
		System.out.println(su1 + " = " + s);
		
		String s3 = (su1%3==0)? "3의 배수이다":"3의 배수가 아니다";
		System.out.println(su1 + " = " + s3);
		
		System.out.print("두 수 입력: ");
		int su2 = sc.nextInt();
		int su3 = sc.nextInt();
		
		System.out.println("num1: " + su2 + ", num2: " + su3);
		String big = (su2>su3)? "num1이 num2보다 크다":"num2가 num1보다 크다";
		System.out.println(big);
		
	}

}
