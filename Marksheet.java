import java.util.*;
public class Marksheet{
 public static void main (String[]args)  {
    Scanner sc = new Scanner(System.in);
    int[] m = new int[3];
    System.out.println("Enter marks of 3 subjects:");
    for (int i = 0; i < 3; i++)
    m[i] = sc.nextInt();

    int total = m[0] + m[1] + m[2];
    float avg =total / 3f;

    System.out.println("Total= " + total );
    System.out.println("Average: " + avg );

    if(avg>=90){
        System.out.println("Grade: A");
    }else if (avg >=75){
        System.out.println("Grade: B");
    }else if(avg >=60){
        System.out.println("Grade: C");
    }
    else{
        System.out.println("Grade: Fail");
    }
}

}