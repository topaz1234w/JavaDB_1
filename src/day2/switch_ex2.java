package day2;

public class switch_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ���ڰ� ch�� a �Ǵ� A�̸� A�Դϴٶ�� �ֿܼ�
		 * ����ϰ�
		 * ���ڰ� ch�� b�Ǵ� B�̸� B�Դϴٶ�� �ֿܼ�
		 * ����ϰ�
		 * ���ڰ� ch�� a,b,A,B�� �ƴϸ� A�� B�� �ƴմϴ�
		 * ��� �ֿܼ� ����ϴ� ����switch case ������ �ۼ��ϼ���.
		 */
		char ch = 'a';
		switch(ch){
		case 'a':
			System.out.println(ch+"a �Դϴ�");
		break;
		case 'b':
			System.out.println(ch+"b �Դϴ�");
		break;
		case 'A':
			System.out.println(ch+"A �Դϴ�");
		break;
		case 'B':
			System.out.println(ch+"B �Դϴ�");
		break;
		default:
			System.out.println(ch+"A�� B�� �ƴմϴ�");
	 }
	}
}
