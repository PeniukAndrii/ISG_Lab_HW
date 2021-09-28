package HW2.ArraySort;

import java.util.Arrays;

public class MainFour {
    public static void main(String[] args) {
        int[] arrays = new int[6];
        int[] arrays2 = new int[6];

        arrays[0] = 1;
        arrays[1] = 3;
        arrays[2] = 5;
        arrays[3] = 7;
        arrays[4] = 9;
        arrays[5] = 12;

        arrays2[0] = 2;
        arrays2[1] = 3;
        arrays2[2] = 3;
        arrays2[3] = 7;
        arrays2[4] = 8;
        arrays2[5] = 9;



        sort(arrays, arrays2); // 2 Arrays sort...

    }

    public static void sort(int[] array, int[] array2){
        int[] twoArray = Arrays.copyOf(array, array.length + array2.length);
        System.arraycopy(array2, 0, twoArray, array.length, array2.length);
        Arrays.sort(twoArray);
        System.out.println(Arrays.toString(twoArray));
    }

}

