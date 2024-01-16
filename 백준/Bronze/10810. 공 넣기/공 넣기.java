import java.util.*;

public class Main{
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();  
		int m = scan.nextInt();  
		
		int N[] = new int[n];
		int M[] = new int[m];
		
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			for(int j=a-1; j<b; j++) {
			    N[j] = c;
			}		
		}
		for(int i : N) {
			System.out.print(i + " ");
		}
    }
}