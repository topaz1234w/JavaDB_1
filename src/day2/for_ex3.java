package day2;

public class for_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 두 수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 최대 공약수 : 두 수의 공약수중 가장 큰 수
		 * 공약수 : 두수의 약수중 공통인 약수
		 * 약수 : 나누어 떨어지는 수로 4의 약수는 1,2,4
		 * 8과 12의 최대 공약수
		 * 8: 1, 2, 4, 8
		 * 12; 1, 2, 3, 4, 6, 12
		 * 8과 12의 공약수 : 1, 2, 4
		 * 8과 12의 최대 공약수 : 4
		 * */
		int a = 0;
		int s = 4;
		System.out.print(s+"의 약수 : ");
		for (a = 1 ; a <= s ; a++ ){
			if (s % a == 0){
			System.out.print(a+" ");
			}
		}
		if (s % a == 1){
			System.out.println(a);
			
		}
		
		
		
		
		/* 정수의 약수를 구하는 고드를 작성하세요.
		 * 정수를 1부터 자기 자신까지 나누어서 나머지가
		 * 0이 되면 그 수는 정수의 약수이다
		 * */
		int i = 0;
		int num = 8;
		System.out.print(num+"의 약수 : ");
		for (i = 1 ; i <= num ; i++ ){
			if (num % i == 0){
			System.out.print(i+" ");
			}
		}
	}

}
