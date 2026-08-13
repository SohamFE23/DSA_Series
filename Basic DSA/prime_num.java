public class prime_num {
    public static void main(String args[]){
        int n=4;
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("This is not Prime Number");
                break;
            }
            else{
                System.out.println("This is Prime Number");
                break;
            }
        }
    }
    
}
