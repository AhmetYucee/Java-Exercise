package org.example;

import java.util.Scanner;

public class tekcift {  public static void main(String[] args)
{
    int i;
    System.out.println("Sayiyi Giriniz:");
    Scanner scanner = new Scanner (System.in);

    i = scanner.nextInt();

    if (i%2 ==0)
    {
        System.out.println("Sayiniz çift sayidir.");
    }
    else
    {
        System.out.println("Sayiniz tek sayidir.");
    }
}
}
