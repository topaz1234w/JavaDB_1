package day2;

public class for_ex3 {

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
		int a = 0;
		int s = 4;
		System.out.print(s+"�� ��� : ");
		for (a = 1 ; a <= s ; a++ ){
			if (s % a == 0){
			System.out.print(a+" ");
			}
		}
		if (s % a == 1){
			System.out.println(a);
			
		}
		
		
		
		
		/* ������ ����� ���ϴ� ��带 �ۼ��ϼ���.
		 * ������ 1���� �ڱ� �ڽű��� ����� ��������
		 * 0�� �Ǹ� �� ���� ������ ����̴�
		 * */
		int i = 0;
		int num = 8;
		System.out.print(num+"�� ��� : ");
		for (i = 1 ; i <= num ; i++ ){
			if (num % i == 0){
			System.out.print(i+" ");
			}
		}
	}

}
