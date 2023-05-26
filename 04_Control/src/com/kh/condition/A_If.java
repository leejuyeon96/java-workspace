package com.kh.condition;

import java.util.Scanner;

public class A_If {

	Scanner sc = new Scanner(System.in); // 인스턴스 변수

	/*
	 * if 문 [표현법]
	 * 
	 * if 조건식 { ... 조건식이 참true일 때 실행할 코드.. - 보통 조건식에는 비교연산자, 논리연산자를 주로 사용
	 * 
	 * 
	 */
	public static void method1() {

		int score = 80; // 지역 변수

		// if (score >= 60)
		// System.out.println("합격!");

		if (score >= 60)
			System.out.println("합격!");

		if (score < 60)
			System.out.println("불합격");

	}

	/*
	 * if-else문
	 * 
	 * [표현법]
	 * 
	 * if(조건식) { ...조건식이 참일때 실행할 코드... } else { ...조건식이 거짓일때 실행할 코드... }
	 * 
	 * 
	 * 
	 */
	public void method2() {

		int score = 0;

		System.out.print("점수 입력 >");
		score = sc.nextInt();

		if (score >= 60) {
			System.out.println("합격!");
		} else {
			System.out.println("불합격!");
		}
		// 삼항 연산자
		System.out.println((score >= 60) ? "합격!" : "불합격!");

	}

	public void method3() {

		String name = "";

		System.out.print("이름을 입력해주세요 > ");
		name = sc.nextLine();

		System.out.println("김미경" == name); // false
		System.out.println("김미경".equals(name));// true String 클래스의 equals() 메소드
		System.out.println("김미경".charAt(0)); // String 클래스의 CharAt(0) 메소드

		// 본인이면 "본인이다." 아니라면 "본인이 아니다."
		if ("김미경".equals(name)) {
			System.out.println("본인이다.");
		} else {
			System.out.println("본인이 아니다.");
		}
	}

	public void method4() {

		int number = 0;

		System.out.print("숫자 입력 > ");
		number = sc.nextInt();
		// 0보다 크면 "양수" 아니면 "음수"
		// 중첩 if문도 가능 (추천안함)
		if (number > 0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}
		if (number == 0) {
			System.out.println("0입니다");
		} else {
			System.out.println("음수");
		}
	}

	/*
	 * if-else if-else 문
	 * 
	 * [표현법]
	 * 
	 * if(조건식1) { .. 조건식1이 참일때 실행할 코드.. } else if(조건식2) { ..조건식2가 참일때 실행할 코드..
	 * }else{
	 * 
	 * ....위에 어느 조건도 만족하지 않을 때 실행할 코드.. } -else if 수는 제한이 없다.
	 * 
	 * 
	 */
	public void method5() {

		int number = 0;

		System.out.print("숫자 입력 > ");
		number = sc.nextInt();

		if (number > 0) {
			System.out.println("양수");

		} else if (number < 0) {
			System.out.println("음수");

		} else {
			System.out.println("0입니다.");
		}
	}
	/*
	 * 사용자에게 점수0~100입력받아 -90점이상은 A 90미만 80이상은 B 80미만 70이상은 C 70미만 60이상은 D 60미만 F
	 */

	public void method6() {
		int score = 0;

		System.out.print("점수 입력 > ");
		score = sc.nextInt();

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		// 두번째 방법
		char grade = '\u0000';
		if (score >= 90) {
			grade = 'A';

		} else if (score >= 80) {
			grade = 'B';
		}
	}

	public void practice1() {

		/*
		 * 세 정수를 입력했을때 짝수만 출력
		 * 
		 * num1 입력 >3 num2 입력 >4
		 * 
		 */

		System.out.println("num1 입력 > ");
		int num1 = sc.nextInt();
		System.out.println("num2 입력 > ");
		int num2 = sc.nextInt();
		System.out.println("num3 입력 > ");
		int num3 = sc.nextInt();

		if (num1 % 2 == 0)
			System.out.println(num1);
		if (num2 % 2 == 0)
			System.out.println(num2);
		if (num3 % 2 == 0)
			System.out.println(num3);

	}

	/*
	 * 정수 1개 입력 음minus 양plus 0zero 짝수even 홀odd
	 * 
	 * 
	 */
	public void practice2() {

		int number = 0;

		System.out.println("정수 입력 > ");
		number = sc.nextInt();

		if (number > 0 && number % 2 == 0) {
			System.out.println("plus, even");
			/*
			 * if(num%2==0 { System.out.print("even");} else{ System.out.print("odd);}
			 */

		} else if (number > 0 && number % 2 == 1) {
			System.out.println("plus, odd");
		} else if (number < 0 && number % 2 == 0) {
			System.out.println("minus, even");
		} else if (number < 0 && number % 2 == 1)
			System.out.println("minus, odd");
		else {
			System.out.println("zero");
		}

	}

	public static void main(String[] args) {

		A_If a = new A_If();
		// a.method1();
		// a.method2();
		// a.method3();
		// a.method4();
		// a.method5();
		// a.method6();
		// a.practice1();
		a.practice2();
	}

}
