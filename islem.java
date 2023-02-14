package org.example;

public class islem {
    public static int carpiuc(int a){
        return a*3;
    }
    public static int eksibes (int a) {
        return a-5;
    }
    public static void main (String[] args) {
        System.out.println("Sonuc: "+ carpiuc(eksibes(10)));

    }
}
