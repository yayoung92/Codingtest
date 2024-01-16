import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken()); 
		
		int N[] = new int[a]; 
		for(int i=0; i<a; i++) {
			N[i] = i+1;
		}
		
		for(int i=0; i<b; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int M = Integer.parseInt(st.nextToken())-1;
			int J = Integer.parseInt(st.nextToken())-1;
            
            while(M<J){
                int t = N[M];
                N[M++] = N[J];
                N[J--] = t;
            }
		}
        for(int z : N){
            	bw.write(z + " ");
        }
	
		br.close();
		bw.close();        
    }
}