package com.kh.loop;

import java.util.Scanner;

public class D_While {

	Scanner sc = new Scanner(System.in);
	
	/*[표현법]
	 * 
	 * while(조건식) {
	 * .. 실행 코드...
	 */
	
	public void method1() {
		
		for(int i=1; i<5; i++) {
			System.out.println(i);
		}
	System.out.println();
	
	int i = 1;
	while(i<=5) {
		System.out.println(i);
		i++;
	}
	
	}
	
	/*
	 * break 문
	 *  - switch 반복문의 실행을 중지하고 빠져나갈때 사용
	 *  - 반복문이 중첩되는 경우 break 문이 포함되어있는 반복문에서만 빠져나간다.
	 */
	
	
	//for문 무한루프
	
	public void method2() {
		
		for (int i=1; i<=5;) {
			System.out.println(i);
			i++;
		}
		
       for (int i=1; ;) {
    	   if(i<=5) {
    		    System.out.println(i);}
    		   i++;}   
    	   
    	  
       }
       //while문 무한루프
	public void method3() {
	    int input = 0;
		while(true) {
			System.out.print("숫자 입력> ");
			input = sc.nextInt();
			System.out.println(input);
		}
		
		}
	//do-while
	/*[표현법]
	 *  do{
	 *      실행코드
	 *      } while(조건식);
	 *      
	 *   -조건과 상관없이 무조건 한 번은 실행
	 */
	
	
		public void method4() {
			
			int number = 1;
			
			while(number==0) {
				System.out.println("while문");
				
			}
			
		do {
			System.out.println("do-while문");
			
		}while(number==0);
	
	
		}
		//반복문+조건문
		/* 1~100사이의 값을 입력해서 임의로 지정한 랜덤값을 맞추면 끝남
		 * 
		 * 게임이 끝나면 몇번만에 맞혔는지 출력!
		 * 
		 * 1과 100사이의 값 입력 >
		 * 더 큰 수를 입력하세요
		 * 
		 * 더 작은 수를 입력하세요
		 * 
		 * 3번 만에 맞췄습니다.
		 */
		public void method5() {
			
			int answer = (int)(Math.random() * 100) + 1;
			int input = 0;
			int count = 0;
			
			while(true) {
				count++;
				System.out.print("1과 100사이의 값 입력> ");
				input = sc.nextInt();
			}
		
		}
		/* if (input<answer) {
		     	System.out.println("더 큰 수를 입력하세요.");
			
			} else if (input>answer) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			else {
				System.out.println(count + "번 만에 맞췄습니다.");}
				{break;
				}
		
		}

			

		/*1.예금 |2 츌굼|3 잔고|4종료
		 * 
		 * 
		 * 선택>1
		 * 예금액>5000
		 * -----------------------------
		 * * 
		 * ----------------------------
		 * 선택>2
		 * 출금액>2000
		 * 
		 * *1.예금 |2 츌굼|3 잔고|4종료
		 * 
		 */
			
		public void method6() {
			
			int balance = 0;
			boolean run = true;
			
			while(run) {
				
				System.out.println("-----------------------------");
				System.out.println("1.예금 |2.출금 |3.잔고|4.종료");
				System.out.println("-----------------------------");
				
				System.out.print("선택> ");
				//Integer.parseInt : Integer 클래스의 parseInt 메소드
				//String -> Int
				int menu = Integer.parseInt(sc.nextLine()); //숫자로 인식
				
			
				switch(menu) {
				
				case 1 : 
					System.out.print("예금액> ");
					balance += Integer.parseInt(sc.nextLine());
					break;
				case 2 :
					System.out.print("출금액: ");
					balance -= Integer.parseInt(sc.nextLine());
					break;
				case 3 :
					System.out.print("잔고> ");
					System.out.print(balance);
					break;
				case 4 : 
					run = false;
					break;
				}
					{	
			System.out.println("프로그램 종료");
			
			
					}
			}
				}
				
				
				
			
			
			
		
				
			
	
		
	public static void main(String[] args) {

		D_While d = new D_While();
		//d.method1();
		//d.method2();
		//d.method3();
		//d.method5();
		//d.method6();
	}

}
