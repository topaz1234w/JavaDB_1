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
		 * *****	i:5		°ø¹éÀÇ°¹¼ö:0		º°ÀÇ°¹¼ö: 5
		 *  ****	i:4		°ø¹éÀÇ°¹¼ö:1		º°ÀÇ°¹¼ö: 4
		 *   ***	i:3		°ø¹éÀÇ°¹¼ö:2		º°ÀÇ°¹¼ö: 3
		 *    **	i:2		°ø¹éÀÇ°¹¼ö:3		º°ÀÇ°¹¼ö: 2
		 *     *	i:1		°ø¹éÀÇ°¹¼ö:4		º°ÀÇ°¹¼ö: 1
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
		 *   *  1	°ø¹éÀÇ °¹¼ö :2		º°ÀÇ°¹¼ö:1
		 *  **  2	°ø¹éÀÇ °¹¼ö :1 	º°ÀÇ°¹¼ö:2
		 * ***  3	°ø¹éÀÇ °¹¼ö :0		º°ÀÇ°¹¼ö:3
		 *  **  4	°ø¹éÀÇ °¹¼ö :1		º°ÀÇ°¹¼ö:2
		 *   *  5	°ø¹éÀÇ °¹¼ö :2		º°ÀÇ°¹¼ö:1
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

