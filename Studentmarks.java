import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
public class Studentmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tamil mark :");
        int tamil = sc.nextInt();
        if(tamil>=35){
            System.out.println("Tamil Pass");
        }
        else{
            System.out.println("tamil Fail");
        }
        System.out.println("Enter english mark :");
        int english = sc.nextInt();
        if(english>=35){
            System.out.println("English Pass");
        }
        else{
            System.out.println("English Fail");
        }
        System.out.println(" Enter maths mark :");
        int maths = sc.nextInt();
        if(maths>=35){
            System.out.println("Maths Pass");
        }
        else{
            System.out.println("Maths Fail");
        }
        System.out.println("Enter science mark :");
        int science = sc.nextInt();
        if(science>=35){
            System.out.println("Science Pass");
        }
        else {
            System.out.println("Science Fail");
        }
        System.out.println("Enter social mark :");
        int social = sc.nextInt();
        if(social>=35){
            System.out.println("Social Pass");
        }
        else{
            System.out.println("Social Fail");
        }
        int Total = tamil+ english+ maths+  science+ social;
        System.out.println("Total marks: " + Total);
        if(tamil>=35 || english>=35 || maths>=35 || science>=35 || social>=35){
            System.out.println("Get the average value : ");
            int count = 5;
            int  average = Total/count;
            System.out.println("Average value :"+ average);
        }
        
        else{
            System.out.println("Do not getavrage values ");

        }
       
    }
    
}
