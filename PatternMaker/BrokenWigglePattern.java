package PatternMaker;

public class BrokenWigglePattern extends Pattern {
    public BrokenWigglePattern(double jamRate) {
        super(jamRate);
        jamRate = .40;
//        needleJam = (Math.random() <0.40d);
    }

    public void addBrokenWigglePattern() {
            for (int i = 0; i < 5; i++) {
                stitches.add(new SmallCrossStitch());
                stitches.add(new LargeCrossStitch());
            }
//        else if (needleJam = true){
//            for (int i = 0; i < 2; i++) {
//                stitches.add(new SmallCrossStitch());
//                stitches.add(new LargeCrossStitch());
//            }
        }
//    pattern looks like this: xXxXxXxXxX
//    Needle jam rate: 5%

        //has-a
        //ArrayList<Stitch> stitches (inherited from Pattern)

        //behavior
        //pattern() (inherited from Pattern)
    }


