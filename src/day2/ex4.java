package day2;

public class ex4 {

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
		int i = 1;
		int gcd = 1;
		int num = 8, num1 = 12;
		System.out.println(num+"과 " + num1 + "의 최대 공약수");
		for (i=1;i<num1;i++){
			if(num % i== 0 && num1 % i ==0){
				gcd = i;
				System.out.println(gcd);
			}
		}
			
		}
	}
		
		
			
