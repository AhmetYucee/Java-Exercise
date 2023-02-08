package org.example;

import java.util.Scanner;

public class ikisayi {
    Scanner input = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz.");

    int sayiBirinci = input.nextInt();

        System.out.println("ikinci sayıyı giriniz.");

    int sayiIkinci = input.nextInt();

    int toplam = 0;

        for (int i = sayiBirinci + 1; i < sayiIkinci; i++) {

        if (i % 2 == 0) {

            toplam = toplam + i;

        }

    }

        System.out.println("İki sayı arasındaki çift sayıların toplamı : " + toplam);

}
