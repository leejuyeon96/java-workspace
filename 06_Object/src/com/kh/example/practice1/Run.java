package com.kh.example.practice1;

import com.kh.example.practice1.model.Member; //경로확인

import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		
		 Member m = new Member();
	     m.printName();
	     
	     Scanner sc = new Scanner(System.in);
	
	     System.out.print("변경할 이름> ");
	     String name = sc.nextLine();
	     
	     m.changeName(name);
	     m.printName();
	}
}

