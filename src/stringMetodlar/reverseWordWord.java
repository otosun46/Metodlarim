/*
Author:Otosun
Tarih :04/07/2020
*/
package stringMetodlar;


public class reverseWordWord {
    /**
     * Girilen bir stringdeki kelimelerin dizilisini sondan basa dogru yapar
     * @param str
     * @return
     */
    public static String reverseWord(String str) {
        String strTers="";
        String[] dizi = str.split(" ");
        for (int i = dizi.length - 1; i >= 0; i--) {
            if (i>0) {
                strTers += dizi[i] + " ";
            }
            else strTers += dizi[i];
        }
        return strTers;
    }
}
