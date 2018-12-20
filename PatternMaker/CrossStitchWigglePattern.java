package PatternMaker;

 class CrossStitchWigglePattern extends Pattern {
  public CrossStitchWigglePattern(double jamRate) {
   super(jamRate);
   jamRate = .05;
  }

  public void addCrossStitchWigglePattern() {
   for (int i = 0; i < 5; i++) {
    stitches.add(new SmallCrossStitch());
    stitches.add(new LargeCrossStitch());
   }
  }
//    pattern looks like this: xXxXxXxXxX
//    Needle jam rate: 5%

     //has-a
     //ArrayList<Stitch> stitches (inherited from Pattern)

     //behavior
     //pattern() (inherited from Pattern)
 }