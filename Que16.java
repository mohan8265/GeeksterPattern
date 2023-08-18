import java.util.Scanner;

public class Que16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp=n-1, nst=n;

        for(int i=1;i<2*n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<n){
                nsp--;
                nst--;
            }else{
                nsp++;
                nst++;
            }
        }
    }
}
