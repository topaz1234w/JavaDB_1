package day2;

public class ex_for_6 {
	public static void main(String[] args) {
		/* ������ �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带
		 * �ۼ��ϼ���.
		 * �Ҽ��� ����� 1�� �ڱ��ڽ��� ��
		 * 2, 3, 5, 7, 11, 13, 17..
		 * */
		//���1
		/* 1. ���� cnt�� �ݺ��� ���� i�� ���� �� �ʱ�ȭ
		 * 2. i�� 1���� num���� �ϳ��� �����ϸ鼭 �ݺ�
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
			System.out.println(num1+"�Ҽ�");
			}else{
				System.out.println(num1+"�� �ռ���");
			
		}
		//���2
		/* 2. i�� num1-1���� �ϳ��� �����ϸ鼭 �ݺ�
		 * 3. num1�� i�� �������� �� �������� 0�̸� �ݺ�������
		 * 4. i�� 1�̸� �Ҽ�, �ƴϸ� �ռ��� �Դϴ�.*/
		for(i = num1-1; i >= 1; i--){
			if(num1 % i ==0){
				break;
			}
		}
		//i�� 1�̸� num1�� ������ ����� 1�̶�� �ǹ��̰�,
		//�̴� ����� 2����� �ǹ��̹Ƿ� �Ҽ��̴�.
		if(i == 1){
			System.out.println(num1+"�Ҽ�");
			}else{
				System.out.println(num1+"�� �ռ���");
			
		}
		for(i = 1;i > 0 ; i++){
			System.out.println(i);
			
		}
	}
}
