package day02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		/*final String KOREA = "���ѹα�";
		System.out.println(KOREA);
		//final�� �տ� ���� ���������� ������ �� ���� ������ ���� ��
		//final ������ �빮�ڷ� �̸� ����
		//korea = "�����̾�����";
		//System.out.println(korea);
		
		Scanner input = new Scanner(System.in);
		System.out.println("�̸� �Է�: ");
		String name = input.next();
		int age;
		System.out.println("���� �Է�: ");
		age = input.nextInt();
		
		System.out.println(name + " ���� ���̴� " + age + "�� �Դϴ�.");
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� �̸��� �����Դϱ�?");
		String name = sc.next();
		
		System.out.println(name + " ���� ���� ����: ");
		int kor = sc.nextInt();
		
		System.out.println(name + " ���� ���� ����: ");
		int eng = sc.nextInt();
		
		System.out.println(name + " ���� ���� ����: ");
		int mat = sc.nextInt();
		
		System.out.println("================");
		System.out.println("�� �� : " + name);
		System.out.println("================");
		System.out.println("�� �� : " + kor);
		System.out.println("�� �� : " + eng);
		System.out.println("�� �� : " + mat);
		System.out.println("================");
		System.out.println("�� �� : " + (kor+eng+mat));
		System.out.println("================");
		
		
	}

}
