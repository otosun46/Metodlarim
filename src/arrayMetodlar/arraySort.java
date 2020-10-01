/*
Author:Otosun
Tarih :04/07/2020
*/
package arrayMetodlar;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraySort {

    public static void main(String[] args) {
        int[] a={15,5,21,3,6};
        System.out.println(Arrays.toString(intArraySort(a)));
    }

    /**
     * Parametre olarak girilen int dizisini siralayarak dondurur.
     * @param arr
     * @return
     */
    public static int[] intArraySort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
}
