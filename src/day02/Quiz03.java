package day02;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		// ���� 1
		// ���� ������ �Է� �ް� 70�� �̻��̸� Pass, 70�� �̸��̸� Fail�� ����Ͻÿ�.
		
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int score = input.nextInt();
		
		if(score>=70) {
			System.out.println("Pass!");
		}
		if(score<70) {
			System.out.println("Fail!");
		}
		*/
		
		
		// ���� 2
		// ������ �Է� �ް� �Է� ���� ���� ������ "���" ������� "����"�� ����Ͻÿ�.
		// ���� 0�� �Է��� �� "0�� ������ ���� �Է����ּ���."�� ����Ͻÿ�.
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("�� �Է�: ");
		int num = input.nextInt();
		
		if(num>0) {
			System.out.println("���");
		}
		if(num<0) {
			System.out.println("����");
		}
		if(num==0) {
			System.out.println("0�� ������ ���� �Է����ּ���.");
		}
		*/
		
		
		// ����3. ���⸦ ����� ������ ���Ḧ ����ϼ���.
		// ����) 1. �ݶ� 2. ��Ƽ 3. Ŀ��
		
		/*
		 Scanner input = new Scanner(System.in);
		
		System.out.println("==========");
		System.out.println("1. �ݶ�");
		System.out.println("2. ��Ƽ");
		System.out.println("3. Ŀ��");
		System.out.println("==========");
		
		System.out.print("���� ����: ");
		int user = input.nextInt();
		
		if(user == 1) {
			System.out.println("�ݶ�");
		}
		if(user == 2) {
			System.out.println("��Ƽ");
		}
		if(user == 3) {
			System.out.println("Ŀ��");
		}
		*/
		
		//����4. ���� ������ ���� ������ �Է¹ް�,
		//	    ����� 80�� ���϶�� ���հ�, 80�� �ʰ��� �հ��� ����ϼ���.
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� ���� �Է�: ");
		int kor = input.nextInt();
		
		System.out.println("���� ���� �Է�: ");
		int eng = input.nextInt();
		
		double avg = (kor+eng)/2.0;
		
		if(avg>80) {
			System.out.println("�հ�");
		}
		if(avg<=80) {
			System.out.println("���հ�");
		}
		*/
		
		//����5. ù ��° ���� �Է��ϰ� �� ��° ���� �Է��� ��
		//      ù ��° ���� �� ��° ���� ������� ������ִ� ���α׷��� ����ÿ�.
		
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù ��° �� �Է�: ");
		int num1 = input.nextInt();
		System.out.print("�� ��° �� �Է�: ");
		int num2 = input.nextInt();
		
		if(num1%num2==0) {
			System.out.println(num1 + "�� " + num2 + "�� ����Դϴ�.");
		}
		if(num1%num2!=0) {
			System.out.println(num1 + "�� " + num2 + "�� ����� �ƴմϴ�.");
		}
		*/
		
		//����6. ���� �Է��ϰ� �� ���� 3�� 5�� ��������� ������ִ� ���α׷��� ����ÿ�.
		
		/* Scanner input = new Scanner(System.in);
		
		System.out.print("�� �Է�: ");
		int num = input.nextInt();
		
		if(num%3==0 && num%5==0){
			System.out.println(num + "�� 3�� 5�� ������Դϴ�.");
		}
		if(num % 3 != 0 && num % 5 == 0) {
			System.out.println(num+"�� 3�� 5�� ������� �ƴմϴ�");
		}
		if(num % 3 == 0 && num % 5 != 0) {
			System.out.println(num+"�� 3�� 5�� ������� �ƴմϴ�");
		}
		if(num % 3 != 0 && num % 5 != 0) {
			System.out.println(num+"�� 3�� 5�� ������� �ƴմϴ�");
		}
		*/
		
		// 5�� ����1
		// ����, ���� ������ �Է� �ް�, ����� 90�� �̻��̸� "A", 80�� �̻��̸� "B"
		// 70�� �̻��̸� "C", 69�� �̸��̸� "D"�� �������� �Ͻÿ�.
		
		
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ���� �Է�: ");
		int kor = input.nextInt();
		System.out.print("���� ���� �Է�: ");
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
		
		// 5�� ����2
		// A, B, C, D�� ������� û�� ����� �Ѵ�. ù�� A�� ����̶�� N�� �Ŀ��� ���� ����ΰ�?
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("�� �� ��?");
		int n = input.nextInt();
		
		if(n%4==1) {
			System.out.println("û�Ҵ���� B");
		}
		if(n%4==2) {
			System.out.println("û�Ҵ���� C");
		}
		if(n%4==3) {
			System.out.println("û�Ҵ���� B");
		}
		if(n%4==0) {
			System.out.println("û�Ҵ���� A");
		}
		*/
		
		
		// 5�� ����3
		// ����̴� ���� ��ħ �˶��� ��� �Ͼ��. �˶��� ��� �ٷ� �Ͼ�� �����̰�����, �׻� ���ݸ� �� �ڷ��� ���� ������ ���� �б��� �����ϰ� �ִ�.
		// ����̴� ��� ����� �����غ�������, ���ݸ� �� �ڷ��� ������ �� � �͵� ���� ���� ������.
		// �̷� ����̸� �ҽ��ϰ� ����, â���̴� �ڽ��� ����ϴ� ����� ��õ�� �־���.
		// �ٷ� "45�� ���� �˶� �����ϱ�"�̴�.
		// �� ����� �ܼ��ϴ�. ���� �����Ǿ� �ִ� �˶��� 45�� �ռ��� �ð����� �ٲٴ� ���̴�. ������ �˶� �Ҹ��� ������, �˶��� ���� ���� �� �� ���̱� �����̴�. �� ����� ����ϸ�, ���� ��ħ �� ��ٴ� ����� ���� �� �ְ�, �б��� �������� �ʰ� �ȴ�.
		// ���� ����̰� ������ �˶� �ð��� �־����� ��, â������ ����� ����Ѵٸ�, �̸� ������ ���ľ� �ϴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// (0 �� H �� 23, 0 �� M �� 59) �׸��� �̰��� ���� ����̰� ������ ���� �˶� �ð� H�� M���� �ǹ��Ѵ�.
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("���� ������ �˶� �ð�");
		System.out.print("��: ");
		int hour = input.nextInt();		
		System.out.print("��: ");
		int min = input.nextInt();	
		System.out.println(hour + "�� " + min + "��");
		System.out.println();
		

		System.out.println("�˶��� 45�� ������ �����մϴ�.");
		
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
		
		System.out.println("������ �˶� �ð�");
		System.out.println(rhour + "�� " + rmin + "��");
		*/
		
		
		// 5�� ���� 4
		// ������ �����! �Ʒ� 8�� ������ �ڵ带 �������ּ���.
		// (�� M, ȭ T, �� W, �� T, �� F, �� S, �� S)
		// - 19�� ��, 54�� ��, 203�� ��, 601 ��, 1923�� ��, 3092�� ��, 8930�� ��, 19203�� ��
		

		
		
		
		
		
		
	}
	
	
	

}
