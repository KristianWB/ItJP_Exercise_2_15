import java.util.Scanner;

public class Geometry_distanceOfTwoPoints {
    public static void main(String[] args)   {

        /* The task will be solved in three steps
        1) Prompt the user for x and y coordinates and declaring/assigning essential variables
        2) calculate results
        3) Display results
         */

        // 1) Prompting for coordinates and setting up variables
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Please enter x and y coordinate for the first point: \n" +
                "X coordinate: "
        );
        double x1 = input.nextDouble(); // Declaring and assigning first x number from user input
        System.out.print(
                "Y coordinate: "
        );
        double y1 = input.nextDouble(); // Declaring and assigning first Y number from user input

        System.out.print(
                "Please enter x and y values from the second point \n" +
                        "X coordinate: "
        );
        double x2 = input.nextDouble(); // Declaring and assigning second X value from user input

        System.out.print(
                "Y coordinate: "
        );
        double y2 = input.nextDouble(); // Declaring and assigning second y coordinate from user input

        // 2) Calculations
        double result = Math.sqrt((Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2));

        // 3) Printing out the results
        System.out.println(
                "The distance between the two coordinates are: " + result
        );
    }
}
