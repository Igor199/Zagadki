package com.zagadkiBartela;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner wpisanaLiczba = new Scanner(System.in);
        int okreslonaLiczba = wpisanaLiczba.nextInt();
        int pierwszaLiczba = 0;
        int drugaLiczba = 1;
        int wynik = 1;

        for (int i = 0; i < okreslonaLiczba; i++) {
            System.out.print(wynik + " ");
            wynik = pierwszaLiczba + drugaLiczba;
            pierwszaLiczba = drugaLiczba;
            drugaLiczba = wynik;
        }
    }

}
