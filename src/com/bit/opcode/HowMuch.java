package com.bit.opcode;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = new  String [9];
		arr[0] = "얼마예요?";  
		arr[1] = "%d원 입니다.";  
		arr[2] = "몇개 드릴까요?";
		arr[3] = "%d개 주세요.";
		arr[4] = "총 금액은 %d원 입니다.";
		arr[5] = "비싸요 깎아주세요";
		arr[6] = "몇 퍼센트 DC 해드릴까요?";
		arr[7] = "%d원 입니다.";
		arr[8] = "안팔아요";
		int a = 0,b = 0,c = 0,d = 0,e = 0; 
		System.out.print(arr[0]);
		a = s.nextInt();
		System.out.printf(arr[1],a);
		System.out.print(arr[2]);
		b = s.nextInt();
		System.out.printf(arr[3],b);
		c = a * b;
		System.out.printf(arr[4],c);
		System.out.print(arr[5]);
		System.out.print(arr[6]);
		d = s.nextInt();
		if(d<10) {
			e = c - ( c * d / 100);
			System.out.printf(arr[7],d);}
		else{
			System.out.print(arr[8]);
			}
		
	}
}