import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int z = Integer.parseInt(br.readLine());
        
        for(int i=0; i<z; i++){
            for(int j=0; j<=i; j++){
                bw.write("*");
            }
            bw.newLine();
        }
        bw.close();
    }
}