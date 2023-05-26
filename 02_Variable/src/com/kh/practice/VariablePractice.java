package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {

	// FQCN(Fully Qualified Class Name)
	// 클래스가 속한 패키지명을 모두 포함한 이름

	public static void main(String[] args) {

		VariablePractice vp = new VariablePractice();
		// vp.method1();

		// vp.method2();
		vp.method3();
		//vp.method4();

	}

	public void method1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();

		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 걸과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2));
	}

	public void method2() {

		Scanner sc = new Scanner(System.in);

		int num1 = 10000;
		int num2 = 7000;

		System.out.println("영화관의 요금표는 다음과 같슴니다.");
		System.out.println("성인 :  " + num1 + "원");
		System.out.println("청소년 : " + num2 + "원");
		System.out.println("성인 2명과 청소년 3명이 영화를 보려고 할 때 지불해야 할 금액을 계산 후 출력하세요.\n");

		System.out.println("성인의 수를 입력하세요>");
		int NUM1 = sc.nextInt();

		System.out.println("청소년의 수를 입력하세요>");
		int NUM2 = sc.nextInt();

		int adult = num1 * NUM1;
		int youth = num2 * NUM2;
		int total = adult + youth;

		System.out.println("성인 " + NUM1 + "명 : " + adult + "원");
		System.out.println("청소년 " + NUM2 + "명 : " + youth + "원");
		System.out.println("총 금액 :  " + total + "원");

	}

	public void method3() {

		Scanner sc = new Scanner(System.in);

		int x = 5;
		int y = 7;
		int z = 9;
     
		int temp = x;
		x = y;
		y = z;
		z = x;

		System.out.println("x= " + y);
		System.out.println("y= " + z);
		System.out.print("z= " + "5");

	}

	public void method4() {

		Scanner sc = new Scanner(System.in);

		String str = new String();
		System.out.print("문자열을 입력하세요 : ");
		String text = sc.nextLine();
      
	//	System.out.print("첫번째 문자: " + str.charAt(text.length()0);
		//System.out.print("마지막 문자: " + str.charAt(text.length()-1);
		
		
	}
   public void method5() {
	   
	   Scanner sc = new Scanner(System.in);
	   
	   
   }
}
