package com.nicollefavero.whereswally.exceptions;

public class EmptyFileException extends Exception{

    public EmptyFileException() {
        super("No signal of Wally here...");
    }
}
