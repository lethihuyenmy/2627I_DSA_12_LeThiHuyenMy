import java.sql.Struct;
import java.util.*;

public class Student {
    public int id;
    public String name;
    public double gpa;

    public Student(int id, String name, double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
}
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student x, Student y){
        if (Double.compare(y.gpa, x.gpa) != 0){
            return Double.compare(y.gpa, x.gpa);
        }
        if (!x.name.equals(y.name)){
            return x.name.compareTo(y.name);
        }
        return Integer.compare(x.id, y.id);
    }
    public static void main(String[] args ){
        Scanner scanner =new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int n= scanner.nextInt();
        scanner.nextLine();
        List<Student> studentList = new ArrayList<>(n);
        while(n>0){
            int id = scanner.nextInt();
            String name = scanner.next();
            double gpa = scanner.nextDouble();
            Student student = new Student(id, name, gpa);
            studentList.add(student);
            n--;
        }
        Collections.sort(studentList, new StudentComparator());
        for (Student i : studentList){
            System.out.println(i.name);
        }
        scanner.close();
    }
}


