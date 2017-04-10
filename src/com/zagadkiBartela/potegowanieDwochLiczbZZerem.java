package com.zagadkiBartela;

import java.util.Scanner;

public class potegowanieDwochLiczbZZerem {
    public static void main(String[] args) {
        Scanner wpisanaLiczba = new Scanner(System.in);
        int pierwszaLiczba = wpisanaLiczba.nextInt();
        int drugaLiczba = wpisanaLiczba.nextInt();
        int wynik = pierwszaLiczba;

        if (drugaLiczba == 0) {
            System.out.println("Nie można mnożyć razy 0");
        }
        for (int i = 1; i < drugaLiczba; i++) {
            wynik = wynik * pierwszaLiczba;
        }
        if (drugaLiczba != 0) {
            System.out.println(wynik);
        }
    }
}

