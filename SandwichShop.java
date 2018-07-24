import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;


        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is 50");
        out.println("How many veggie sandwiches were sold today?");
        int veggiesSold = keyboard.nextInt();
        keyboard.skip("\n");

        if (veggiesSold > goalForVeggies)
        {
            out.println("Made goal for veggies.");
        }
         else if (veggiesSold == goalForVeggies)
          {
            out.println("Meets goal for veggies.");
          }
         else
         {
            out.println("Fell short of goal for veggies.");
         }


        out.println("The sales goal for burgers is 250");
        out.println("How many burgers were sold today?");
        int burgersSold = keyboard.nextInt();
        keyboard.skip("\n");

        if (burgersSold > goalForBurgers)
        {
            out.println("Made goal for burgers.");
        }
         else if(burgersSold == goalForBurgers)
        {
            out.println("Meets goal for burgers.");
        }
         else
         {
            out.println("Fell short of goal for burgers.");
         }

        out.println("The sales goal for subs is 180");
        out.println("How many subs were sold today?");
        int subsSold = keyboard.nextInt(); keyboard.skip("\n");

        if (subsSold > goalForSubs)
        {
            out.println("Made goal for subs.");
        }
        else if (subsSold == goalForSubs)
        {
            out.println("Meets goal for subs.");
        }
        else
        {
            out.println("Fell short of goal.");
        }


        out.println("The sales goal for soup is 70");
        out.println("How many soups were sold today?");
        int soupSold = keyboard.nextInt(); keyboard.skip("\n");

        if (soupSold > goalForSoup)
        {
            out.println("Made goal for soup.");
        }
        else if (soupSold == goalForSoup)
        {
            out.println("Meets goal for soup.");
        }
        else
        {
            out.println("Fell short of goal for soup.");
        }
        out.println();

      if (veggiesSold >=50 && burgersSold >= 250 && subsSold >= 180 && soupSold >= 70)
        {out.println("Made goal for everything!");}


    }
}