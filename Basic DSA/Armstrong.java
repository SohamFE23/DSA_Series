public class Armstrong {
    int a=371;
    int sum=0;
    public void CheckArmstrongNumber(){
        while(a>0){
            int temp=a%10;
            sum= sum + (int)Math.pow(temp,3);
            a=a/10; 
        }
        if(sum==a)
            System.out.println("The number is Armstrong");
        else
            System.out.println("The number is not Armstrong");
    }
}
