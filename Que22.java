import java.util.Scanner;

public class Que22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*i-3;j++){
                System.out.print("  ");
            }   
             for(int j=i;j<=n;j++){
                if(i==1 && j==1){
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
