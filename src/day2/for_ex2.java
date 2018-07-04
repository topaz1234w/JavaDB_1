package day2;

public class for_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1부터 10사이에 홀수만 출력하는 코드를
		 * for문을 이용하여 작성하세요.
		 */
		int a = 0;
		for (a = 1 ; a <= 10 ; a++){
			if (a % 2 == 1){
				System.out.println(a);
			}
			
		}
		System.out.println("조건문 미사용");
		for( a = 1 ; a <=10 ; a += 2){
			System.out.println(a);
		}
		/*1부터 10까지의 합을 구하는 예제를 작성하세요*/
		int sum = 0;
		for (a = 1 ; a <= 10 ; a++){
			sum = sum + a ;
			System.out.println("1부터10꺼지의 합 : "+sum);
			
			
			
		
			
		}
		/*구구단 7단을 출력하는 코드를 작성하세요*/
		int asdf = 0;
		for (asdf = 0 ; asdf <= 63 ; asdf+=7 ){
			System.out.println("7단 구구단"+asdf);
			
		}
	}


}
