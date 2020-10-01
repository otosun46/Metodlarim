/*
Author:Otosun
Tarih :04/07/2020
*/
package sayisalMetodlar;

public class recursiveSayilariToplama {
    /**
     * Parametre olarak girilen degere kadar olan pozitif tam sayilarin toplamini dondurur.
     * Recursive bir metodtur.
     * @param s
     * @return
     */

    public static int toplama(int s){

        if (s>0){
            return s+toplama(s-1);
        }
        else return 0;
    }
}
