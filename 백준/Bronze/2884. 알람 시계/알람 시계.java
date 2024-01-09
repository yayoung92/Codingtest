import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        if(b < 45) {
			a--;
			b= 60-(45-b);
			if(a <0) {
				a= 23;
			}
			System.out.printf("%s %s", a, b);
		} else {
			System.out.printf("%s %s", a, b-45);
		}
    }
}