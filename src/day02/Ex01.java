package day02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		/*final String KOREA = "대한민국";
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
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 이름은 무엇입니까?");
		String name = sc.next();
		
		System.out.println(name + " 님의 국어 점수: ");
		int kor = sc.nextInt();
		
		System.out.println(name + " 님의 영어 점수: ");
		int eng = sc.nextInt();
		
		System.out.println(name + " 님의 수학 점수: ");
		int mat = sc.nextInt();
		
		System.out.println("================");
		System.out.println("이 름 : " + name);
		System.out.println("================");
		System.out.println("국 어 : " + kor);
		System.out.println("영 어 : " + eng);
		System.out.println("수 학 : " + mat);
		System.out.println("================");
		System.out.println("합 계 : " + (kor+eng+mat));
		System.out.println("================");
		
		
	}

}
