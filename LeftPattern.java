import java.util.Scanner;

public class LeftPattern{

	public static void main(String[] args){
		
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(int i = 0; i < n; i++){
			
			for(int j = 0; j < i ; j++){	
				System.out.print(" ");
			}
		
			for(int k = n - 1; k > i ; k--){
				System.out.print("*");
			}	

		System.out.println("*");		
		}
		
		for(int i = 0; i < n; i++){
			
			for(int j = 1; j < n - i ; j++){	
				System.out.print(" ");
			}
		
			for(int k = 1; k <= i ; k++){
				System.out.print("*");
			}	

			System.out.println("*");		
		
		}
		System.out.println();
	}
}