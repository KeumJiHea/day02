package day02;

public class Ex04 {

	public static void main(String[] args) {
		int num = 1;
		if(num%2==0) {
			System.out.println("짝수");
		}
		if(num%2!=0) {
			System.out.println("홀수");
		}
		
		
		if(num > 10) {
			System.out.println("1. num은 10보다 작다."); //if문 종속문장
			System.out.println("2. num은 10보다 작다."); 
			System.out.println("3. num은 10보다 작다."); 
		}
		System.out.println("다음 문장들 실행");

	}

}
