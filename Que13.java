import java.util.Scanner;

public class Que13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;

        for(int i=1;i<2*n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            if(i<n){
                nst++;
            }else{
                nst--;
            }
            System.out.println();
        }
    
    }
}
