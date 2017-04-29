package com.zagadkiBartela;
import java.util.Scanner;

public class WywolywanieRoot13 {
    public static void main(String[] args) {
        Scanner wpisanyCiagZnakow = new Scanner(System.in);
        String szyfrowanyWyraz = wpisanyCiagZnakow.nextLine();
        MetodaRoot13 szyfrowanie = new MetodaRoot13();

        String zaszyfr = szyfrowanie.szyfrator(szyfrowanyWyraz);

        System.out.println(zaszyfr);
    }
}


