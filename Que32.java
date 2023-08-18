import java.util.Scanner;

public class Que32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst=1, val=1;

        for(int i=1;i<2*n;i++){
            for(int j=1;j<=nst;j++){
                if(j%2 == 0){
                    System.out.print("* ");
                }else{
                    System.out.print(val +" ");
                }
            }
            System.out.println();
            if(i<n){
                nst += 2;
                val++;
            }else{
                nst -= 2;
                val--;
            }
        }
    }
}
