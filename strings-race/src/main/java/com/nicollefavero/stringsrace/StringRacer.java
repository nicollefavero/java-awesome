package com.nicollefavero.stringsrace;

public class StringRacer extends Racer{

    private String finalString = "";

    @Override
    public long concatenator() {
        long tStart = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            finalString = finalString + "a";
        }

        long tEnd = System.currentTimeMillis();
        return tEnd - tStart;
    }


}
