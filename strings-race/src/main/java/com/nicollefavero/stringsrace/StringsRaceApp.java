package com.nicollefavero.stringsrace;

public class StringsRaceApp {

    public static void main(String[] args) throws InterruptedException {

        StringRacer stringRacer = new StringRacer();
        StringBuilderRacer stringBuilderRacer = new StringBuilderRacer();
        StringBufferRacer stringBufferRacer = new StringBufferRacer();

        long stringRacerTime = stringRacer.concatenator();
        long stringBuilderRacerTime = stringBuilderRacer.concatenator();
        long stringBufferRacerTime = stringBufferRacer.concatenator();

        System.out.println("Tempo de concatenação com String (+): " + stringRacerTime);
        System.out.println("Tempo de concatenação com String Builder: " + stringBuilderRacerTime);
        System.out.println("Tempo de concatenação com String Buffer: " + stringBufferRacerTime);

        System.out.println("\nAnd the winner is....");

        Thread.sleep(5000);

        if(stringBuilderRacerTime < stringRacerTime){
            if(stringBuilderRacerTime < stringBufferRacerTime){
                System.out.print("STRING BUILDER RACER!!");
            } else {
                System.out.println("STRING BUFFER RACER!!");
            }
        } else {
            System.out.println("STRING RACER WITH +++++!!");
        }
    }
}
