/*
Author:Otosun
Tarih :04/07/2020
*/
package stringMetodlar;

import java.util.Arrays;
import java.util.Scanner;

public class stringGirisiIntArrayeDonusturme {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(stringSayiGiripIntDiziAlma()));
    }

    /**
     * Klavyeden bir string sayi dizisi girilmesini ister girilen diziyi int diziye cevirerek dondurur.
     * @return
     */
    public static int[] stringSayiGiripIntDiziAlma() {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir int dizi giriniz (4 6 8 gibi): ");
        String sayilar = oku.nextLine();
        String sayiArr[] = sayilar.split(" ");
        int[] sayiIntArr = new int[sayiArr.length];
        for (int i = 0; i < sayiIntArr.length; i++) {
            sayiIntArr[i] = Integer.parseInt(sayiArr[i]);
        }
        return sayiIntArr;
    }
}
