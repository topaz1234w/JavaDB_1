package day5;

import java.util.Scanner;

public class matsod_ex {
	
		/* �޼ҵ� : Ư�� ����� �ϵ��� ��Ƴ��� �ڵ�
		 * �޼ҵ�� �Է�(�Ű� ����)�� ���(���� Ÿ��)�� �ʿ��ϴ�.
		 * �׷��� ��Ȳ�� ���� �Է°� ����� �ʿ� ���� ���� �ִ�.
		 * <���� ������> (public) ��� (void) �޼ҵ� �̸� (main) (�Ű� ������(string[] args)){
		 * 		����;
		 * }
		 * ��� (�޼ҵ�) : ���Ǳ�
		 * �Է� (�Ű� ����) : ��, �޴�
		 * ��� (���� Ÿ��) : ���õ� �����
		 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�μ��� �����ڰ� �־����� �� ��� ������ �ϴ� �ڵ带 �ۼ��ϼ���*/
		int num = 3;
		int num1= 5;
		char op = '/';
		double res = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("����1�� �Է��ϼ���");
		num = scan.nextInt();
		System.out.println("����2�� �Է��ϼ���");
		num1 = scan.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���");
		op = scan.next().charAt(0);
		/* op�� +���
		 * num�� num1�� ���� �� �� ����� res�� �����Ѵ�.
		 * op�� +�� �ƴϰ� -���
		 * num�� num1�� �� �� �� ����� res�� �����Ѵ�.
		 * op�� +�� �ƴϰ� -�� �ƴϰ� *���
		 * num�� num1�� ���� �� �� ����� res�� �����Ѵ�.
		 * op�� +,-,*�� �ƴϰ� %���
		 * num�� num1�� ���� �������� res�� �����Ѵ�.
		 * op�� +,-,*,%�� �ƴϰ� /���
		 * num�� num1�� ���� �� �� ����� res�� �����Ѵ�. */
		res = calculate(num, num1, op); 
		public static double calculate(int num, int num1, char op){
			double res = 0.0;
		 if(op=='+'){
			 res = num + num1;
		}else if (op=='-'){
			res = num - num1;
		}else if (op=='*'){
			res = num * num1;
		}else if (op=='%'){
			res = num % num1;
		}else if (op=='/'){
			res = (double)num / num1;
			System.out.println("�����ڸ� �߸� �Է� �ϼ̽��ϴ�.");
	}
	/*num1, num2, op�� �Ű�����
	*  
	* res�� ����Ÿ��
	* */
	System.out.println(""+num +op+num1+" = "+res );
}
}