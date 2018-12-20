package PatternMaker;
import java.util.ArrayList;
import java.util.Iterator;

 class Pattern
         //has-a's
         //ArrayList<Stitch> stitches
         //double jamRate

         //behaviors
         //pattern()

 {
  protected ArrayList<Stitch> stitches = new ArrayList();
  protected double jamRate;




 public Pattern(double jamRate) {
  this.jamRate = jamRate;
  stitches = new ArrayList();
 }



 public void printPattern() {
  boolean needleJam = (Math.random() <this.jamRate);
  Iterator iter = stitches.iterator();
  if (!needleJam) {
   while (iter.hasNext()) {
    Stitch a = (Stitch) iter.next();
    a.sew();
   }
  }
  else if (needleJam) {
   for (int i = 0; i < (stitches.size()/2); i++)
//
   {
      Stitch a = stitches.get(i);
      a.sew();
   }
  }
//  System.out.print(" | ");
 }

  }