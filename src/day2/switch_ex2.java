package day2;

public class switch_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 문자가 ch가 a 또는 A이면 A입니다라고 콘솔에
		 * 출력하고
		 * 문자가 ch가 b또는 B이면 B입니다라고 콘솔에
		 * 출력하고
		 * 문자가 ch가 a,b,A,B가 아니면 A와 B가 아닙니다
		 * 라고 콘솔에 출력하는 예제switch case 문으로 작성하세요.
		 */
		char ch = 'a';
		switch(ch){
		case 'a':
			System.out.println(ch+"a 입니다");
		break;
		case 'b':
			System.out.println(ch+"b 입니다");
		break;
		case 'A':
			System.out.println(ch+"A 입니다");
		break;
		case 'B':
			System.out.println(ch+"B 입니다");
		break;
		default:
			System.out.println(ch+"A와 B가 아닙니다");
	 }
	}
}
