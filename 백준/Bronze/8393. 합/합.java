import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int z = scan.nextInt();
        int a =0;
        for(int i=0; i<z; i++){
            a += i+1;
        }
        System.out.println(a);
    }
}