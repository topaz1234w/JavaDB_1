package day5;

import java.util.Scanner;

public class MathMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*최대공약수를 구하는 코드를 작성하세요. */
		int a = 10;
		int d;
		int s = 1;
		int gcd = 1 ;
		Scanner scan =new Scanner(System.in);
		a =scan.nextInt();
		s =scan.nextInt();
		gcd =GCD(a,s);
		for(d= 1;d<=s;a++){
			if(a%d ==0 && s % d==0){
				gcd =d;
			}
			
		}
		System.out.println(a+"과" +s +"의 최대 공약수는" + gcd);
		
	}
	/* 1. 메소드형 : gcd
	 * 2. 매개변수 : 두수 int a, int s
	 * 3. 리턴타입 : int
	 * */
	public static int GCD(int a,int s){
		int d;
		for(d= 1;d<=a;d++){
			if(a%d ==0 && s % d==0){
				gcd =d;
			}
		}
		return gcd;
	}

}
