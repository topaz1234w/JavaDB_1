package day4;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		for(int i = 0; i<5; i++){
			arr[i] =i;
		}
		/*�迭�� ��� �����͸� ������ �� ���
		 * �迭�� ���� �������� ���� �� ���
		 * ��� �迭�� �ѹ��� ������ �ʿ��Ҷ�
		 * */
		for(int tmp:arr){
			System.out.println(tmp);
		}
		/* �ڷ��� �̸�[];
		 * �ڷ��� �̸� [] = new �ڷ��� [�迭�� ũ��];
		 * */
		/* ����num�� �� �ڸ� �� �߶� �Ųٷ� �迭�� �����ϴ� �ڵ� ��
		 * �ۼ��ϼ���. �� �ں����� ����ؾ��մϴ�.
		 * num =1234
		 * 0���� : 4, 1���� : 3,2 ���� : 2, 3���� : 1
		 * 
		 * 1234 % 10 => 4�� �̾Ƴ��� 0������ ����, 1234/10=>123
		 * 123 => 3, 1������ ����, 123=>12
		 * 12 => 2, 2������ ����, 12=>1
		 * 1 => 1, 3������ ����, 1=>0
		 * */
		int num = 1234;
		arr= new int [11];
		int cnt =0;//�迭�� ����� ����
		while(num != 0){
			arr[cnt] = num % 10;//������ �ڸ��� �����Ͽ� �迭�� ����
			num = num /10;//������ ������ �ڸ��� ������ �ڵ�
			cnt++;//����� ���� ����
		}
		int i = 0;
		while(i< cnt){
			System.out.print(arr[i]);
			i++;
		}
		System.out.println();
	}

}
