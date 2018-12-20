package PatternMaker;

public class BlockyBaublePattern extends Pattern {

    public BlockyBaublePattern(double jamRate) {
        super(jamRate);
        jamRate = .10;
    }
//BlockyBaublePattern looks like this: []--o--[]--o--[]--o--

    public void addBlockyBaublePattern() {

        for (int l = 0; l < 3; l++) {
            stitches.add(new BlockStitch());
            for (int i = 0; i <= 1; i++) {
                stitches.add(new ShortLineStitch());
            }

            for (int j = 0; j <= 0; j++) {

                stitches.add(new CircleStitch());
                for (int i = 0; i <= 1; i++) {
                    stitches.add(new ShortLineStitch());

                }
            }
        }
    }
}
