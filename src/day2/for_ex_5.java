package day2;

public class for_ex_5 {
	public static void main(String[] args) {
		/* 두 두의 최소 공배수를 구하는 코드를 작성하세요.
		 * 최소 공배수 : 두 수의 공배수중 최소인 공배수
		 * 공배수 : 두 수의 배수 중 공통적인 배수
		 * 배수: 배수를 정수로 나누어서 나머지가 0인 수
		 * 10 : 10 20 30 40 50 60 70 ...
		 * 15 : 15 30 45 60 ....
		 * 10과 15의 공배수 : 30 60 90...
		 * 10과 15의 최소 공배수 : 30
		 * */
		int num1 =1000000, num2 =15000000, i=0;
		int cnt = 0;
		for (i=num1;i <= num1*num2;i++){
			cnt ++;
			if(i % num1== 0 && i % num2 ==0){
				System.out.println("단순 :"+i);
				break;
			}
			
			
		}
		System.out.println("단순 반복 횟수 : "+cnt);
		for (i=num1;i <= num1*num2;i+=num1){
			cnt ++;
			if(i % num2 ==0){
				System.out.println("조금 생각 : "+i);
				break;
			}
			
			
		}
		System.out.println("조금 반복 횟수 : "+cnt);
		int tmpnum = num1;
		int div = num2;
		if(num2 > num1){
			tmpnum = num2;
			div = num1;
		}
		for (i=tmpnum;i <= num1*num2;i+=tmpnum){
			cnt ++;
			if(i % div ==0){
				System.out.println("많이 생각 : "+i);
				break;
			}
			
			
		}
		System.out.println("많이 반복 횟수 : "+cnt);
	}
}
