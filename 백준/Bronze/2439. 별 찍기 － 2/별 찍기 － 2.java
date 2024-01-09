import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        for(int i=0; i<a; i++){
            for(int j=a-1; j>i; j--){
                System.out.print(" ");
            }
            for(int z=0; z<=i; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}