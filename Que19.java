import java.util.Scanner;

public class Que19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n/2+1;i++){   
            for(int j=i;j<=n/2+1;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*i-3;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=n/2+1;j++){
                if(i==1 && j==1){
                    continue;
                }
                System.out.print("* ");   
            }
            System.out.println();
        }

        for(int i=n/2;i>=1;i--){   
            for(int j=i;j<=n/2+1;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*i-3;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=n/2+1;j++){
                if(i==1 && j==1){
                    continue;
                }
                System.out.print("* ");   
            }
            System.out.println();
        }
    }
}
