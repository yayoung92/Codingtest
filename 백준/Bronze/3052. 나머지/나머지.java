import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int z[] = new int[10];
        int n[] = new int[10];
        int count = 0;

        for(int i=0; i<z.length; i++){
            z[i] = scn.nextInt();
        }

        for(int i=0; i<n.length; i++){
            n[i] = z[i]%42;
        }

        for(int i=0; i<n.length; i++) {
            int y = n[i];
            boolean tcount = true;

            for(int j=0; j<i; j++){
                if(y==n[j]){
                    tcount = false;
                    break;
                }
            }
            if(tcount){ 
                count++;
            }
        }
        System.out.println(count);        
    }
}