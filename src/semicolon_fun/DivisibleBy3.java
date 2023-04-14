package semicolon_fun;

/*Write an application that calculates the sum of those integers between 1 and 30 that are
divisible by 3.*/

public class DivisibleBy3 {
    public static int sumOfNumbers() {
        int total = 0;
        for (int i = 1; i < 30; i++) {
            if (i % 3 == 0) {
                total += i;
            }
        }
        return total;
    }
}
