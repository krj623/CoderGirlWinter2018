package PatternMaker;

public class ZigZagLinesPattern extends Pattern {
    public ZigZagLinesPattern(double jamRate) {
        super(jamRate);
        jamRate = .00;
    }

    public void addZigZagLinesPattern() {
        for (int l = 0; l < 2; l++) {
            for (int i = 0; i <= 2; i++) {
                stitches.add(new ZigZagStitch());
            }

            for (int j = 0; j <= 2; j++) {
                stitches.add(new FillStitch());

            }
        }
    }
}
