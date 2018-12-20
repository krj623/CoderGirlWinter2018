package PatternMaker;

import java.util.ArrayList;

 public class TapestryController {

     protected ArrayList<Pattern> stitches;




     public static void main(String[] args) {

//add each pattern as an object
         CrossStitchWigglePattern crossStitchWigglePattern = new CrossStitchWigglePattern(.05);
         ZigZagLinesPattern zigZagLinesPattern = new ZigZagLinesPattern(.00);
         BaublePattern baublePattern = new BaublePattern(.00);
         BlockyBaublePattern blockyBaublePattern = new BlockyBaublePattern(.10);
         BrokenWigglePattern brokenWigglePattern = new BrokenWigglePattern(.40);

//add each pattern to the array
         crossStitchWigglePattern.addCrossStitchWigglePattern();
         printPattern(crossStitchWigglePattern);

         zigZagLinesPattern.addZigZagLinesPattern();
         printPattern(zigZagLinesPattern);

         baublePattern.addBaublePattern();
         printPattern(baublePattern);

         blockyBaublePattern.addBlockyBaublePattern();
         printPattern(blockyBaublePattern);

         brokenWigglePattern.addBrokenWigglePattern();
         printPattern(brokenWigglePattern);
}
         //print pattern in a band 8-blocks wide and 3 rows tall


     public static void printPattern(Pattern p) {

         for (int r = 0; r <= 7; r++) {
             p.printPattern();
         }
         for (int c = 0; c < 2; c++) {
             System.out.println();
             for (int r = 0; r <= 7; r++) {
                 p.printPattern();
             }
         }

         System.out.println();
         System.out.println();
         System.out.println();

//print pattern in a band 6-blocks wide and 8 rows tall

         for (int rr = 0; rr <= 5; rr++) {
             p.printPattern();
         }
         for (int cc = 0; cc < 7; cc++) {
             System.out.println();
             for (int rr = 0; rr <= 5; rr++) {
                 p.printPattern();
             }
         }

         System.out.println();
         System.out.println();
         System.out.println();

     }




// METHODNAME (patternName,
         // for int x to x+7 ; x++ {
         // paternVariable.printPattern();
         //}

//print each pattern
//             crossStitchWigglePattern.printPattern();
//             System.out.println();
//             zigZagLinesPattern.printPattern();
//             System.out.println();
//             baublePattern.printPattern();
//             System.out.println();
//             blockyBaublePattern.printPattern();
//             System.out.println();
//             brokenWigglePattern.printPattern();


     }









