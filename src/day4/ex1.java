package day4;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ּ� ������� ���ϴ� �ڵ带 �ۼ� �غ��ÿ�.
		/*�μ� : num1, num2
		 * �ݺ��� ���� : i
		 * �ּ� ����� : lcm
		 * i�� num1���� num1*num2���� num1�� �����ϸ鼭
		 * �ݺ��Ѵ�.
		 * �ݺ����ȿ��� i�� num1�� ����̰�, i�� num2��
		 * ����̸� lcm�� i�� �����ϰ� �ݺ����� ���������Ѵ�.
		 * �ݺ����� ����ǰ� lcm�� ����ϸ� �ּҰ������ ��µȴ�.*/
		int i=0;
		int num1 = 15, num2 = 20;
		int lcm = 0;
		for(i=num1;i<=num1*num2;i+=num1){
			if(i % num1 == 0 && i % num2 == 0){
				lcm=i;
				break;
			}
		}
			System.out.println(lcm);
		}
	}

