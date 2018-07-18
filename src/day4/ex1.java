package day4;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 최소 공배수를 구하는 코드를 작성 해보시오.
		/*두수 : num1, num2
		 * 반복문 변수 : i
		 * 최송 공배수 : lcm
		 * i는 num1에서 num1*num2까지 num1씩 증가하면서
		 * 반복한다.
		 * 반복문안에서 i가 num1의 배수이고, i가 num2의
		 * 배수이면 lcm에 i를 저장하고 반복문을 강제종료한다.
		 * 반복문이 종료되고 lcm을 출력하면 최소공배수가 출력된다.*/
		int i=0;
		int num1 = 15, num2 = 20;
		int lcm = 0;
		for(i=num1;i<=num1*num2;i+=num1){
			if(i % num1 == 0 && i % num2 == 0){
				lcm=i;
				break;
			}
		}
			System.out.println(lcm);
		}
	}

