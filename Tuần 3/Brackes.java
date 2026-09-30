import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import static java.util.Collections.replaceAll;

public class Brackes {
    public static String brackes(String a) {
        Stack<Character> st = new Stack<>();
        a = a.replaceAll("\\s+", "");
        for (char i : a.toCharArray()) {
            if (i == '[' | i == '{' | i == '(') {
                st.push(i);
            } else {
                if (st.isEmpty()) {
                    return "NO";
                }
                char top = st.pop();
                if (top == '(' && i != ')') {
                    return "NO";
                }
                else if (top == '[' && i != ']') {
                    return "NO";
                }
                else if (top == '{' && i != '}') {
                    return "NO";
                }
            }
        }
        return st.isEmpty() ? "YES" : "NO";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> st = new ArrayList<>(n);
        if (1 > n && n > 1000){ System.out.println("Nhập lại n: ");}
        for (int i = 0; i< n; i++){
            String a = sc.nextLine();
            st.add(a);
        }
        for (String a:st){
            System.out.println(brackes(a));
        }
    }
}
