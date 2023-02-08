package org.example;

import java.util.Scanner;

public class tekciftsayii {    public static void main(String[] args)
{
    int sayi;
    System.out.println("Sayinizi Giriniz:");
    Scanner scanner = new Scanner (System.in);

    sayi = scanner.nextInt();

    if (sayi%2 ==0)
    {
        System.out.println("Çift sayidir.");
    }
    else
    {
        System.out.println("Tek sayidir.");
    }
}

}
