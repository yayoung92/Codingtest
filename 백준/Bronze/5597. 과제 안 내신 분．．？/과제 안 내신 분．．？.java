import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x[] = new int[30];

        int y = 0;

        int z[] = new int[28];

        for(int i=0; i<z.length; i++){
            x[Integer.parseInt(br.readLine())-1] = 1;
        }

        for(int i=0; i<x.length; i++){
            if(x[i]==0){
                y = i+1;
                System.out.println(y);
            }
        }

        bw.close();
        br.close();
    }
}