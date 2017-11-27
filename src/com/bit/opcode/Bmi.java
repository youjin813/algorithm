package com.bit.opcode;
/*고도 비만 : 35 이상
중등도 비만 (2단계 비만) : 30 - 35
경도 비만 (1단계 비만) : 25 - 30
과체중 : 23 - 24.9
정상 : 18.5 - 22.9
저체중 : 18.5 미만

X if(18.5<= bmi <22.9)
O if(18.5<= bmi && bmi <22.9)

**/
import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String r ="";
		int n =0;
		System.out.println("몇명?");
		n = s.nextInt();
		for(int i=0;i<n;i++) {
			String name="",res="";
			double weight=0.0,height=0.0,bmi=0.0;
			System.out.print("이름");
			name = s.next();
			System.out.print("키");
			height = s.nextDouble()/100;
			System.out.print("몸무게");
			weight = s.nextDouble();
			bmi =weight/(height*height);
			if(bmi>35) {
			   res="고도비만";
			}else  if(30<=bmi&& bmi<35){
				res="중등도 비만";
			}else if(25<=bmi&& bmi<30){
				res="경도 비만";
			}else if(23<=bmi&&bmi<24.9){
				res="과체중";
			}else if(18.5<=bmi&&bmi<22.9){
				res="정상";
			}else {
				res="저체중";
			}
			r += "이름:"+name+res+" ";
		} 
			System.out.print(r);

		}
		}

