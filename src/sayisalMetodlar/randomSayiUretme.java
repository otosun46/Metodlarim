/*
Author:Otosun
Tarih :04/07/2020
*/
package sayisalMetodlar;

public class randomSayiUretme {
    public static void main(String[] args) {
        System.out.println(randomNum(12, 24));
    }

    /**
     * Parametre olarak girilen max degerine kadar rastgele sayi dondurur.
     * @param max
     * @return
     */
    public static int randomNum(int max) {
        int value = 0;
        value = (int) (Math.random() * max + 1);
        return value;
    }

    /**
     * Parametre olarak girilen min ve max degerleri arasinda rastgele sayi dondurur
     * @param min
     * @param max
     * @return
     */
    public static int randomNum(int min, int max) {
        int value = 0;
        value = (int) (Math.random() * (max - min) + min + 1);
        return value;
    }
}
