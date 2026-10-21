
public class QuickSelectMedian {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    public static int quickSelect(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (left == right) {
                return arr[left];
            }

            int pivotIndex = partition(arr, left, right);

            if (k == pivotIndex) {
                return arr[k];
            } else if (k < pivotIndex) {
                right = pivotIndex - 1; // Thu hẹp phạm vi bên trái
            } else {
                left = pivotIndex + 1;  // Thu hẹp phạm vi bên phải
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19, 1, 4};
        int k = arr.length / 2;

        int median = quickSelect(arr, k);
        System.out.println("Trung vi la: " + median);
    }
}
