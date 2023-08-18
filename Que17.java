import java.util.Scanner;

public class Que17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst=n/2, nsp=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            System.out.println();

            if(i<=n/2){
                nst--;
                nsp+=2;
            }else{
                nst++;
                nsp-=2;
            }
        }
    }
}
