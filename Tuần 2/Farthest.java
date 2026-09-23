import java.util.Scanner;

public class Farthest {
    public static void findFarthest( double[] a){
        if (a == null| a.length <2){
            System.out.println("Can co it nhat 2 phan tu");
            return;
        }
        double min =a[0];
        double max = a[0];
        for (int i =1; i< a.length; i++){
            if (a[i]<min) {
                min = a[i];
            }
            if (a[i]>max){
                max =a[i];
            }
        }
        double distance = Math.abs(max-min);
        System.out.println("Cặp xa nhất là: " + min + " và " + max);
        System.out.println("Khoảng cách là: " + distance);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        int n = sc.nextInt();
        if (n<2) {
            System.out.println("Số phần tử ít nhất bằng 2!");
        }
        double[] a = new double[n];
        for( int i=0; i<n; i++){
            a[i]= sc.nextDouble();
        }
        findFarthest(a);
        sc.close();
    }
}
