import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
		int aa = scan.nextInt();
		int bb = scan.nextInt();
		int cc = scan.nextInt();
		
		if(aa==bb && bb==cc) {
			System.out.println(10000+ aa*1000);
		} else if(aa!=bb && bb!=cc && aa!=cc) {
			System.out.println(Math.max(Math.max(aa, bb), cc)*100);
		} else if((aa==bb && aa!=cc) || (aa==cc && aa!=bb)) {
			System.out.println(1000+aa*100);
		} else if(bb==cc&& bb!=aa) {
			System.out.println(1000+bb*100);
		}
    }
}