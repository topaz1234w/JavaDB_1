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
			int cnt = 0;//현재까지 생선된 중복되지 않은 번호의 갯수
			/* 랜덤으로 중복되지 않는 로또 번호 생성 하는 코드를
			 * 이용하여 중복되지 않는 로또 번호를 생성하는 코드를
			 * 작성하세여.*/
			arr = crreateRandomArray(min, max, 7);
			if(arr == null){
				System.out.println("로또 번호 생성에 실패 했습니다.");
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
				/* tmp 가 arr와 중복된 값이 없으면
				 * tmp 를 arr에 저장(번지는 잘생각)
				 * cnt를 하나 증가
				 * */
			}
			
			// 생성된 배열 출력
			pirintArray(arr);
			}
		/* 배열 arr에 num의 값이 있는지 없는지 확인하는 코드를
		 * 작성해보세요. 있으면 있다고, 출력 없으면 없다고 출력.
		 * 반복문을 이용하여 배열 arr의 0번지 부터 5번지의 값을
		 * 하나씩 가져와서 num와 같으면 반복문을 강제종료 한다.
		 * 반복문이 종료되면 종료되고난후의 i가 6이면 없음.
		 * 6이 아니면 있음을 출력한다.*/
		/*int num;
		if(isDuplicate(arr, num)==false){
			System.out.println("없음");
		}else{
			System.out.println("있음");
		}*/
		
	
	private static boolean isDuplicate(int[] arr, int tmp, int cnt) {
		return false;
	}

	/* 최소값과 최댓값을 입력받아 최솟값과 최댓값 사이에 있는
	 * 랜덤한 수를 생성하는 메소드 
	 * 1. 메소드명 : randomInt 
	 * 2. 매개변수 : 최소값(int min), 최댓값(int max)
	 * 3. 리턴타입 : 랜덤한 정수(int)
	 * */
	public static int randomInt(int min, int max){
		if(min > max){
			min = max;
			max = min;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	/* main 메소드에서 작성한 코드를 이용하여
	 * 배열 arr에 num과 같은 값이 있는지 없는지를 판별하는
	 * 메소드를 만드세요.
	 * 1.메소드명 : isDuplicate
	 * 2.매개변수 : 배열 arr(int arr[]), num(int num)
	 * 3.리턴타입 : boolean(있으면 true, 없으면 false)
	 * */
	public static boolean isDuplicate(int arr[], int num){
		for (int i=0;i<arr.length;i++){
			if(arr[i]==num){
				return true;
			}
		}
		return false;
	}
	/* 중복되지 않은 랜덤한 수를 생성하여 배열에 저장하는
	 * 메소드를 작성하세요.
	 * 1. 메소드명 : crreateRandomArray
	 * 2. 리턴타입 : int[]
	 * 3. 매개변수 : 최솟값(int min), 최댓값 (int max), 생성할 배열의 갯수 (int size)
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