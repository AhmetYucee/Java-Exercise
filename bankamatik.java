package org.example;

import com.sun.xml.internal.ws.resources.UtilMessages;

import java.util.Scanner;

public class bankamatik {
    public static void main(String[] args ) {
        int Kasa= 2000;
        Scanner scan = new Scanner(System.in);
        int islem,parola,miktar ;
        System.out.println("Sifrenizi Giriniz");
        parola = scan.nextInt();
        if (parola==6060) {
            System.out.println("Hosgeldin Ahmet");
            System.out.println("Kasanız: "+ Kasa);
        }else {
            System.out.println("Sifre Hatalı");
        }
        while (Kasa>0) {
            System.out.println("1-Para Yatır");
            System.out.println("2-Para Çek");
            System.out.println("3-Para Gönder");
            System.out.println("4-Borc Öde");
            System.out.println("İslem Seciniz :");
            islem = scan.nextInt();

            if(islem==1) {
                System.out.println("Yatırılacak Miktarı Giriniz");
                miktar = scan.nextInt();
                Kasa = Kasa + miktar;
                System.out.println("Yeni Kasa: "+ Kasa);
            } else if (islem==2) {
                System.out.println("Çekilecek Miktarı Giriniz");
                miktar = scan.nextInt();
                Kasa = Kasa - miktar;
                System.out.println("Yeni Kasa: "+ Kasa);
            } else if (islem==3) {
                System.out.println("Gönderilecek Tutarı Giriniz");
                miktar = scan.nextInt();
                Kasa = Kasa - miktar;
                System.out.println("Yeni Kasa: "+ Kasa);
            } else {
                System.out.println("Ödenecek Borç Tutarını Giriniz");
                miktar = scan.nextInt();
                Kasa = Kasa - miktar;
                System.out.println("Yeni Kasa: "+ Kasa);

            }
        }

    }
}

