package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {

		OperatorPractice op = new OperatorPractice();

		op.method1();
	    op.method2();
		op.method3();
		op.method4();
		op.method5();
		op.method6();
	}

	public void method1() {

		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;

		System.out.print("인원 수 : ");
		num1 = sc.nextInt();

		System.out.print("연필 개수 : ");
		num2 = sc.nextInt();

		num3 = num2 / num1;
		num4 = num2 % num1;

		System.out.println("1인당 연필 개수 : " + num3);
		System.out.println("남는 연필 개수 : " + num4);

	}

	public void method2() {

		Scanner sc = new Scanner(System.in);

		int num1 = 0;

		System.out.print("양수를 입력해주세요 > ");
		num1 = sc.nextInt();

		System.out.println((num1 / 100) * 100);

	}

	public void method3() {

		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		System.out.print("입력1 : ");
		num1 = sc.nextInt();
		System.out.print("입력2 : ");
		num2 = sc.nextInt();
		System.out.print("입력3 : ");
		num3 = sc.nextInt();

		System.out.println(num1 == num2 && num2 == num3);

	}

	public void method4() {

		Scanner sc = new Scanner(System.in);

		int number = 0;

		System.out.print("정수 입력 > ");
		number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}
	}

	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("나이를 입력하세요> ");
		num = sc.nextInt();
		
		if (num>19) {
			System.out.println("성인");}
			else if (num>13) {
				System.out.println("청소년");
			}
			else {
				System.out.println("어린이");
			}
	  }
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
			
		System.out.print("사과의 개수 : ");
		num1 = sc.nextInt();
		System.out.print("바구니의 크기 : ");
		num2 = sc.nextInt();
		
		int Number1 = (num1/num2);
		int Number2 = (num1%num2);		
		if (Number2 != 0) {
			System.out.println("필요한 바구니의 수 : " + (Number1+1));
		} else {
		System.out.print("필요한 바구니의 수 : " + Number1);}
		
		
		
	

	}
	}
