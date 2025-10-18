
/**
 * Write a description of class lab1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class lab1
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Please enter the year of your birth: ");
        int birthdate = scanner.nextInt();
        int age = 2025 - birthdate;
        System.out.print("At the end of 2025" + " you will be " + age + " years old");
        //system.out.println
        
    }
}