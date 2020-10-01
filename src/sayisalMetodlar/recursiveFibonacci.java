/*
Author:Otosun
Tarih :04/07/2020
*/
package sayisalMetodlar;

public class recursiveFibonacci {
    /**
     * Parametre olarak girilen degere kadar olan fibonacci serisini bulur.
     * Recursive bir metodtur.
     * @param sayi
     * @return
     */

    public static int fibonacci(int sayi){
        if (sayi==0) return 0;
        if (sayi==1) return 1;
        if (sayi>1) return fibonacci(sayi-1)+fibonacci(sayi-2);
        else return 0;
    }
}
