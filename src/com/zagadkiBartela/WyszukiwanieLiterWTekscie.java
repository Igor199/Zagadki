package com.zagadkiBartela;

import java.util.Scanner;

import static java.lang.System.in;

public class WyszukiwanieLiterWTekscie {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(in);
        String calyTeks = skaner.nextLine();
        String drugiWpisanyTekst = skaner.nextLine();
        char pierwszaLitera = drugiWpisanyTekst.charAt(0);
        int wynik = 0;
        boolean zmienna = true;

        for (int i = 0; i < calyTeks.length(); i++) {
            if (pierwszaLitera == calyTeks.charAt(i)) {
                for (int j = 0; j < drugiWpisanyTekst.length(); j++) {
                    if (drugiWpisanyTekst.charAt(j) != calyTeks.charAt(i + j)) {
                        zmienna = false;
                    }
                }
                if (zmienna == true) {
                    System.out.println(i);
                }
            }
            zmienna = true;
        }

    }
}

