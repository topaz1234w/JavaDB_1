package day5;

import java.util.Scanner;

public class matsod_ex {
	
		/* 메소드 : 특정 기능을 하도록 모아놓은 코드
		 * 메소드는 입력(매개 변수)과 출력(리턴 타입)이 필요하다.
		 * 그런데 상황에 따라서 입력과 출력이 필요 없을 수도 있다.
		 * <접근 제한자> (public) 출력 (void) 메소드 이름 (main) (매개 변수들(string[] args)){
		 * 		구현;
		 * }
		 * 기능 (메소드) : 자판기
		 * 입력 (매개 변수) : 돈, 메뉴
		 * 출력 (리턴 타입) : 선택된 음료수
		 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*두수와 연산자가 주어졌을 때 산술 연산을 하는 코드를 작성하세요*/
		int num = 3;
		int num1= 5;
		char op = '/';
		double res = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자1을 입력하세요");
		num = scan.nextInt();
		System.out.println("숫자2을 입력하세요");
		num1 = scan.nextInt();
		System.out.println("연산자를 입력하세요");
		op = scan.next().charAt(0);
		/* op가 +라면
		 * num과 num1를 더한 후 그 결과를 res에 저장한다.
		 * op가 +가 아니고 -라면
		 * num과 num1를 뺀 후 그 결과를 res에 저장한다.
		 * op가 +도 아니고 -도 아니고 *라면
		 * num과 num1를 곱한 후 그 결과를 res에 저장한다.
		 * op가 +,-,*가 아니고 %라면
		 * num과 num1를 나눈 나머지를 res에 저장한다.
		 * op가 +,-,*,%가 아니고 /라면
		 * num과 num1를 나눈 후 그 결과를 res에 저장한다. */
		res = calculate(num, num1, op); 
		public static double calculate(int num, int num1, char op){
			double res = 0.0;
		 if(op=='+'){
			 res = num + num1;
		}else if (op=='-'){
			res = num - num1;
		}else if (op=='*'){
			res = num * num1;
		}else if (op=='%'){
			res = num % num1;
		}else if (op=='/'){
			res = (double)num / num1;
			System.out.println("연산자를 잘못 입력 하셨습니다.");
	}
	/*num1, num2, op가 매개변수
	*  
	* res를 리턴타입
	* */
	System.out.println(""+num +op+num1+" = "+res );
}
}