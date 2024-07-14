// Java QAP 4.4
// Joseph Flores
// July 14, 2024

// This reads a line of text and prints the sum of the integers in that line. 
// Irrespective of the number of spaces between them nor the number of integers in the line.
// For example, on input "33 Hello 4 World 6", the output should be 43.

import java.util.Scanner;

public class ParseInts
{
    public static void main(String[] args)
    {
        int val, sum=0;
        Scanner scan = new Scanner(System.in);
        String line;

        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());

        while (scanLine.hasNext())
        {		
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
                // Do nothing
            }
        }
        System.out.println("The sum of the integers on this line is " + sum);
    }
}
