package day02;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
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
