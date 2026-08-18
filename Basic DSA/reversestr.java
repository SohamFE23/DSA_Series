import java.util.Arrays;

public class reversestr{
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        rev(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void rev(int arr[],int i){
        {
            if(i>=arr.length-1/2){
                return;
            }
            swap(arr,i,arr.length-i-1);
            rev(arr,i+1);
        }
    }
}