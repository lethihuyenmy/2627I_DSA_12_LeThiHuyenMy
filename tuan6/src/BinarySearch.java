import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int V){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = left + (right -left)/2;
            if (arr[mid] == V){
                return mid;
            }
            if (arr[mid] > V){
                right = mid -1;
            }
            else {
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int V = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int index = binarySearch(arr, V);
        System.out.println(index);
        sc.close();
    }
}
