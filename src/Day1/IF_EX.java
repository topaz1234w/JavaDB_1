package Day1;

public class IF_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if(���ǽ�1){
		 *     ���๮1;//���ǽ��� ���� �� �����
		 * }
		 * else if(���ǽ�2){
		 * 		���๮2;//���ǽ� 1�� �����̰�, ���ǽ�2�� ���� ��� �����
		 * }
		 * else {
		 * 		���๮3;//���ǽ��� ������ �� �����
		 * }
		 * if�� else if�� ������ �߿�!!!!
		 */
		
		int num =0;
		//���� num�� 0�̸�, �ֿܼ� 0�Դϴٸ� ����ϼ���.
		if(num == 0){
			System.out.println("0 �Դϴ�");
		//���� num�� 2�� ���������� 0�� ���ٸ�, �ֿܼ� ¦���Դϴٸ� ����ϼ���.
		}else if((num % 2) == 0){
			System.out.println(num+"�� ¦�� �Դϴ�.");
		}
		// ���� num�� 0�� �ƴϰ�, num�� 2�� �������� �� 0�� ���� �ʴٸ� �ݼֿ� Ȧ���� ����ϼ���.
		else{
			System.out.println(num+"�� Ȧ�� �Դϴ�.");
		}

	}

}
