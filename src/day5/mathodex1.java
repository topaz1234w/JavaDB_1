package day5;

public class mathodex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 메소드명 : LCM
		 * 리턴타입 : int
		 * 매개변수 : 두수 int num1, int num2 */
		public static int LCM(int num1, int num2);
		int num1 =0;
		int num2 =0;
		int lcm = 1;
		int i =0;
		for (i=num1;num1<=num1*num2;i+=num1){
			if(i % num2 == 0){
				return i;
			}
		}
		return 1;
	}

}
