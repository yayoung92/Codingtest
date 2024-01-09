import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int aa = scan.nextInt();
        if(aa>=90 && aa<=100) {
			System.out.println("A");
		} else if(aa>=80 && aa<90) {
			System.out.println("B");
		} else if(aa>=70 && aa<80) {
			System.out.println("C");
		} else if(aa>=60 && aa<70) {
			System.out.println("D");
		} else 
            System.out.println("F");
    }
}