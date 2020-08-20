package com.nicollefavero.whereswally;

import com.nicollefavero.whereswally.exceptions.EmptyDirectoryException;
import com.nicollefavero.whereswally.exceptions.EmptyFileException;

import java.io.*;

public class SearchWally {

    private static final File WALLY_PATH = new File("/home/ilegra-237/Documentos/java-beginner/wheres_wally/where-wally-is-suppose-to-be/");

    public static void main(String[] args) {

        try{
            File[] files = listFilesForFolder(WALLY_PATH);

            for(File file : files){
                 try{
                     String whereIsWally = readFile(file.getName());

                     if(whereIsWally.equalsIgnoreCase("Wally is here!")){
                         System.out.println("Wally is here! Wally was found in file >>> " + file.getName() + " <<<");
                     }
                 } catch (EmptyFileException e) {
                     System.out.println(e.getMessage());
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
            }

        } catch (EmptyDirectoryException e) {
            System.out.println(e.getMessage());
        }
    }

    public static File[] listFilesForFolder(final File folder) throws EmptyDirectoryException {
        if(folder.listFiles() != null){
            return folder.listFiles();
        } else {
            throw new EmptyDirectoryException();
        }

    }


    public static String readFile(String fileName) throws EmptyFileException, IOException {

        try(FileReader fileReader = new FileReader("/home/ilegra-237/Documentos/java-beginner/wheres_wally/where-wally-is-suppose-to-be/" + fileName)){
            BufferedReader fileBuff = new BufferedReader(fileReader);

            String line = fileBuff.readLine();
            if (line.isEmpty()){
                throw new EmptyFileException();
            } else {
                return line;
            }
        } catch (IOException e) {
            throw e;
        }
    }
}
