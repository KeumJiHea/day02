package day02;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		// 문제 1
		// 시험 점수를 입력 받고 70점 이상이면 Pass, 70점 미만이면 Fail을 출력하시오.
		
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		int score = input.nextInt();
		
		if(score>=70) {
			System.out.println("Pass!");
		}
		if(score<70) {
			System.out.println("Fail!");
		}
		*/
		
		
		// 문제 2
		// 정수를 입력 받고 입력 받은 수가 양수라면 "양수" 음수라면 "음수"를 출력하시오.
		// 만약 0을 입력할 시 "0을 제외한 수를 입력해주세요."를 출력하시오.
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력: ");
		int num = input.nextInt();
		
		if(num>0) {
			System.out.println("양수");
		}
		if(num<0) {
			System.out.println("음수");
		}
		if(num==0) {
			System.out.println("0을 제외한 수를 입력해주세요.");
		}
		*/
		
		
		// 문제3. 보기를 만들고 선택한 음료를 출력하세요.
		// 보기) 1. 콜라 2. 제티 3. 커피
		
		/*
		 Scanner input = new Scanner(System.in);
		
		System.out.println("==========");
		System.out.println("1. 콜라");
		System.out.println("2. 제티");
		System.out.println("3. 커피");
		System.out.println("==========");
		
		System.out.print("음료 선택: ");
		int user = input.nextInt();
		
		if(user == 1) {
			System.out.println("콜라");
		}
		if(user == 2) {
			System.out.println("제티");
		}
		if(user == 3) {
			System.out.println("커피");
		}
		*/
		
		//문제4. 국어 점수와 영어 점수를 입력받고,
		//	    평균이 80점 이하라면 불합격, 80점 초과는 합격을 출력하세요.
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.println("국어 점수 입력: ");
		int kor = input.nextInt();
		
		System.out.println("영어 점수 입력: ");
		int eng = input.nextInt();
		
		double avg = (kor+eng)/2.0;
		
		if(avg>80) {
			System.out.println("합격");
		}
		if(avg<=80) {
			System.out.println("불합격");
		}
		*/
		
		//문제5. 첫 번째 수를 입력하고 두 번째 수를 입력한 뒤
		//      첫 번째 수가 두 번째 수의 배수인지 출력해주는 프로그램을 만드시오.
		
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력: ");
		int num1 = input.nextInt();
		System.out.print("두 번째 수 입력: ");
		int num2 = input.nextInt();
		
		if(num1%num2==0) {
			System.out.println(num1 + "은 " + num2 + "의 배수입니다.");
		}
		if(num1%num2!=0) {
			System.out.println(num1 + "은 " + num2 + "의 배수가 아닙니다.");
		}
		*/
		
		//문제6. 수를 입력하고 그 수가 3과 5의 공배수인지 출력해주는 프로그램을 만드시오.
		
		/* Scanner input = new Scanner(System.in);
		
		System.out.print("수 입력: ");
		int num = input.nextInt();
		
		if(num%3==0 && num%5==0){
			System.out.println(num + "은 3과 5의 공배수입니다.");
		}
		if(num % 3 != 0 && num % 5 == 0) {
			System.out.println(num+"은 3과 5의 공배수가 아닙니다");
		}
		if(num % 3 == 0 && num % 5 != 0) {
			System.out.println(num+"은 3과 5의 공배수가 아닙니다");
		}
		if(num % 3 != 0 && num % 5 != 0) {
			System.out.println(num+"은 3과 5의 공배수가 아닙니다");
		}
		*/
		
		// 5조 문제1
		// 국어, 영어 성적을 입력 받고, 평균이 90점 이상이면 "A", 80점 이상이면 "B"
		// 70점 이상이면 "C", 69점 미만이면 "D"가 나오도록 하시오.
		
		
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.print("국어 성적 입력: ");
		int kor = input.nextInt();
		System.out.print("영어 성적 입력: ");
		int eng = input.nextInt();
		
		double avg = (kor+eng)/2.0;
		
		if(avg>=90) {
			System.out.println("A");
		}
		if(avg>=80 && avg<90) {
			System.out.println("B");
		}
		if(avg>=70 && avg<80) {
			System.out.println("C");
		}
		if(avg<70) {
			System.out.println("D");
		}
		*/
		
		// 5조 문제2
		// A, B, C, D가 순서대로 청소 당번을 한다. 첫날 A가 당번이라면 N일 후에는 누가 당번인가?
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("몇 일 후?");
		int n = input.nextInt();
		
		if(n%4==1) {
			System.out.println("청소당번은 B");
		}
		if(n%4==2) {
			System.out.println("청소당번은 C");
		}
		if(n%4==3) {
			System.out.println("청소당번은 B");
		}
		if(n%4==0) {
			System.out.println("청소당번은 A");
		}
		*/
		
		
		// 5조 문제3
		// 상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.
		// 상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.
		// 이런 상근이를 불쌍하게 보던, 창영이는 자신이 사용하는 방법을 추천해 주었다.
		// 바로 "45분 일찍 알람 설정하기"이다.
		// 이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
		// 현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
		// (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("현재 설정된 알람 시간");
		System.out.print("시: ");
		int hour = input.nextInt();		
		System.out.print("분: ");
		int min = input.nextInt();	
		System.out.println(hour + "시 " + min + "분");
		System.out.println();
		

		System.out.println("알람을 45분 전으로 수정합니다.");
		
		int rmin=0;
		int rhour=0;
		
		if(min>=45) {
			rmin =min-45;
			rhour=hour;
		}
		
		if(min<45) {
			rhour=hour-1;
			rmin=min+15;
		}
		
		if(hour==0 && min<45) {
			rhour=23;
			rmin=min+15;
		}
		
		System.out.println("수정된 알람 시간");
		System.out.println(rhour + "시 " + rmin + "분");
		*/
		
		
		// 5조 문제 4
		// 오늘은 목요일! 아래 8개 요일의 코드를 나열해주세요.
		// (월 M, 화 T, 수 W, 목 T, 금 F, 토 S, 일 S)
		// - 19일 후, 54일 후, 203일 후, 601 후, 1923일 후, 3092일 후, 8930일 후, 19203일 후
		

		
		
		
		
		
		
	}
	
	
	

}
