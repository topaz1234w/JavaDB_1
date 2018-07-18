package day3;

public class forex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=5;i++){
			for(int j =1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i =1 ;i<=5;i++){
			for(int j =1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*规过 1*/
		for (int i =1 ;i<=5;i++){
			for(int j =1;j<=5-i;j++){
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++){
				System.out.println("*");
				
			}
			System.out.println();
		}
		//规过2
		for (int i =1 ;i<=5;i++){
			for(int j =1;j<=5;j++){
				if(j<=5-i)
				System.out.print(" ");
				else
				System.out.print("*");
				
			}
			System.out.println();
		}
		for (int i=1  ;i<=5;i++){
			for (int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				
			}
			System.out.print("*");
			
		}
		
	}	
}
