import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int z = scan.nextInt();
		String g = "long ";
		String v = "";
		for(int i=0; i<z/4; i++) {
			v += g;
		}
		System.out.println(v + "int");
    }
}