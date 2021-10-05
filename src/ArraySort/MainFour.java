package ArraySort;

import java.util.Arrays;

public class MainFour {
    public static void main(String[] args) {
        int[] arrays =  {1,10,20};
        int[] arrays2 = {1,5,10,20,30,40};
        int[] sortedArray = sort(arrays, arrays2);
        System.out.println(Arrays.toString(sortedArray));
    }
    public static int[] sort(int[] arrays, int[] arrays2){
        int[] array;
        int[] array2;
        int k = 0;
        int j = 0;
        int[] item = new int[arrays.length + arrays2.length];
        if(arrays.length < arrays2.length){
            array = arrays;
            array2 = arrays2;
        }
        else {
            array = arrays2;
            array2 = arrays;
        }
        for(int i = 0; i < item.length; i++) {
            if(k < array.length){
                if(j<array2.length){
                    if (array[k] <= array2[j]){
                        item[i] = array[k];
                        k++;
                    }
                    else {
                        item[i] = array2[j];
                        j++;
                    }
                }
                else {
                    item[i] = array[k];
                    k++;
                }
            }
            else{
                item[i] = array2[j];
                j++;
            }
        }
        return item;
    }
}
   /* public static void sort(int[] arrays, int[] arrays2){
        int[] array;
        int[] array2;
        int k = 0;
        int j = 0;
        if(arrays.length <= arrays2.length){
            array = arrays2;
            array2 = arrays;
        }
        else {
            array = arrays;
            array2 = arrays2;
        }
        int[] item = new int[arrays.length + arrays2.length];
        int limit = Math.min(arrays.length, arrays2.length);
        for(int i = 0; i < item.length; i++){
            if(k<limit){
                if(array[k] != array2[j]){
                    if(array[k]<array2[j]){
                        item[i] = array[k];
                        k++;
                    }
                    else{
                        item[i] = array2[j];
                        j++;
                    }
                }
                else {
                    item[i] = array[k];
                    i++;
                    k++;
                    item[i] = array2[j];
                    j++;
                }
            }
            else {
                item[i] = array2[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(item));
    }*/
   /* public static int[] sort(int[] arrays, int[] arrays2){
       int[] array;
       int[] array2;
       int k = 0;
       int j = 0;
       int[] item = new int[arrays.length + arrays2.length];
       if(arrays.length < arrays2.length){
           array = arrays;
           array2 = arrays2;
       }
       else {
           array = arrays2;
           array2 = arrays;
       }
       for(int i = 0; i < item.length; i++) {

           if(k < array.length){
               if (array[k] <= array2[j]){
                   item[i] = array[k];
                   k++;
               }
               else {
                   item[i] = array2[j];
                   j++;
               }
           }
           else{
               item[i] = array2[j];
               j++;
           }
           System.out.println(Arrays.toString(item));
       }
       return item;
   }
*/
