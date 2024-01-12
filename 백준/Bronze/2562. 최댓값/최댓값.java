import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] a = new int[9];
        int max = a[0];
        int index = 0;
        
        for(int i=0; i<a.length; i++){
            a[i] = Integer.parseInt(br.readLine());
            
            if(a[i] > max){
                max = a[i];
                index = i+1;
            }
        }
        bw.write(max + "\n" + index);

        bw.close();
        br.close();
    }
}