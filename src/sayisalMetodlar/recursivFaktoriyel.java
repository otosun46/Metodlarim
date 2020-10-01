/*
Author:Otosun
Tarih :04/07/2020
*/
package sayisalMetodlar;

public class recursivFaktoriyel {
    /**
     * Parametre olarak girilen degerin faktoriyelini dondurur.
     * Recursive bir metodtur.
     * @param sayi
     * @return
     */
    public static int faktoriyel(int sayi){
        if(sayi!=0){
            return sayi*faktoriyel(sayi-1);
        }
        else return 1;
    }
}
