import java.util.*;
class Student{
    int id;
    String name;
    String dept;

    Student(int id, String name, String dept ){
        this.id = id;
        this.name = name;
        this.dept = dept;

    }
    
}
public class StudentManagemant{
    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.println("Choose: ");
            
            int choice = sc.nextInt();

            switch (choice){
                case 1: addStudent();
                break;
                case 2: viewStudents();
                break;
                case 3: searchStudent();
                break;
                case 4: System.exit(0);
            }
        }
    }
    static void addStudent(){
        System.out.println("ID: ");
        int id =sc.nextInt();
        sc.nextLine();
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Departmant:");
        String dept = sc.nextLine();

        list.add(new Student(id, name,dept));
        System.out.println("Student Added!");
}
    static void viewStudents(){
        for(Student s : list){
            System.out.println(s.id + " - " + s.name + " - " + s.dept);
        }
    }
    static void searchStudent(){
        System.out.println("Enter ID: ");
        int id = sc.nextInt();

        for (Student s : list){
            if(s.id == id){
                System.out.println("Found: " + s.name + "(" + s.dept + ")");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }
 }