package exercises.chapter2;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String aliceInWonderlandExcerpt = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: once or twice she had " +
                "peeped into the book her sister was reading, but it had no pictures or " +
                "conversations in it, 'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";

        System.out.println("Enter a word or phrase to search within the except from 'Alice in Wonderland'. Will return either 'true' or 'false'");
        String excerptSearch = input.next();

        input.close();

        //excerptSearch = excerptSearch.toLowerCase();

        boolean excerptSearchIsFound = aliceInWonderlandExcerpt.toLowerCase().contains(excerptSearch.toLowerCase());
        int excerptSearchIndex = aliceInWonderlandExcerpt.toLowerCase().indexOf(excerptSearch.toLowerCase());
        int excerptSearchLength = excerptSearch.length();
        String newAliceInWonderlandExcerpt = aliceInWonderlandExcerpt.toLowerCase().replace(excerptSearch.toLowerCase(), "");

        System.out.println("Excerpt Found: " + excerptSearchIsFound);
        System.out.println("Excerpt Index: " + excerptSearchIndex);
        System.out.println("Excerpt Length: " + excerptSearchLength);
        System.out.print("The new excerpt is: " + newAliceInWonderlandExcerpt);
    }
}
