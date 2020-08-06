package com.nicollefavero.madlibs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MadlibsApp {

    public static void main(String[] args) {

        final String BLANKS_OPEN = " >>> ";

        Scanner initialScanner = new Scanner(System.in);
        System.out.println("\nInsira o nome do arquivo que contém a história para o Madlibs!");
        System.out.println(BLANKS_OPEN);
        String storyFileName = initialScanner.nextLine().trim();

        if(!storyFileName.endsWith(".txt")){
            storyFileName = storyFileName + ".txt";
        }

        //começar a ler a história e preencher as lacunas
        try(
                FileReader reader = new FileReader(storyFileName);
                BufferedReader fileToRead = new BufferedReader(reader))
        {

            String line = fileToRead.readLine();
            List<String> filledWords = new ArrayList<>();
            StringBuilder entireStory = new StringBuilder();
            Scanner scanner = new Scanner(System.in);

            System.out.println("\n");

            while(line != null) {
                //divide a linha pelo caractere "\"
                String[] storyPhrase = line.split("\\\\");
                boolean phraseWithoutInput = true;

                for (String part : storyPhrase) {
                    //comparar com o regex pra ver se é um número
                    if (part.matches("[0-9]+")) {
                        int part_i = Integer.parseInt(part);

                        try {
                            //caso de palavra repetida, palavra já adicionada ao array
                            String repeatedWord = filledWords.get(part_i - 1);
                            entireStory.append(repeatedWord);
                            System.out.print(" " + repeatedWord + " ");

                        } catch (IndexOutOfBoundsException e) {
                            //caso de nova palavra, caso de lacuna
                            System.out.print(BLANKS_OPEN);
                            String userInput = scanner.nextLine().toUpperCase().trim();
                            filledWords.add(userInput);
                            entireStory.append(userInput);
                            phraseWithoutInput = false;
                        }
                    } else if(part.matches("\\.")){
                        entireStory.append(part);

                    } else {
                        entireStory.append(part);
                        System.out.print(part.trim());
                    }
                }

                if(phraseWithoutInput){
                    System.out.print("\n");
                }

                entireStory.append("\n");
                line = fileToRead.readLine();
            }

            System.out.print("\n\nSTORY:\n" + entireStory);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
