package com.bit.opcode;

import java.util.Scanner;
	public class WhoAreYou {
		public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String name="";
		System.out.print("이름이 뭔가요?\n");
		name=s.next();
		System.out.printf("당신은 %s 입니다",name );
	}
}
