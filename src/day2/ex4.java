package day2;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �� ���� �ִ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * �ִ� ����� : �� ���� ������� ���� ū ��
		 * ����� : �μ��� ����� ������ ���
		 * ��� : ������ �������� ���� 4�� ����� 1,2,4
		 * 8�� 12�� �ִ� �����
		 * 8: 1, 2, 4, 8
		 * 12; 1, 2, 3, 4, 6, 12
		 * 8�� 12�� ����� : 1, 2, 4
		 * 8�� 12�� �ִ� ����� : 4
		 * */
		int i = 1;
		int gcd = 1;
		int num = 8, num1 = 12;
		System.out.println(num+"�� " + num1 + "�� �ִ� �����");
		for (i=1;i<num1;i++){
			if(num % i== 0 && num1 % i ==0){
				gcd = i;
				System.out.println(gcd);
			}
		}
			
		}
	}
		
		
			
