package day2;

public class for_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1���� 10���̿� Ȧ���� ����ϴ� �ڵ带
		 * for���� �̿��Ͽ� �ۼ��ϼ���.
		 */
		int a = 0;
		for (a = 1 ; a <= 10 ; a++){
			if (a % 2 == 1){
				System.out.println(a);
			}
			
		}
		System.out.println("���ǹ� �̻��");
		for( a = 1 ; a <=10 ; a += 2){
			System.out.println(a);
		}
		/*1���� 10������ ���� ���ϴ� ������ �ۼ��ϼ���*/
		int sum = 0;
		for (a = 1 ; a <= 10 ; a++){
			sum = sum + a ;
			System.out.println("1����10������ �� : "+sum);
			
			
			
		
			
		}
		/*������ 7���� ����ϴ� �ڵ带 �ۼ��ϼ���*/
		int asdf = 0;
		for (asdf = 0 ; asdf <= 63 ; asdf+=7 ){
			System.out.println("7�� ������"+asdf);
			
		}
	}


}
