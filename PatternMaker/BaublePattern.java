package PatternMaker;

public class BaublePattern extends Pattern {
    public BaublePattern(double jamRate) {
        super(jamRate);
        jamRate = .00;
    }
//BaublePattern looks like this: --o--o--o--o--o

    public void addBaublePattern() {
        for (int l = 0; l < 5; l++) {
            for (int i = 0; i <= 1; i++) {
                stitches.add(new ShortLineStitch());
            }

            for (int j = 0; j <= 0; j++) {
                stitches.add(new CircleStitch());

            }
        }
    }
}

