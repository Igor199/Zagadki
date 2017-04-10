package com.zagadkiBartela;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        int wynik = liczba.nextInt();

        for (int i = wynik; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Wybuchło");
    }
}
