package semicolon_fun;

public class ValueOfPi {
    /*Calculating the Value of π) Calculate the value of π from the infinite series
    * Print a table that shows the value of π approximated by computing the first 200,000 terms of this
    series. How many terms do you have to use before you first get a value that begins with
    3.14159?*/


    public static void main(String[] args) {
        pi();
    }
    public static void pi() {
        int up = 4;
        int down = 1;
        int result = 0;
        for (int i = 0; i < 200000; i++) {
            System.out.println(result + (up/down - up/(down+2)));
            down = down + 2;
        }
        //return result;
    }
}
