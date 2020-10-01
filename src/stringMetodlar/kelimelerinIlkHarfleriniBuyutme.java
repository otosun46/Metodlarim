/*
Author:Otosun
Tarih :04/07/2020
*/
package stringMetodlar;


public class kelimelerinIlkHarfleriniBuyutme {

    public static void main(String[] args) {
        System.out.println(camelcase("bU GUN hava naSil OlacAK"));
    }

    /**
     * Parametre olarak girilen stringdeki kelimelerin bas harflerini buyuk diger harflerini kucuk yaparak dondurur.
     *
     * @param str
     * @return
     */
    public static String camelcase(String str) {
        String sonuc = "";
        String[] arrCumle = str.split(" ");

        for (int i = 0; i < arrCumle.length; i++) {
            arrCumle[i] = arrCumle[i].substring(0, 1).toUpperCase() + arrCumle[i].substring(1).toLowerCase();
            if (i == arrCumle.length - 1)
                sonuc += arrCumle[i];
            else
                sonuc += arrCumle[i] + " ";
        }
        return sonuc;
    }
}
