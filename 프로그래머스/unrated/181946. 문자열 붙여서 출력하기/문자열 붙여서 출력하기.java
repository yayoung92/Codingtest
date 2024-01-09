import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        String filter = "";
        for(int i=0; i<a.length(); i++){
            filter +=  a.charAt(i);
        }
        for(int j=0; j<b.length(); j++){
            filter += b.charAt(j);       
        }
        System.out.println(filter);
        
    }
}