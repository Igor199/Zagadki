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

        for (int j = 0; j < pierwszaLiczba.length(); j++){
            liczbaSzyfrujaca = drugaLiczba.charAt(j%2);
            liczbaSzyfrujaca -= 96;
            //System.out.println(liczbaSzyfrujaca);
            wynik = (liczba + liczbaSzyfrujaca)%26;
            System.out.print(wynik + " ");
        }
    }
}
