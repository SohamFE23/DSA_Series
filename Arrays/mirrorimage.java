package Arrays;

public class mirrorimage {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Array:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Mirror Image of the Array:");
        for(int row=0; row<arr.length; row++){
            for(int i=arr[row].length-1; i>=0; i--){
                System.out.print(arr[i][row]+" ");
            }
            System.out.println();
        }
    }

}
