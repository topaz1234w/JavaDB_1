package day5;

import java.util.Scanner;

public class MathMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�ִ������� ���ϴ� �ڵ带 �ۼ��ϼ���. */
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
		System.out.println(a+"��" +s +"�� �ִ� �������" + gcd);
		
	}
	/* 1. �޼ҵ��� : gcd
	 * 2. �Ű����� : �μ� int a, int s
	 * 3. ����Ÿ�� : int
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
