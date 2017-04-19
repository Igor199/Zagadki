package com.zagadkiBartela;
import java.util.Scanner;

public class MetodaRoot13 {
    //public static void main(String[] args) {
    public String szyfrator(String wyraz){
        int N = wyraz.length();
        char literka = 0;
        int liczba = 0;
        String zaszyfrowanyWyraz = "";

        for (int i = 0; i < N; i++) {
            literka = wyraz.charAt(i);
            liczba = literka;
            liczba -= 97;
            liczba = (liczba + 13) % 26;
            liczba += 1;
            //System.out.print(" " + liczba);
            zaszyfrowanyWyraz = zaszyfrowanyWyraz + liczba + " ";

        }
        return zaszyfrowanyWyraz;
    }
}
