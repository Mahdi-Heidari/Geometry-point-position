package pointposition;

import java.util.Scanner;

public class PointPosition {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double x0, y0, x1, y1, x2, y2, result;

        System.out.println("Enter the points for P0, P1, and P2 with two coordiantes:\n");;

        System.out.print("P1 coordinates:\t");
        x0 = input.nextDouble();
        y0 = input.nextDouble();
        System.out.print("P2 coordinates:\t");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.print("P3 coordinates:\t");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        System.out.println("");

        if (result > 0) {

            System.out.printf("(%.2f, %.2f) is on the left side of the line from (%.2f, %.2f) to (%.2f, %.2f)", x2, y2, x0, y0, x1, y1);

        } else if (result < 0) {

            System.out.printf("(%.2f, %.2f) is on the right side of the line from (%.2f, %.2f) to (%.2f, %.2f)", x2, y2, x0, y0, x1, y1);

        } else {

            System.out.printf("(%.2f, %.2f) is on the line from (%.2f, %.2f) to (%.2f, %.2f)", x2, y2, x0, y0, x1, y1);

        }

        System.out.println("\n");

    }

}
