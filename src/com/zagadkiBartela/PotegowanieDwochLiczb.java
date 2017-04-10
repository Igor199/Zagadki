package com.zagadkiBartela;

import java.util.Scanner;

public class PotegowanieDwochLiczb {
    public static void main(String[] args) {
        Scanner wpisanaLiczba = new Scanner(System.in);
        int pierwszaLiczba = wpisanaLiczba.nextInt();
        int drugaLiczba = wpisanaLiczba.nextInt();
        int wynik = pierwszaLiczba;
        //int liczbaPowtorzen = drugaLiczba;

            for (int i = 1; i < drugaLiczba; i++) {
                //System.out.println(" to jest pierwsza liczba  " + pierwszaLiczba + " druga liczba: " + drugaLiczba);
                //System.out.println(pierwszaLiczba * drugaLiczba);

                wynik  =  wynik * pierwszaLiczba;
                System.out.println(wynik);

                //System.out.println(" to jest pierwsza liczba  " + pierwszaLiczba + " druga liczba: " + drugaLiczba + "  wynik to:  " + wynik);

            //wynik = pierwszaLiczba * drugaLiczba;

            //System.out.println(nowyWynik);
        }
    }
}