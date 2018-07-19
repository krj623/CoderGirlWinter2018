import java.util.Scanner;
import static java.lang.System.out;
public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Please list three items on your grocery shopping list.");

        String itemOne;
        out.print("Item 1? ");
        itemOne = keyboard.next();
        out.println();

        String itemTwo;
        out.print("Item 2? ");
        itemTwo = keyboard.next();
        out.println();

        String itemThree;
        out.print("Item 3? ");
        itemThree = keyboard.next();

        out.println("Now, please enter the quantity of each item.");
        out.print("How many " + itemOne + "? ");
        int quantityOne = keyboard.nextInt(); keyboard.skip("\n");
        out.println();

        out.print("How many " + itemTwo + "? ");
        int quantityTwo = keyboard.nextInt(); keyboard.skip("\n");
        out.println();

        out.print("How many " + itemThree + "? ");
        int quantityThree = keyboard.nextInt(); keyboard.skip("\n");
        out.println();

    out.println("Now, please enter the price of each item.");

    out.print("How much does one " + itemOne + " cost? ");
    float itemOneCost = keyboard.nextFloat(); keyboard.skip("\n");
        out.println();

        out.print("How much does one " + itemTwo + " cost? ");
        float itemTwoCost = keyboard.nextFloat(); keyboard.skip("\n");
        out.println();

        out.print("How much does one " + itemThree + " cost? ");
        float itemThreeCost = keyboard.nextFloat(); keyboard.skip("\n");
        out.println();

        out.println("Calculating your grocery bill.");
        float total1 = quantityOne * itemOneCost;
        float total2 = quantityTwo * itemTwoCost;
        float total3 = quantityThree * itemThreeCost;

        out.println("Your total cost is " + (total1+total2+total3));

    }
}