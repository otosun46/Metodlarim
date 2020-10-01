/*
Author:Otosun
Tarih :09/07/2020
*/

import java.util.ArrayList;
import java.util.Scanner;

public class myMethods {

    /**
     * Klavyeden bir string sayi dizisi girilmesini ister girilen diziyi int diziye cevirerek dondurur.
     * @return
     */
    public static int[] stringSayiGiripIntDiziAlma() {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir int dizi giriniz (4 6 8 gibi): ");
        String sayilar = oku.nextLine();
        String sayiArr[] = sayilar.split(" ");
        int[] sayiIntArr = new int[sayiArr.length];
        for (int i = 0; i < sayiIntArr.length; i++) {
            sayiIntArr[i] = Integer.parseInt(sayiArr[i]);
        }
        return sayiIntArr;
    }
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

    /**
     * Parametre olarak girilen int dizisini siralayarak dondurur.
     * @param arr
     * @return
     */
    public static int[] intArraySort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
    /**
     * Parametre olarak girilen bir int dizisini tersine cevirir
     * @param list
     * @return
     */

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    /**
     * Kullanicinin bir veri girisi yapmasini saglar
     * @param ekranYazisi
     * @return
     */
    public static String kullanicidanVeriAl(String ekranYazisi) {
        Scanner oku = new Scanner(System.in);
        System.out.print(ekranYazisi + ": ");
        String str = oku.nextLine();
        return str;
    }

    /**
     * Kullanicinin girdigi stringi int sayiya cevirir
     * @param ekranYazisi
     * @return
     */
    public static int stringiSayiyaCevir(String ekranYazisi) {
        boolean kontrol = false;
        int value = 0;
        do {
            String str = kullanicidanVeriAl(ekranYazisi);
            try {
                value = Integer.parseInt(str);
                kontrol = false;
            } catch (Exception ex) {
                System.out.println("Hatali giris yaptiniz!");
                kontrol = true;
            }
        } while (kontrol);
        return value;
    }
}