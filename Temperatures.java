public class Temperatures {


    public static void main(String[] args) {

        int[][] temps = new int[4][7];

        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;

        String times[] = {"7am", "3pm", "7pm", "3am"};
        String days[] = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

//the outer outer loop prints the day on top
        for (int column = 0; column < 7; column++) {
            System.out.print("\t" + days[column]);
        }
        System.out.print("\n");
//the outer loop prints the times
        for (int row = 0; row < 4; row++) {
            System.out.print(times[row] + ": ");
//the inner loop prints the contents of the array next to the times
            for (int column = 0; column < 7; column++) {
                System.out.print(temps[row][column] + "  ");

            }


            System.out.println();
        }
        System.out.println("");
        System.out.println("Based on that data, the following are the average temperatures for the week."+ "\n");


        //this is finding the average for the day


        for (int column = 0; column < temps[0].length; column++) {
            int sum = 0;
            for (int row = 0; row < temps.length; row++) {
                sum += temps[row][column];
            }
            float avg = (float) (sum / 4);
            System.out.println(days[column] + ": " + avg);

        }

        System.out.println("");
//this is finding the average for the time of day


        for (int row = 0; row < temps.length; row++) {
            int sum = 0;
            for (int column = 0; column < temps[0].length; column++) {
                sum += temps[row][column];
            }
            float avg = (float)(sum / 7);
            System.out.println(times[row] + ": " + avg);
        }


        System.out.println("\n" + "The final average temperature for the week was: ");
        int total = sum(temps);
        System.out.println(total/28);
        }
public static int sum(int [][] values)   {
        int total = 0;
        for (int i = 0; i < values.length; i++)  {
            for (int j = 0; j<values[0].length; j++) {
                total += values[i][j];
            }
            double average = (total / 28);
        }


        return total;
}


}






