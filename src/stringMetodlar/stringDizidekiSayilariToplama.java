/*
Author:Otosun
Tarih :04/07/2020
*/
package stringMetodlar;

import java.util.ArrayList;

public class stringDizidekiSayilariToplama {
    /**
     * Parametre olarak girilen string ArrayList'teki sayisal degerlerin toplamini dondurur.
     * @param arrLst
     * @return
     */
    public static int getSum(ArrayList<String> arrLst){

        int toplam=0;        int[] arrInt=new int[arrLst.size()];

        for (int i=0;i<arrLst.size();i++){
            arrInt[i]= Integer.parseInt(arrLst.get(i).replaceAll("[^0-9-+]", ""));
            toplam+=arrInt[i];
        }
        return toplam;
    }
}
