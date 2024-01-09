import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int z = Integer.parseInt(a.readLine());
        
        for(int i=0; i<z; i++){
            st = new StringTokenizer(a.readLine());
            b.write(("Case #" + (i+1) + ": ")+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }
        b.close();
    }
}