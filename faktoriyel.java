package org.example;

import java.util.Scanner;

public class faktoriyel {public static void main(String[] args) {

    int sayi, faktoriyel=1;
    Scanner oku=new Scanner(System.in);
    System.out.print("Faktöriyeli alınacak sayıyı girin : ");
    sayi=oku.nextInt();
    for(int i=2; i<=sayi; i++){
        faktoriyel=i*faktoriyel;
    }
    System.out.println(sayi+" sayısının faktöriyeli = " + faktoriyel);

}

}
