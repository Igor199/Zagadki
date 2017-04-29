package com.zagadkiBartela;

import java.util.Scanner;

public class SzyfratorVigenere {
    public static void main(String[] args) {
        Scanner wpisanaLiczba = new Scanner(System.in);
        String pierwszaLiczba = wpisanaLiczba.nextLine();
        String drugaLiczba = wpisanaLiczba.nextLine();
        char litera = 0;
        int liczba = 0;
        int liczbaSzyfrujaca = 0;
        liczba = litera;
        int wynik = 0;
        char wynikTesktowy = 0;

        for (int i = 0; i < pierwszaLiczba.length(); i++) {
            liczba = pierwszaLiczba.charAt(i);
            liczbaSzyfrujaca = drugaLiczba.charAt(i % drugaLiczba.length());
            liczba -= 96;
            liczbaSzyfrujaca -= 96;
            wynik = (liczba + liczbaSzyfrujaca) % 26;
            wynikTesktowy = (char)wynik;
            wynikTesktowy += 96;
            System.out.println(wynikTesktowy + " ");
        }
    }
}
