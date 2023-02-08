package org.example;

import java.util.Scanner;

public class kaldigecti {
    public static void main(String[] args)
    {

        int Not1;
        int Not2;
        int Not3;
        int Ort;
        System.out.println("Sinav Notlarinizi Giriniz:");
        Scanner scanner = new Scanner(System.in);

        Not1 = scanner.nextInt();
        Not2 = scanner.nextInt();
        Not3 = scanner.nextInt();
        Ort = (Not1+Not2+Not3)/3;
        System.out.println(Ort);

        if (Ort<50)
        {
            System.out.println("KALDI");
        }
        else
        {
            System.out.println("GEÇTİ");
        }
    }
}
