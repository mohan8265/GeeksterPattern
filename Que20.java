import java.util.Scanner;

public class Que20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst=1, nsp=n/2;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                if(j==1 || j==nst){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            if(i<=n/2){
                nst+=2;
                nsp--;
            }else{
                nst-=2;
                nsp++;
            }
        }
    }
}
