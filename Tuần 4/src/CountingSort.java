import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//bài 7
public class CountingSort {
    public static void countSort(List<Integer> ds) {
        int[] count  =new  int[100];
        for (int i : ds){
            if(0<=i && i<=99){
                count[i] ++;
            }
        }
        for (int i =0; i<=99; i++){
            System.out.print(count[i] + " ");
        }
    }
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        List<Integer> ds = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        if (100<=n && n<=1000000){
        for (int i=0; i<n; i++){
            int a= sc.nextInt();
            ds.add(a);
        }
        countSort(ds);
        }
        sc.close();
    }
}
