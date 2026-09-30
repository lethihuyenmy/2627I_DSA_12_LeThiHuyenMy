import java.util.*;

public class EqualStack {
    public static int equalStack(List<Integer> h1, List<Integer> h2, List<Integer> h3){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        int sum1 = 0,sum2=0,sum3=0;
        for(int i = h1.size()-1; i>=0; i--){
            sum1 += h1.get(i);
            s1.push(h1.get(i));
        }
        for(int i = h2.size()-1; i>=0; i--){
            sum2 += h2.get(i);
            s2.push(h2.get(i));
        }
        for(int i = h3.size()-1; i>=0; i--){
            sum3 += h3.get(i);
            s3.push(h3.get(i));
        }
        while (!(sum1==sum2 && sum2==sum3)){
            if(sum1>=sum2 && sum1>=sum3){
                sum1 -= s1.pop();
            }
            if(sum2>=sum1 && sum2>=sum3){
                sum2 -= s2.pop();
            }
            if(sum3>=sum2 && sum3>=sum1){
                sum3 -= s3.pop();
            }
        }
        return sum3;
        //Tự làm
//        int sum1 =0;
//        int sum2 =0;
//        int sum3 =0;
//        List<Integer> h= new ArrayList<>(300);
//        for(int i = h1.size()-1; i>=0; i--){
//            sum1 += h1.get(i);
//            h.add(sum1);
//        }
//        for(int i = h2.size()-1; i>=0; i--){
//            sum2 += h2.get(i);
//            h.add(sum2);
//        }
//        for(int i = h3.size()-1; i>=0; i--){
//            sum3 += h3.get(i);
//            h.add(sum3);
//        }
//        List<Integer> a= new ArrayList<>();
//        int max = 0;
//        int count = 0;
//        for (int i : h){
//            for ( int j : h){
//                if (!a.contains(i) && !a.contains(j)){
//                    a.add(i);
//                    if (i == j){
//                        count ++;
//                        if (count == 4){
//                            max = i;
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//        return  max;
    }
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        List<Integer> h1 = new ArrayList<>();
        List<Integer> h2 = new ArrayList<>();
        List<Integer> h3 = new ArrayList<>();
        for (int i = 0; i<n1; i++) {
            h1.add(sc.nextInt());
        }
        for (int i = 0; i<n2; i++){
            h2.add(sc.nextInt());
        }
        for (int i = 0; i<n3; i++){
            h3.add(sc.nextInt());
        }
        sc.close();
        int result = equalStack(h1, h2, h3);
        System.out.println(result);

    }
}
