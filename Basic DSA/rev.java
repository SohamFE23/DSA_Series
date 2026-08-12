// Reversing the Integer Numbers, Also of big numbers in the integer with both positive and Negative Side and also pass all 1480 test cases

class rev {
    public int reverse(int x) {
        int sum=0;
        while(x!=0){
            int num=x%10;
            x=x/10;
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && num > 7)){
                return 0;
            } 
            if(sum < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE/10 && num<-8)){
                return 0;
            }       
        sum=sum*10+num;

        }
        return sum;
    }
}