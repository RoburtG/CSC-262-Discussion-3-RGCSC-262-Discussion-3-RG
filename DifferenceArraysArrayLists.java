/**
Using the same code for the Array and ArrayList codes.
Demonstrates the difference in approach while executing the same task.
Last section showing an example of what an ArrayList can do, which an Array cannot.
*/

import java.util.ArrayList;

public class DifferenceArraysArrayLists
{
public static void main(String[] args)
    {
        /**
         Reads elements from an array and prints the largest and the smallest.
         */
        int[] inputs = {300, 600, 435, 60348, 85430, 212, 2}; // All elements are declared here. Note: cannot add more elements after this line.
        int largest = inputs[0]; // Establish the first element as the largest.
        int smallest = inputs[0]; // Establish the first element as the smallest.

        for (int a = 0; a < inputs.length; a++) // Goes through each element to locate the largest and smallest elements until the end of the array.
        {
            if (inputs[a] > largest)
            {
                largest = inputs[a];
            }

            if (inputs[a] < smallest)
            {
                smallest = inputs[a];
            }
        }

        System.out.println(); // Adding spaces for cleaner output.
        System.out.println("Using an Array:\n" + "The largest number is " + largest); // Demonstrating the code works.
        System.out.println("The smallest number is " + smallest); // Demonstrating the code works.
        System.out.println(); // Adding spaces for cleaner output.

        /**
         Reads elements from an ArrayList and prints the largest and the smallest.
         */
        ArrayList<Integer> inputList = new ArrayList<>(); // Declare and initialize the ArrayList, but nothing is in there yet. 
        inputList.add(300); // Add every value into the ArrayList. Instead of adding during the declaration, you have to use .add function.
        inputList.add(600); // Could add more values after the code as well, which is below.
        inputList.add(435);
        inputList.add(60348);
        inputList.add(85430);
        inputList.add(212);
        inputList.add(2);

        int largestList = inputList.get(0); // Initialize largest value with zero, using the .get.
        int smallestList = inputList.get(0); // Initialize largest value with zero, using the .get.
        int counter = 0;
        for (int a = 0; a < inputList.size(); a++) // Instead of .length, you use .size.
        {
            if (inputList.get(a) > largestList) // Instead of using "[]", you use .get to grab the value from the ArrayList while the loop executes.
            {
                largestList = inputList.get(a);
            }

            if (inputList.get(a) < smallestList)
            {
                smallestList = inputList.get(a);
            }
            counter++;
        }
        System.out.println("Using an ArrayList:\n" + "The largest number is " + largestList); // Demonstrating the code works.
        System.out.println("The smallest number is " + smallestList); // Demonstrating the code works.
        System.out.println(); // Adding spaces for cleaner output.

        inputList.add(22593); // Adding two more values to the ArrayList to demonstate the ability to add after declaration.
        inputList.add(1000000);

        System.out.println("Here is an example of being able to add more values to the ArrayList after declaration: ");

        int c = 1;

        for (int b = 0; b < inputList.size(); b++) // Printing every value within the ArrayList to show what lives in there.
        {
            if (b < counter)
            {
                System.out.println(c + ". " + inputList.get(b));
                c++;
            }
            else
            {
                System.out.println(c + ". " + inputList.get(b) + " (Added after declaration)"); // Printing the last values added after declaration.
                c++;
            }
        }
        System.out.println(); // Adding spaces for cleaner output.
    }
}