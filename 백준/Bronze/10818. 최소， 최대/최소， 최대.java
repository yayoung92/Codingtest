import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int max = 0;
        int min = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());

        }
                    
            for(int j=0; j<a.length; j++){
                int y = a[j];
                if(j == 0){
                    max = y;
                    min = y;
                }
                else if(max < y){
                    max = y;
                }
                else if(min > y){
                    min = y;
                }
            }
        bw.write(min + " " + max);

        bw.close();
        br.close();
    }
}