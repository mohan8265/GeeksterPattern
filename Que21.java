import java.util.Scanner;

public class Que21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*n-1-2*i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(i==n && j==n){
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
