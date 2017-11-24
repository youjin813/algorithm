package com.bit.opcode;

import java.util.Scanner;
public class CalcSwitch {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String[] arr = new String[5];
			arr[0] = "첫번째 숫자를 입력하세요.";
			arr[1] = "연산 기호를 입력하세요.";
			arr[2] = "두번째 숫자를 입력하세요.";
			arr[3] = "사칙 연산만 입력 가능";
			arr[4] = "%d %s %d = %d ";
			int num1 = 0,num2 = 0,result = 0;
			String opcode = "", test = "";
			boolean inputOK = true;
			System.out.print(arr[0]);
			num1 = scanner.nextInt();
			System.out.print(arr[1]);
			opcode = scanner.next();
			System.out.print(arr[2]);
			num2 = scanner.nextInt();
			switch(opcode) {
			case " + " :
				result = num1 + num2;
				break;
			case " - " :
				result = num1 - num2;
				break;
			case " * " :
				result = num1 * num2;
				break;
			case " / " :
				result = num1 / num2;
				break;
				}
	if(inputOK) {
		test = arr[3];
	} else {
		test = String.format(arr[4], num1, opcode, num2, result);
	}
System.out.print(test);
		}
	}

