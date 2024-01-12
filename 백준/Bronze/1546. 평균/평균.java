import java.util.*;

public class Main{
    public static void main(String[] args){
         Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int score[] = new int[n];
        int max = 0;
        double sum = 0;

        for(int i=0; i<n; i++){
            score[i] = scn.nextInt();

            int y = score[i];

            if(max < y) {
                max = y;
            }
        }

        for(int i=0; i<score.length; i++){
            double z = ((double)score[i]/(double)max)*100;
            sum += z;
        }
        System.out.println(sum/score.length);       
    }
}