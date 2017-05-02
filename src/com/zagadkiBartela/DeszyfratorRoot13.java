package com.zagadkiBartela;

import java.util.Scanner;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;

public class DeszyfratorRoot13 {
    public String deszyfrator(String WpisanyCiagZnakow){
        //System.out.println(- 11%26);
        Scanner wpisanyCiagZnakow = new Scanner(System.in);
        int N = wpisanyCiagZnakow.nextInt();
        int tablica[] = new int[N];
        char cyfra = 0;
        int cyfry = 0;
        String wynik = " ";

        for (int i = 0; i < N; i++) {
            tablica[i] = wpisanyCiagZnakow.nextInt();
            cyfry = tablica[i] - 1;
            cyfry = (cyfry + 13) % 26;
            cyfry += 97;
            cyfra = (char) cyfry;
            wynik = wynik + cyfra + "  ";
        }
        return wynik;
    }
}



