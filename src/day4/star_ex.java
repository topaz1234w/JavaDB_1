package day4;

import java.util.Scanner;

public class star_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ****
		 * ****
		 * ****
		 * ****
		 */
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		for(int i = 1; i<=4;i++){
			for(int j = 1; j<=4; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * *
		 * **
		 * ***
		 * ****
		 */
		for(int i =1;i<=num;i++){
			for(int j =1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		for(int i =1;i<=num;i++){
			for(int j =1; j<=i-1; j++){
				System.out.print(" ");
			}
			for(int j=1;j<=num+1-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * *****	i:5		�����ǰ���:0		���ǰ���: 5
		 *  ****	i:4		�����ǰ���:1		���ǰ���: 4
		 *   ***	i:3		�����ǰ���:2		���ǰ���: 3
		 *    **	i:2		�����ǰ���:3		���ǰ���: 2
		 *     *	i:1		�����ǰ���:4		���ǰ���: 1
		 *     						num-i			 i
		 */
		for(int i =1;i>=1;i--){
			for(int j =1; j<=num-1; j++){
				System.out.print(" ");
			}
			for(int j=1;j<=1-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i =1;i<=num ; i++){
			for(int j=1; j<=num ; j++){
				if(j<=i-1){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		/*
		 *   *  1	������ ���� :2		���ǰ���:1
		 *  **  2	������ ���� :1 	���ǰ���:2
		 * ***  3	������ ���� :0		���ǰ���:3
		 *  **  4	������ ���� :1		���ǰ���:2
		 *   *  5	������ ���� :2		���ǰ���:1
		 *   		Math.abs(3-i)  3-Math.abs(3-i)
		 *   num = 5 (num+1)/2
		 */
		for(int i = 1; i<num ; i++ ){
			for(int j=1; j<=(num+1)/2; j++){
				if(j<=Math.abs((num+1)/2-i)){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
		}
			System.out.println();
		}
		System.out.println();
	}
}

