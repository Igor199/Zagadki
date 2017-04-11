package com.zagadkiBartela;

import java.util.Scanner;

public class Gimbomowa {
    public static void main(String[] args) {
        Scanner wpisanyTekstNormalnegoCzlowieka = new Scanner(System.in);
        String wyraz = wpisanyTekstNormalnegoCzlowieka.nextLine();
        int N = wyraz.length();
        int tablica[] = new int[N];
        String nowyWyraz = "";


        for (int i = 0; i < N; i++) {
            if (wyraz.charAt(i) == 'i') {
                nowyWyraz = nowyWyraz + '1';
            } else if (wyraz.charAt(i) == 'e') {
                nowyWyraz = nowyWyraz + '3';
            } else if (wyraz.charAt(i) == 'a') {
                nowyWyraz = nowyWyraz + '4';
            } else if (wyraz.charAt(i) == 't') {
                nowyWyraz = nowyWyraz + '7';
            } else {
                nowyWyraz = nowyWyraz + wyraz.charAt(i);
            }
        }
        System.out.println(nowyWyraz);
    }
}
