package semicolon_fun;

import java.util.ArrayList;
import java.util.Objects;

public class UniqueNumber {
    /*Given an array, find the first integer, which is unique in the array. Unique means the number
does not repeat and appears only once in the whole array.*/

    public static int unique(int[] array) {
        int unique = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] != array[j]) {
                    unique = array[i];
                } else {
                    continue;
                }
            }
        }
        return Integer.MIN_VALUE;
    }
    private static boolean isUnique(int a, int b) {
        return a != b;
    }

    public static void main(String[] args) {
        int[] array = {9, 2, 3, 2, 6, 6};
        int unique = unique(array);
        System.out.println(unique);
    }
}
