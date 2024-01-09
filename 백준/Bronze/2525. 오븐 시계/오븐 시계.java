import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
		int aa = scan.nextInt(); 
		int bb = scan.nextInt(); 
		int cc = scan.nextInt();
		
		int min = 60 * aa+bb; 
		min += cc;
		
		int hour =(min/60)%24; 
		int minute = min%60;   
		
		System.out.println(hour + " " + minute);
    }
}