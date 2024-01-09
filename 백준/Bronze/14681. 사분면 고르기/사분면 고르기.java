import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();
        
        if(a >0 && b >0) {
			System.out.println("1");
		} else if(a <0 && b>0) {
			System.out.println("2");
		} else if(a <0 && b <0) {
			System.out.println("3");
		} else if(a >0 && b <0) {
			System.out.println("4");
		}
    }
}