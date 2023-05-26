package com.kh.operator;

public class C_Arithmetic {

	
	/* 산술 연산자
	 * 
	 * + 더하기
	 * - 빼기
	 * * 곱하기
	 * % 나머지
	 */
	 
public static void main(String[] args) {
		
		 C_Arithmetic c = new C_Arithmetic();
		 c.method1();
		 c.method2();
	 }
public void method1() {
	int num1 = 10;
	int num2 = 3;
	
	
 System.out.println("num1+num2= " + (num1+num2)); //13
 System.out.println("num1-num2= " + (num1-num2));
 System.out.println("num1*num2= "+ (num1*num2));
 System.out.println("num1/num2= " + (num1/num2));
 System.out.println("num1 % num2= " + (num1 % num2));
 
}
	public void method2() {
		int a = 5;
		int b = 10;
		int c = (++a) + b; 
		int d = c/a; //a=6 b=10 c=16 d=2
		int e = c%a; //a=6 b=10 c=16 d=2 e=4
		int f = e++; //a=6 b=10 c=16 d=2 e=5 f=4
		int g = (--b) + (d--);//11 a=6 b=9 c=16 d=1 e=5 f=4 
		int h = 2;
		int i = (a++) + b / (--c/f) * (g-- - d)% (++e + h);//12
		System.out.println("f : " + f); //4
		System.out.println("i : " + i);
	}
	 
}
