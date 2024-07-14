// Java QAP 4.3
// Joseph Flores
// July 14, 2024

import java.util.Scanner;

// This program will count the number of occurrences of each letter in a word.
// The program will prompt the user to enter a single word (letters only, please).
// If the user enters a non-letter character, the program will print a message indicating that the character is not a letter.

public class CountLetters
{
    public static void main(String[ ] args)
    {
        int[ ] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        //get word from user
        System.out.print("This will count the number of occurrences of each letter in a word.\n");
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine( );

        //convert to all upper case
        word = word.toUpperCase( );

        //count frequency of each letter in string
        for (int i=0; i < word.length( ); i++) {
            try {
                counts[word.charAt(i)-'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not a letter: " + word.charAt(i));
            }
        }

        //print frequencies
        System.out.println( );
        for (int i=0; i < counts.length; i++)
            if (counts [i] != 0)
                System.out.println((char)(i +'A') + ": " + counts[i]);

    }
}
