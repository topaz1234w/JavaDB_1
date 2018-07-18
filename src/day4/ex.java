package day4;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int i;
	
		for(i = 1; i < 10; i++ ){
			System.out.println(i);;
		}
		초기화는 한복문이 실행될 때 처음 한번만  실행됨
		 * 조건식이 참이면 실행문, 증감연산, 조건식비교순으로
		 * 반복
		 * 조건식이 거짓이면 반복문 종료
		int a = 0;
		int sum = 0;
		for(a= 1 ; a <= 10 ;a++){
			sum = a + sum;
			System.out.println(sum);
		}
		정수 num가 소수인지 아닌지 판별하는 코드를 작성하세요
		반복문 변수 : w, 정수 : num, 약수의 갯수 : cnt
		 * w가 1부터 num까지 하나씩 증가하여 반복문을
		 * 실행하는데 num를 w 로 나누었을 때 나머지가 0
		 * 이면(w가 num의 약수이면) 약수의 갯수를 하나
		 * 증가한다. 반복문이 다 끝나고 나서 약수의 갯수가
		 * 2이면 소수, 아니면 합성수로 출력
		int w=0;
		int num=15;
		int cnt=0;
		for(w = 1 ;w <= num; w++){
			if(num % w==0){
				cnt++;
			}
		}
		if(cnt == 2){
			System.out.println(num +"는 소수");
		}
		else{
			System.out.println(num + "는 합성수");
		}
	}
	소수를 구하는 다른 방법
	 * 소수의 약수는 나를 제외한다면 1이다.
	 * 나를 제외한 약수 중 가장 큰 수가 1
	 
	int i, num=10;
	int div = 1;
	for(i=num-1; i>0; i--){
		if(num % i == 0){
			div = i;
			break;
		}
		
	}
	if(div == 1){
		System.out.println(num+ "는 소수");
	}
	else{
		System.out.println(num+"는 합성수");
}
}*/
		/* 최대 공약수를 구하는 코드 를 작성하세요
		 * 두 수 num1, num2, 반복문 변수 i, 공약수 gcd
		 * i가 1부터 num1까지 반복하고 i가 num1과 num2의
		 * 약수이면 공약수 변수에 i를 저장
		 * 반복문이 다 종료된 후 공약수 출력하면 그게
		 * 최대공약수이다.*/
		
		/*int i=1, num1=12, num2=8, gcd=1;
		for(i=2 ;i<=num1 ;i--){
			if(num1 %i == 0 && num2 % i == 0){
				gcd = i;
				break;
			}
			
		}
		System.out.println(gcd);*/
}
	/*문제 다음 코드 코드를 실행 했을 때 반복횟수와
	 * 반복문 종료 후 i의 값은? 실행하지 않고
	 * 결과를 예상하세여.
	 * 반복횟수:5, 종료후 i의 값 : 10*/
	{
	int i = 0;
	int cnt = 0;
	for(i = 0; i<10; i+=2){
		cnt++;
	}
	System.out.println("반복횟수 : " +cnt);
	System.out.println("종료 후 i: " +i);
	/* 최소 공배수를 구하는 코드를 작성 해보시오.
	 * 
	 */
		
	}
	int i =1, num1=2, num2=10;
	for(;;){
		
	}
	}

}