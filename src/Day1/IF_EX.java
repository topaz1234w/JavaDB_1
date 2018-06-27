package Day1;

public class IF_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if(조건식1){
		 *     실행문1;//조건식이 참일 때 실행됨
		 * }
		 * else if(조건식2){
		 * 		실행문2;//조건식 1이 거짓이고, 조건식2가 참일 경우 실행됨
		 * }
		 * else {
		 * 		실행문3;//조건식이 거짓일 때 실행됨
		 * }
		 * if와 else if의 순서가 중요!!!!
		 */
		
		int num =0;
		//만약 num가 0이면, 콘솔에 0입니다를 출력하세요.
		if(num == 0){
			System.out.println("0 입니다");
		//만약 num를 2로 나누었을때 0과 같다면, 콘솔에 짝수입니다를 출력하세요.
		}else if((num % 2) == 0){
			System.out.println(num+"는 짝수 입니다.");
		}
		// 만약 num이 0이 아니고, num을 2로 나누었을 때 0과 같이 않다면 콜솔에 홀수를 출력하세요.
		else{
			System.out.println(num+"는 홀수 입니다.");
		}

	}

}
