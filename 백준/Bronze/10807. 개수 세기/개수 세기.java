import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] z = new int[n];
        int count = 0;

        for(int i=0; i<n; i++){
            z[i] = scan.nextInt();
        }
        
        int y = scan.nextInt();
        for(int i=0; i<z.length; i++) {
            if(z[i]==y){
                count++;
            }
        }

        System.out.println(count);
    }
}