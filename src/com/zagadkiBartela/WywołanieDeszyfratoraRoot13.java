package com.zagadkiBartela;

import java.util.Scanner;

public class WywołanieDeszyfratoraRoot13 {
    public static void main(String[] args) {
        Scanner wpisanyWyraz = new Scanner(System.in);
        String szyfrowanyWyraz = wpisanyWyraz.nextLine();

        DeszyfratorRoot13 szyfrowanie = new DeszyfratorRoot13();
        String szyfr = szyfrowanie.deszyfrator(szyfrowanyWyraz);
        System.out.println(szyfr);

    }
}

