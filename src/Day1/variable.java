package Day1;

public class variable {
	public static void main(String[] args) {
		// ���� ��Ģ
		//int 1num; // ó������ ���ڰ� �� �� ����
		//int unm%; // Ư�����ڴ� $,_�� ����
		//int int; // Ű���� ��� �Ұ�
		//int num 1;//������ �Ұ�
		int num;
		//int num; //������ ������ ���� �Ұ�
		int Num; //��ҹ��� �����Ͽ� �ٸ� ������ ���
		//���� ����
		int stundentScore;
		/* 2�ܾ� �̻����� �������� ���� ��� �ι�° �ܾ���ʹ�
		 * ù���ڸ� �빮�ڷ� �Ѵ� : ī��ǥ��� */
		int a;// (x)
		/*������ �������� ���� �ش��ϴ� ��Ȱ�� �� �� �־�� 
		 * �ȴ� */
		num = 10;
		// 10 = num;(x)
		//10 : 10* 1 + 1 * = 10
		System.out.println("num = 10 : "+num);
		num = 0x11;
		//0x11 : 16 * 1 + 1 * 1 = 17
		System.out.println("num = 0x11 : "+num);
		num = 012;
		//012 : 8 * 1 + 1 * 2 =10
		System.out.println("num = 012 : "+num);
		//�Ǽ� ���� Ȯ�� ����
		double num2 = 1.234;
		System.out.println("num2 = 1.234 : "+num2);
		num2 = 1.234e3;
		System.out.println("num2 = 1.234e3 : "+num2);
		//���� ���� ȯ�� ����
		char ch = 'A';
		System.out.println("ch = 'A' : " + ch);
	    ch ='��';
		System.out.println("ch = '��' : " + ch);
	    //bloolean ���� ȯ�� ����
	    boolean isTrue = false;
	    System.out.println("isTrue = false; :" +isTrue);
	    isTrue = true;
	    System.out.println("isTrue = true; :" +isTrue);
	}
}
