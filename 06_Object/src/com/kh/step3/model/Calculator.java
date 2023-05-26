package com.kh.step3.model;

public class Calculator {

	/*
	 * 메소드
	 * -작업을 수행하기 위한 명령문의 집합
	 * -어떤 값을 입력받아서 처리하고 그결과를 돌려준다.
	 * -단, 입력받는 값이 없을 수도 있고, 결과를 돌려주지 않을 수도 있음
	 * -하나의 메소드는 한 가지 기능만 수행하도록 작성하는 것을 권고
	 * 
	 * [표현법]
	 * 
	 * 리턴타입 메소드이름 (타입 변수명, 타입 변수명, ...) {
	 * 			// 메소드 호출시 수행될 코드
	 * 				return;
	 * 
	 * }
	 * return 문
	 *  메소드에서 return문을 만나면 종료
	 *  반환값이 없는(void) 경우 return문만 사용
	 *  반환값이 있는 경우 return 문 뒤에 반환값을 지정해야 함
	 * 
	 * 
	 * 
	 */
	
	public int a;
	public int b;
	
	//최대값을 구하는 메서드
	
	public int max() {
		
		if (a > b) return a;
		return b;	
			}
/* .인스턴스 메서드
 *  -인스턴스 생성 후, 참조변수.메서드이름()  으로 호출
 *  인스턴스 변수나 인스턴스 메서드와 관련된 작업을 하는 메서드
 * 
 * 클래스메서드 (static메서드)
 *  객체 생성 없이 클래스이름.메서드이름()  으로 호출
 *  인스턴스 변수나 인스턴스 메서드와 관련 없는 작업을 하는 메서드
 */
 public int add() {
	 //더하기
	 return a+b;
	 
 }
 public int substract() {
	 return a-b;
	 //빼기
 }
 public static int multiply(int a, int b) {
	 //곱하기  //static은 인스턴스변수 사용x
	 return a*b;
 }
 public static String divide(int a, int b) { 
 	//나누기-> 형태 : 몫은 1 나머지는 3 이런식으로
 	return "몫은" + quotient (a,b) + ", 나머지는" + remainder(a,b); 
}
 public static int quotient(int a, int b) {
	 return a/b;
	 
 }
 public static int remainder(int a, int b) {
	 return a%b;
 }
 
 /* 
  * 재귀함수 (Recursion Fuction)
  * -메서드 내에서 자기자신을 반복적으로 호출
  * -반복문으로 바꿀 수 있으며 반복문보다 성능이 나쁨
  * -이해하기 쉽고 간결한 코드 작성이 가능
  * 
  */
 
 public int factorial(int n) {
	 
	 /*팩토리얼!
	  * 1!=1
	  * 2!=2x1=2
	  * 3!=3x2x1x=6
	  * 
	  */
 int fac = 1;
     
  
 	if(n!=1) fac = n * factorial(n-1);
 
 	
 
     return fac;
 }
}
