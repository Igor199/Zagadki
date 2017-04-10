package com.zagadkiBartela;

import java.util.Arrays;
import java.util.Scanner;

public class Sortowanie {
    public static void main(String[] args) {
        Scanner wpisanaLiczba = new Scanner(System.in);
        int N = wpisanaLiczba.nextInt();
        int tablica[] = new int[N];
        int tymczasowyKubek = 0;

        for (int i = 0; i < N; i++) {
            tablica[i] = wpisanaLiczba.nextInt();
        }
        for (int j = 0; j < N; j++) {
            for (int i = 1; i < N; i++) {
                System.out.println(Arrays.toString(tablica));
                if (tablica[i - 1] > tablica[i]) {
                    tymczasowyKubek = tablica[i];
                    tablica[i] = tablica[i - 1];
                    tablica[i - 1] = tymczasowyKubek;
                }
            }
        }

    }
}