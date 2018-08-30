import static java.lang.System.out;
import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.println("Welcome to Multiplaction Tables");
        out.println("How large of a table would you like?");

        int size = keyboard.nextInt();
        int a = 0;
        int b = 0;
        keyboard.skip("\n");
        //this is the outer loop which controls the first number//
        for (a = 0; a <= size; a++)
            //this is the inner loop which controls the second number//
            {
                for (b = 0; b <= size; b++)
                out.println(a+ " * " + b + " = " + (a * b));
            }


        }
    }
