package org.example;

import java.util.Scanner;

public class hesapm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, islem;
        System.out.println("Bir Sayi Giriniz");
        sayi1 = input.nextInt();
        System.out.println("İkinci Sayiyi Giriniz");
        sayi2 = input.nextInt();
        System.out.println("Hangi İslemi Yapmak İstiyorsunuz");
        System.out.println("1-Toplama \n2-Çıkarma\n3-Çarpma\n4-Bölme\n ");

        System.out.println("İslem Seçiniz");
        islem = input.nextInt();
        if (islem == 1) {
            System.out.println("Toplama: " + (sayi1 + sayi2));
        } else if (islem == 2) {
            System.out.println("Çıkarma: " + (sayi1 - sayi2));
        } else if (islem == 3) {
            System.out.println("Çarpma: " + (sayi1 * sayi2));
        } else if (islem == 4) {
            if (sayi2 == 0) {
                System.out.println("Sayi2 Sıfıra Eşit Olamaz");
            } else {
                System.out.println("Bölme: " + (sayi1 / sayi2));
            }
        }
    }
}