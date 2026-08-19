public class strpalin{
    public static void main(String [] args){
        String str="nayak";
        pal(str);
    }
    public static void pal(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                System.out.println("Not a palindrome");
                return;
            }
            else{
                System.out.println("Palindrome");
                return;
            }
        }
    }
}