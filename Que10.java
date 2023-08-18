import java.util.Scanner;

public class Que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 2*n-1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nst -= 2;
            System.out.println();
        }
    }
}
