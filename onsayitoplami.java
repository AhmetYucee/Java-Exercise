package org.example;

import java.util.Scanner;

public class onsayitoplami { public static void main(String[] args) {
    Scanner giris = new Scanner(System.in);

    int toplam = 0, sayi = 0;

    for (int i=0; i < 10; i++){

        System.out.print("Bir sayı giriniz: ");

        sayi = giris.nextInt();

        toplam = toplam + sayi;

    }

    System.out.println("Sayıların Toplamı: "+toplam);

}
}
