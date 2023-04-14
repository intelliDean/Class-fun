package semicolon_fun;

public class Venture {
    /*Write a program using loop to print the letters of the word "VENTURES" with two letters in
one line.*/

    public static void main(String[] args) {
        String word = "VENTURES";
        twoInALine(word);
    }

    public static void twoInALine(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
            if (i % 2 == 1) {
                System.out.println();
            }
        }
    }
}
