//Count digits in a number

public class numbercount{
    public static void main(String args[]){
        int count=0;
        Integer n=Integer.parseInt("2908");
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Number of digits in the number is: "+count);
    }
}

