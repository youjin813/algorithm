package com.bit.loop;
// 1~100까지 홀수의 합
// modular %
// 1 % 2 = 1
// 2 % 2 = 0
// 3 % 2 = 1
// 4 % 2 = 0
public class OddSum {
	public static void main(String[] args) {
		String s = "";
		int a = 0;
		for(int i=1;i<=100;i++){
			if(i % 2 ==1) {
				if(i==99) {
					s += i+"=";
				}else {
					s += i+"+";
				}
				a +=i; // a = a + i;
			}
		}
		System.out.println(s+a);
	}
}
