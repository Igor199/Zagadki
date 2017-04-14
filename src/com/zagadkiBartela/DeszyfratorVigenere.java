package com.zagadkiBartela;

import java.util.Scanner;

public class DeszyfratorVigenere {
    public static void main(String[] args) {
        Scanner wpisanaLiczba = new Scanner(System.in);
        String liczby = wpisanaLiczba.nextLine();
        String kluczDeszyfrujacy = wpisanaLiczba.nextLine();

        char literyZliczb = 0;
        int liczbaSzyfrujaca = 0;
        int wynikLiczbowy = 0;
        int zaszyfrowaneLiczby = 0;
        char wynikTesktowy = 0;

        for (int i = 0; i < liczby.length(); i++) {
            zaszyfrowaneLiczby = liczby.charAt(i);
            liczbaSzyfrujaca = kluczDeszyfrujacy.charAt(i % kluczDeszyfrujacy.length());
            zaszyfrowaneLiczby -= 48;
            liczbaSzyfrujaca -= 96;
            wynikLiczbowy = (zaszyfrowaneLiczby - liczbaSzyfrujaca)%26;
            wynikTesktowy= (char)wynikLiczbowy;
            wynikTesktowy += 96;

            /*System.out.println("zaszyfrowaneLiczby: " + zaszyfrowaneLiczby);
            System.out.println("liczbaSzyfrujaca: " + liczbaSzyfrujaca);
            System.out.println("wynikLiczbowy: " + wynikLiczbowy);*/
            System.out.println("wynikTesktowy: " + wynikTesktowy);
        }
    }
}

