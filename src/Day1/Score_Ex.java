package Day1;

public class Score_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정수로 된 성적을 학점으로 출력하세요.
		 * 0~59  : F
		 * 60~69 : D
		 * 70~79 : C
		 * 80~89 : B
		 * 90~100: A
		 *  그외   : 성적을 잘못 입력했습니다.
		 */
		int score = 88;
		if( 0 <= 59){
			System.out.println(score +"F 입니다");
		if(score <= 100 && score >= 90){
<<<<<<< HEAD
				System.out.println(score+"A");
		}
		else if(score <= 89 && score >= 80){
				System.out.println(score+"B");
		}									
		else if(score <= 79 && score >= 70){
				System.out.println(score+"C");
		}
		else if(score <= 69 && score >= 60){
				System.out.println(score+"D");
		}
		else if(score <= 59 && score >= 0){
				System.out.println(score+"F");
		else{
			System.out.println(score+"성적을 잘 못 입력했습니다.");
		}
=======
				System.out.println("A");
		}
		else if(score <= 89 && score >= 80){
				System.out.println("B");
		}									
		else if(score <= 79 && score >= 70){
				System.out.println("C");
		}
		else if(score <= 69 && score >= 60){
				System.out.println("D");
		}
		else if(score <= 59 && score >= 0){
				System.out.println("F");
>>>>>>> master
			}
		}
	}
}




