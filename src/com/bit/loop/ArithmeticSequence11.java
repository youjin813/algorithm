package com.bit.loop;
/*
Algorithm 11번 문제
1-2+3-4+5-6....99-100 의 합계
* */
public class ArithmeticSequence11 {
	public static void main(String[] args) {
	 String s = "";
	 int evenSum=0,oddSum=0,res=0;
	 for(int i=1;i<=100;i++){
		 if(i==100) {
			s += i+"=" ;
		 }else {
			 if(i%2==1) {
				 s +=i+"+";
			 }else {
				 s +=i+"-";
			 }
			}
		 if(i%2==1) {
			 oddSum +=i;
		 }else {
			 evenSum -=i;
		 }
	 }
	 res = oddSum+evenSum;
	 System.out.println(s+res);
			 
	 }
}

