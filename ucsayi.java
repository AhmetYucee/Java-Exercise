package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ucsayi {public static void main(String[] args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a=0, b=0, c=0;
    System.out.println("Bir sayı giriniz");
    try {
        a = Integer.parseInt(br.readLine());
        System.out.println("Bir sayı giriniz");
        b = Integer.parseInt(br.readLine());
        System.out.println("Bir sayı giriniz");
        c = Integer.parseInt(br.readLine());

    } catch (NumberFormatException e) {
        System.out.println("Sayı Giriş Hatası");
    } catch (IOException e) {
        System.out.println("Okuma Hatası");
    }

    if (a > b && a > c)
    {
        System.out.println(a+" sayısı büyüktür.");
    }
    else if (b > a && b > c)
    {
        System.out.println(b+" sayısı büyüktür.");
    }
    else
    {
        System.out.println(c+" sayısı büyüktür.");
    }
}
}
