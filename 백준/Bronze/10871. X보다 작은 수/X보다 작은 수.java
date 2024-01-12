import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());
        int a = 0;
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            a = Integer.parseInt(st.nextToken());
            
            if(a < z){
                System.out.println(a);
            }
        }
        bw.close();
        br.close();
    }
}