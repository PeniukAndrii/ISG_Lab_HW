package HW2.ArraySort;

import java.util.Arrays;

public class MainFour {
    public static void main(String[] args) {
        int[] arrays = {1,3,5,7,9,12};
        int[] arrays2 = {2,3,7,7,8,9,10,15,21,35};
        sort(arrays, arrays2);
    }
    public static void sort(int[] array, int[] array2){
        int[] item = new int[array.length + array2.length];
        int k = 0;
        int j = 0;
        for(int i = 0; i < item.length; i++){
             if(k<array.length){
                 if(array[k]<=array2[j]){
                     item[i] = array[k];
                     i++;
                     item[i] = array2[j];
                 }
                 else {
                     item[i] = array2[j];
                     i++;
                     item[i] = array[k];
                 }
                 k++;
             }
             else {
                 item[i] = array2[j];
             }
            j++;
        }
        System.out.println(Arrays.toString(item));
    }
}

