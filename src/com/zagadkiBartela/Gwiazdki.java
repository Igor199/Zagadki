package com.zagadkiBartela;

import java.util.Scanner;

public class Gwiazdki {

    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        int gwiazdki = liczba.nextInt();

        for (int i = 1; i <= gwiazdki; i++) {

            for (int iloscWynikow = 0; iloscWynikow < i; iloscWynikow++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
