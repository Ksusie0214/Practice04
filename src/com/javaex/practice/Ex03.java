package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {
		//아래코드의 출력값을 예상하고 코드로 확인하시오
		int[] intA = { 3, 6, 9 }; //intA 배열은 각각 3, 6, 9 이다
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i = 0; i<intA.length; i++) {
			
			System.out.println(intA[i]);
		}
		
		/*intB는 intA와 같다고 했다. 이는 A와 B의 배열 칸수가 같다는 것을 알 수 있다,
		  그 외에도 intB의 2번째 칸의 수가 나오지 않았지만, intA의 값과 같다는 전제를 통해서
		  나오지 않은 intB의 값은 자연스럽게 intA의 2번째 배열의 값이 됨을 알 수 있다.
		  따라서 해당 반복문은 각각 20, 6, 10 이 출력된다.
		 */
		
		
		
	}

}
