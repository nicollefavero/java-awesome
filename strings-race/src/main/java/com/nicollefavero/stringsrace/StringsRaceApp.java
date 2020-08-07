package com.nicollefavero.stringsrace;

public class StringsRaceApp {

    public static void main(String[] args) {


        String finalString = "";
        long tStart = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            finalString += "a";
        }

        long tEnd = System.currentTimeMillis();
        long tFinal = tEnd - tStart;

        System.out.println("");

    }
}
