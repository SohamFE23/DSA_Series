public class sample {
    public static void main(String[] args) {
        // main method body
        int[] arr2 = {1, 5, 9, 7};
        rev(arr2, 0, arr2.length - 1);
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void rev(int[] arr, int r, int l) {
        if (r >= l) {
            return;
        }
        swap(arr, r, l);
        rev(r + 1, l - 1);
    }
}

