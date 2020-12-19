package com.nicollefavero.main.exceptions;

public class EmptyDirectoryException extends Exception {

    public EmptyDirectoryException(String directoryPath) {
        super("There are no mp3 files in the directory " + directoryPath);
    }
}
