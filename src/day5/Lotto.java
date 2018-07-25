package day5;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int[6];
		int i;
		for(i=0;i<6; i++){
			arr[i] =i;
		}
			int min = 1, max =6;
			int cnt = 0;//������� ������ �ߺ����� ���� ��ȣ�� ����
			/* �������� �ߺ����� �ʴ� �ζ� ��ȣ ���� �ϴ� �ڵ带
			 * �̿��Ͽ� �ߺ����� �ʴ� �ζ� ��ȣ�� �����ϴ� �ڵ带
			 * �ۼ��ϼ���.*/
			arr = crreateRandomArray(min, max, 7);
			if(arr == null){
				System.out.println("�ζ� ��ȣ ������ ���� �߽��ϴ�.");
			}else{
				
			}
			for ( i =0 ; i<arr.length; i++){
				arr[i] =0;
			}
			for( ; cnt<arr.length; ){
				int tmp = randomInt(min,max);
				if(!isDuplicate(arr,tmp,cnt)){
					arr[cnt] =tmp;
					cnt++;
				}
				/* tmp �� arr�� �ߺ��� ���� ������
				 * tmp �� arr�� ����(������ �߻���)
				 * cnt�� �ϳ� ����
				 * */
			}
			
			// ������ �迭 ���
			pirintArray(arr);
			}
		/* �迭 arr�� num�� ���� �ִ��� ������ Ȯ���ϴ� �ڵ带
		 * �ۼ��غ�����. ������ �ִٰ�, ��� ������ ���ٰ� ���.
		 * �ݺ����� �̿��Ͽ� �迭 arr�� 0���� ���� 5������ ����
		 * �ϳ��� �����ͼ� num�� ������ �ݺ����� �������� �Ѵ�.
		 * �ݺ����� ����Ǹ� ����ǰ����� i�� 6�̸� ����.
		 * 6�� �ƴϸ� ������ ����Ѵ�.*/
		/*int num;
		if(isDuplicate(arr, num)==false){
			System.out.println("����");
		}else{
			System.out.println("����");
		}*/
		
	
	private static boolean isDuplicate(int[] arr, int tmp, int cnt) {
		return false;
	}

	/* �ּҰ��� �ִ��� �Է¹޾� �ּڰ��� �ִ� ���̿� �ִ�
	 * ������ ���� �����ϴ� �޼ҵ� 
	 * 1. �޼ҵ�� : randomInt 
	 * 2. �Ű����� : �ּҰ�(int min), �ִ�(int max)
	 * 3. ����Ÿ�� : ������ ����(int)
	 * */
	public static int randomInt(int min, int max){
		if(min > max){
			min = max;
			max = min;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	/* main �޼ҵ忡�� �ۼ��� �ڵ带 �̿��Ͽ�
	 * �迭 arr�� num�� ���� ���� �ִ��� �������� �Ǻ��ϴ�
	 * �޼ҵ带 ���弼��.
	 * 1.�޼ҵ�� : isDuplicate
	 * 2.�Ű����� : �迭 arr(int arr[]), num(int num)
	 * 3.����Ÿ�� : boolean(������ true, ������ false)
	 * */
	public static boolean isDuplicate(int arr[], int num){
		for (int i=0;i<arr.length;i++){
			if(arr[i]==num){
				return true;
			}
		}
		return false;
	}
	/* �ߺ����� ���� ������ ���� �����Ͽ� �迭�� �����ϴ�
	 * �޼ҵ带 �ۼ��ϼ���.
	 * 1. �޼ҵ�� : crreateRandomArray
	 * 2. ����Ÿ�� : int[]
	 * 3. �Ű����� : �ּڰ�(int min), �ִ� (int max), ������ �迭�� ���� (int size)
	 * */
	public static int[] crreateRandomArray(int min, int max, int size){
		if(min > max){
//			int tmp = min;
//			min = max;
//			max = tmp;
			return null;
		}
		if(max-min+1 > size){
			return null;
		}
		int arr[] =new int[6];
		for( ; size<arr.length; ){
			int tmp = randomInt(min,max);
			if(!isDuplicate(arr,tmp,size)){
					arr[size] =tmp;
					size++;
				}
	}
		return arr;
	}
	public static void pirintArray(int arr[]){
		for(int i=0; i < arr.length;i++){
			System.out.println(arr[i] + " ");
	}
}
}