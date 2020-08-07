package com.nicollefavero.stringsrace;

public class StringBufferRacer extends Racer{

    @Override
    long concatenator() {
        StringBuffer finalStringBuffer = new StringBuffer();

        long tStart = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            finalStringBuffer.append("a");
        }

        long tEnd = System.currentTimeMillis();
        return tEnd - tStart;
    }
}
