package PatternMaker;

 public class Stitch  {
     protected String stitchType = "";

     protected Stitch(String stitchType)    {
         this.stitchType = stitchType;
     }

    public void sew()   {
        System.out.print(stitchType);
    }

         //has-a
         //protected String stitchType

         //behavior
         //public void sew()
     }