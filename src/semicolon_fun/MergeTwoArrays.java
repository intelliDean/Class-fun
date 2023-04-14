package semicolon_fun;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 10};
        int[] array2 = {2, 3, 4, 6, 8, 13};

        System.out.println(Arrays.toString(merge(array1, array2)));

    }
    public static int[] merge(int[] array1, int[] array2) {
    int[] mergedArrays = new int[array1.length + array2.length];
    int i = 0, j = 0, k = 0;

    while (i < array1.length && j < array2.length) {
        if (array1[i] < array2[j]) {
            mergedArrays[k++] = array1[i++];
        } else {
            mergedArrays[k++] = array2[j++];
        }
    }

    while (i < array1.length) {
        mergedArrays[k++] = array1[i++];
    }

    while (j < array2.length) {
        mergedArrays[k++] = array2[j++];
    }

    return mergedArrays;
}
}
