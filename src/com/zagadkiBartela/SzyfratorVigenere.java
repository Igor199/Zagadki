package com.zagadkiBartela;

import java.util.Scanner;

public class SzyfratorVigenere {
    public static void main(String[] args) {
        Scanner wpisanaLiczba = new Scanner(System.in);
        String pierwszaLiczba = wpisanaLiczba.nextLine();
        String drugaLiczba = wpisanaLiczba.nextLine();
        int N = pierwszaLiczba.length();
        char litera = 0;
        int liczba = 0;
        int liczbaSzyfrujaca = 0;
        liczba = litera;
        int wynik = 0;

        for (int i = 0; i < pierwszaLiczba.length(); i++) {
            liczba = pierwszaLiczba.charAt(i);
            liczbaSzyfrujaca = drugaLiczba.charAt(i % drugaLiczba.length());
            liczba -= 96;
            System.out.println("liczba" + liczba);
            liczbaSzyfrujaca -= 96;
            System.out.println("liczbaSzyfrujaca" + liczbaSzyfrujaca);
            wynik = (liczba + liczbaSzyfrujaca) % 26;



            System.out.println(wynik + " ");
        }
    }
}
