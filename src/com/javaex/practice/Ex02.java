package com.javaex.practice;

public class Ex02 {
	public static void main(String[] args) {
		//Ex02 double 형 배열을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 아래와 같이 출력되도록 for문을 작성하시오
		
		double[] dArray = new double[3];
		dArray[0] = 1.2;
		dArray[1] = 3.3;
		dArray[2] = 6.7;
		
		for(int i = dArray.length-1; i>=0; i--) {
			
			System.out.println(dArray[i]);
			
			
		}
		
		
		
		
		
		
	}
}
