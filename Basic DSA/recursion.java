import java.util.Scanner;

public class recursion{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int i=sc.nextInt();
        fact(i,sum);
        System.out.println(fact2(10));
    }
    public static int fact2(int n){
        if(n==0){
            return 0;
        }
        return n+ fact2(n-1);
    }

    public static void fact(int sum){
        int j=0;
        if(j<1){
            System.out.println(sum);
            return;
        }
        fact(j-1,sum+j);

    }
    public static void fact(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        fact(i-1,sum+i);
    }
}