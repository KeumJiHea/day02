package day02;

public class Ex02 {

	public static void main(String[] args) {
		int num1 = 9, num2 = 2;
		System.out.println(num1/num2);
		System.out.println(num1/(double)num2);
		System.out.println(num1/2.0);
		System.out.println(num1%num2);
		
		/* 복합 대입 연산자
		 * a = 10, b = 5
		 * a = a + b; -> a+=b;
		 * a = a - b; -> a-=b;
		 * a = a * b; -> a*=b;
		 * a = a / b; -> a/=b;
		 */
		System.out.println();
		
		int a=10, b=5;
		a+=b;
		System.out.println(a);
		
		System.out.println();
		
		int su1, su2;
		su1=su2=5;
		
		System.out.println(su1+=1); //su1=6 su2=5 
		System.out.println(su1-=1); //su1=5 su2=5
		System.out.println(su1*=su2); //su1=25 su2=5
		System.out.println(su1/=su2); //su1=5 su2=5
		System.out.println(su1%=su2); //su1=0 su2=5
		
		/* 관계 연산자: 결과로 참(true) 또는 거짓(false) 도출
		 * 관계 연산자는 이항 연산자이며 연산자 사이 피 연산자가 두 개 온다.
		 * a=10, b=5;
		 * a > b: true
		 * a =< b: false
		 * a == b: false
		 * a != b: true
		 * 10 > 5 > 2 이런 거 사용 못 함
		 */
		System.out.println();
		double do1 = 3.1, do2 = 3.0;
		System.out.println(do1 <= do2); //false
		System.out.println(do1 >= do2); //true
		System.out.println(do1 == do2); //false
		System.out.println(do1 != do2); //true
		
		/* 논리 연산자: 결과로 참(true) 또는 거짓(false) 도출
		 * &&(and): 모두가 참일 때 참
		 * ||(or): 둘 중 하나가 참일 때 참
		 * !(not): 반전
		 */
		System.out.println();
		
		int su3;
		su1 = 10; su2=20; su3=30;
		System.out.println(su1>su2 && su1>su3);
		System.out.println();
		System.out.println("===and===");
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); //false
		System.out.println();
		System.out.println("===or===");
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		System.out.println(false || true); //true
		System.out.println(false || false); //false
		System.out.println();
		System.out.println("===not===");
		System.out.println(!true); //false
		System.out.println(!false); //true
		
		
		/* 증감 연산자: 결과적으로 자기 자신을 1 증가 또는 감소
		 * a = 10;
		 * ++a: 전치 또는 전위
		 * a++: 후치 또는 후위
		 * a++, ++a => a = a+1;
		 * a--, --a => a = a-1;
		 * 
		 */
		
		System.out.println();
		System.out.println("===증감 연산자===");
		su1 = 10;
		su2 = su1++; //연산 후에 1 증가
		System.out.println("su1= " + su1);
		System.out.println("su2= " + su2);
		
		su1 = 10;
		su2 = ++su1; //연산 전에 1 증가
		System.out.println("su1= " + su1);
		System.out.println("su2= " + su2);
		
		/*
		 * 삼항 연산자(조건 연산자)
		 * 변수 = 식? 참(값) : 거짓(값);
		 */
		System.out.println();
		System.out.println("===삼항 연산자===");
		su1 = 9;
		String s = (su1%2==0)? "짝수":"홀수";
		System.out.println(su1 + "은(는) " + s);
		
	}

}
