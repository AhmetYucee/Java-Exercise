package org.example;

import java.util.Scanner;

public class notortalamasi {
    public static void main (String[] args ) {
        int quiz, vize, final1;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.println("Quiz Notunu Giriniz");
        quiz = input.nextInt();
        System.out.println("Vize Notunu Giriniz");
        vize = input.nextInt();
        System.out.println("Final Notunu Giriniz");
        final1= input.nextInt();

        ortalama= (quiz*0.15)+(vize*0.35)+(final1*0.50);
        System.out.println("Not Ortalaması: "+ ortalama);
        String Durum = (ortalama<50) ? "Kaldı" : "Geçti";
        System.out.println(Durum);


} }
