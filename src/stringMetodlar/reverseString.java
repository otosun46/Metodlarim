/*
Author:Otosun
Tarih :04/07/2020
*/
package stringMetodlar;

public class reverseString {
    /**
     * Parametre olarak girilen sitringi harf harf tersine cevirerek dondurur.
     * @param str
     * @return
     */
    public static String reverseString(String str) {
        String strTers="";
        String[]  dizi = str.split("");
        for (int i = dizi.length - 1; i >= 0; i--) {
            strTers += dizi[i];
        }
        return strTers;
    }
}
