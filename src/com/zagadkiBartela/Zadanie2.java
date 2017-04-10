package com.zagadkiBartela;

import java.util.Scanner;

import static java.lang.System.in;

public class Zadanie2 {

    public static void main(String[] args) {
        Scanner skaner = new Scanner(in);
        String calyTeks = skaner.nextLine();
        String jednaLitera = skaner.nextLine();
        char pierwszaLitera = jednaLitera.charAt(0);
        int wynik = 0;

        for (int i = 0; i < calyTeks.length(); i++) {
            if (pierwszaLitera == calyTeks.charAt(i)) {
                wynik = wynik + 1;
            }
        }
        System.out.println(wynik);
    }
}
