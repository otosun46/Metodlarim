/*
Author:Otosun
Tarih :04/07/2020
*/
package sayisalMetodlar;

public class sayininBasamaklariToplami {
    /**
     * Parametre olarak girilen sayinin basamak degerlerinin toplamini dondurur.
     * @param sayi
     * @return
     */
    public static int basamaklarToplami(int sayi){
        int toplam= 0;
        do {
            toplam+=sayi%10;
            sayi=sayi/10;
        }
        while (sayi>0);
        return toplam;
    }
}
