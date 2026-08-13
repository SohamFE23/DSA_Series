class palindromeex{
    public static void main(String args[]){
        int a=121;
        int lastdeigit=0;
        int sum=0;       
        while(a>0){
            lastdeigit=a%10;
            sum=sum+lastdeigit;
            a=a/10;
        }
        if(sum==a){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
        
    }
}