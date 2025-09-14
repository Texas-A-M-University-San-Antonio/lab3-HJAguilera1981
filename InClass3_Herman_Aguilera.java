/**
 * Name: [Herman Aguilera]
 * Date: [10 Sep 2025]
* Purpose: InClass 3 - 
* [Write a description about this InClass 3 program]
 */

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner; //Import the Scanner class
// Inside main method;
Scanner input = new Scanner(system.in); // Declare a Scanner object

public static class InClass3_Herman_Aguilera
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(Sytem.in);
        // In-Class 3 Example:
        // Step 1: Prompt the user to enter the length of the side of a cube.
        System.ou.print("Enter the length of the side of the cube: ");
        // Step 2: Read the user's input and store it in a variable.
        double side = inpit.nextDouble();
        // Step 3: Use an appropriate method to determine the volume of the cube.
        double volume = Math.power(side, 3);
        // Step 4: Use an appropriate method to determine the surface area of the cube.
        double surfaceArea = 6 * Math.pow(side, 3);
        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("The volume of the cube is: " + volume);
        System.out.println("The surface area of the cube is: " + surfaceArea);

        input.close(); // Close the scanner to prevent resource leaks
    }
}