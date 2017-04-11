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

        for (int i = 0; i < pierwszaLiczba.length(); i++){
            liczbaSzyfrujaca = drugaLiczba.charAt(i);
            liczbaSzyfrujaca -= 96;
            //System.out.println("szyfrator to: " + liczbaSzyfrujaca);
            for (int j = 0; j < pierwszaLiczba.length(); j++){
                litera = pierwszaLiczba.charAt(j);
                liczba = litera;
                liczba -= 97;
                liczba = (liczba + liczbaSzyfrujaca)%26;

                System.out.print(" " + liczba);
            }
        }
    }
}
