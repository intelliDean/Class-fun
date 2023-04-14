package semicolon_fun;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(rotate(array)));
    }

    public static int[] rotate(int[] array) {
        int first = array.length;
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = first;
        return array;
    }
}
