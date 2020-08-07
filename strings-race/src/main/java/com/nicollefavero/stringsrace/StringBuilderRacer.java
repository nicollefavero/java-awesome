package com.nicollefavero.stringsrace;

public class StringBuilderRacer extends Racer{

    private StringBuilder stringBuilderFinal = new StringBuilder();

    @Override
    long concatenator() {
        long tStart = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            stringBuilderFinal.append("a");
        }

        long tEnd = System.currentTimeMillis();
        return tEnd - tStart;
    }
}
