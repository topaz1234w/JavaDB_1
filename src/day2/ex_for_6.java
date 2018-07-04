package day2;

public class ex_for_6 {
	public static void main(String[] args) {
		/* 정수가 소수인지 아닌지 판별하는 코드를
		 * 작성하세요.
		 * 소수는 약수가 1과 자기자신인 수
		 * 2, 3, 5, 7, 11, 13, 17..
		 * */
		//방법1
		/* 1. 변수 cnt와 반복문 변수 i를 선언 및 초기화
		 * 2. i는 1부터 num까지 하나씩 증가하면서 반복
		 * 3.*/
		int num1=13, i=0;
		int cnt =0;
		for(i=1;i<=num1;i++){
		if (i % num1 ==0){
			cnt++;
			System.out.println(i);
			break;
			}
		}
		if(cnt ==2){
			System.out.println(num1+"소수");
			}else{
				System.out.println(num1+"는 합성수");
			
		}
		//방법2
		/* 2. i는 num1-1부터 하나씩 감소하면서 반복
		 * 3. num1를 i로 나누었을 때 나머지가 0이면 반복문종료
		 * 4. i가 1이면 소수, 아니면 합성수 입니다.*/
		for(i = num1-1; i >= 1; i--){
			if(num1 % i ==0){
				break;
			}
		}
		//i가 1이면 num1를 제외한 약수가 1이라는 의미이고,
		//이는 약수가 2개라는 의미이므로 소수이다.
		if(i == 1){
			System.out.println(num1+"소수");
			}else{
				System.out.println(num1+"는 합성수");
			
		}
		for(i = 1;i > 0 ; i++){
			System.out.println(i);
			
		}
	}
}
