import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int N[] = new int[n];
		for(int i=0; i<n; i++) {
			N[i] = i+1;
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			
			if(a!=b) {
				int c = N[a];
				N[a] = N[b];
				N[b] = c;
			}
		}
		
		for(int i : N) {
			bw.write(i + " ");
		}
		
		br.close();
		bw.close();
    }
}