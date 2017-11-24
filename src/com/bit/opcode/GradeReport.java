package com.bit.opcode;

import java.util.Scanner;
public class GradeReport {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String[] arr = {
				"이름?","국어 점수","영어 점수","수학 점수"		};
		int korean = 0,english = 0, math = 0,sum = 0, avg = 0 , avg1 = 0;
		String name = "",grade = "";
		System.out.print(arr [0]);
		name = s.next();
		System.out.print(arr [1]);
		korean = s.nextInt();
		System.out.print(arr [2]);
		english= s.nextInt();
		System.out.print(arr [3]);
		math = s.nextInt();
		sum = korean + english + math;
		avg = sum/3;
		avg1 = (sum / 3)/10;
		switch(avg1) {
		case 10 : grade = "A";
				break;
		case 9 : grade = "B";
				break;
 		case 8 : grade = "C";	
 				break;
 		case 7 : grade = "D";
 				break;
 		case 6 : grade = "E";
 				break;
 		default : grade = "F";
 				break;
 				
		}
		System.out.printf("%s [평균] %d [학점] %s",name,avg,grade );
	}
}
