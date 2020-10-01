/*
Author:Otosun
Tarih :04/07/2020
*/
package sayisalMetodlar;

public class sayiReverce {

    public static void main(String[] args) {
        System.out.println(palindromeNum(149));
    }

    /**
     * Parametre olarak girilen bir sayinin tersi ie toplaminin kacinci adimda palindrom bir sayi olacagini dondurur.
     * Bu metodun icinde reverceNum metodu cagrilmaktadir.
     * @param num
     * @return
     */
    public static int palindromeNum(int num) {
        int sayac = 1;
        while (num != reverceNum(num)) {
            num = num + reverceNum(num);
            sayac++;
            System.out.println(num);
        }
        return sayac;
    }

    /**
     * Parametre olarak girilen sayiyinin tersini dondurur.
     * @param number
     * @return
     */
    public static int reverceNum(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }


}
