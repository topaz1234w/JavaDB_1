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
		if(num == 0){
			System.out.println("0 �Դϴ�");
		}else if((num % 2) == 0){
			System.out.println(num+"�� ¦�� �Դϴ�.");
		}
		else{
			System.out.println(num+"�� Ȧ�� �Դϴ�.");
		}

	}

}
