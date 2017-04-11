package com.zagadkiBartela;

import java.util.Scanner;

public class SzyfratorGimbomowy {
    public static void main(String[] args) {
        Scanner wpisanyTekstNormalnegoCzlowieka = new Scanner(System.in);
        String wyraz = wpisanyTekstNormalnegoCzlowieka.nextLine();
        int N = wyraz.length();
        int tablica[] = new int[N];

        for (int i = 0; i < N; i++) {
            if (wyraz.charAt(i) == 'i') {
                wyraz = wyraz.replace('i', '1');
            }
            if (wyraz.charAt(i) == 'e') {
                wyraz = wyraz.replace('e', '3');
            }
            if (wyraz.charAt(i) == 'a') {
                wyraz = wyraz.replace('a', '4');
            }
            if (wyraz.charAt(i) == 't') {
                wyraz = wyraz.replace('t', '7');
            }
        }
        System.out.println(wyraz);
    }
}