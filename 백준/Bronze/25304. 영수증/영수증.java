import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int n = scan.nextInt();
		int answer = 0;
		for(int i=1; i<=n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			answer += a*b;
		}
		if(answer==X) {
			System.out.println("Yes");
		} else
			System.out.println("No");
    }
}