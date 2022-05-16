package day02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		final String KOREA = "대한민국";
		System.out.println(KOREA);
		//final을 앞에 쓰면 절대적으로 변경할 수 없는 고정된 값이 됨
		//final 변수는 대문자로 이름 짓기
		//korea = "뱀파이어테일";
		//System.out.println(korea);
		
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String name = input.next();
		int age;
		System.out.println("나이 입력: ");
		age = input.nextInt();
		
		System.out.println(name + " 님의 나이는 " + age + "세 입니다.");
		
		

		
	}

}
