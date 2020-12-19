package com.nicollefavero.main;

import com.nicollefavero.main.exceptions.EmptyDirectoryException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FolderReader {

    public static void main(String[] args) {

        System.out.println("Insert complete directory path: ");

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        final File PATH = new File(path);

        try {
            List<String> mp3Files = listMp3FilesInFolder(PATH);

            System.out.println(mp3Files.toString());

        } catch (EmptyDirectoryException e) {
            e.printStackTrace();
        }
    }

    public static List<String> listMp3FilesInFolder(final File directoryPath) throws EmptyDirectoryException {
        List<String> mp3Files = new ArrayList<>();

        if (directoryPath.listFiles() != null) {
            for (File file : directoryPath.listFiles()) {
                String fileName = file.getName();

                if(fileName.matches("[A-Za-z-0-9\\-\\040]+\\.mp3")){
                    fileName = fileName.replace(".mp3", "");
                    mp3Files.add(fileName);
                }
            }
            return mp3Files;

        } else {
            throw new EmptyDirectoryException(directoryPath.getPath());
        }
    }
}
