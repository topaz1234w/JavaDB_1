package day4;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		for(int i = 0; i<5; i++){
			arr[i] =i;
		}
		/*배열의 모든 데이터를 가져올 때 사용
		 * 배열의 값을 수정하지 않을 때 사용
		 * 모든 배열의 한번씩 접근이 필요할때
		 * */
		for(int tmp:arr){
			System.out.println(tmp);
		}
		/* 자료형 이름[];
		 * 자료형 이름 [] = new 자료형 [배열의 크기];
		 * */
		/* 정수num의 각 자리 를 잘라서 거꾸로 배열에 저장하는 코드 를
		 * 작성하세요. 단 박복문을 사용해야합니다.
		 * num =1234
		 * 0번지 : 4, 1번지 : 3,2 번지 : 2, 3번지 : 1
		 * 
		 * 1234 % 10 => 4을 뽑아내어 0번지에 저장, 1234/10=>123
		 * 123 => 3, 1번지에 저장, 123=>12
		 * 12 => 2, 2번지에 저장, 12=>1
		 * 1 => 1, 3번지에 저장, 1=>0
		 * */
		int num = 1234;
		arr= new int [11];
		int cnt =0;//배열의 저장된 갯수
		while(num != 0){
			arr[cnt] = num % 10;//마지막 자리를 추출하여 배열에 저장
			num = num /10;//숫자의 마지막 자리를 버리는 코드
			cnt++;//저장된 갯수 증가
		}
		int i = 0;
		while(i< cnt){
			System.out.print(arr[i]);
			i++;
		}
		System.out.println();
	}

}
