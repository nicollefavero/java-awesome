package com.nicollefavero.whereswally.exceptions;

public class EmptyDirectoryException extends Exception {

    public EmptyDirectoryException() {
        super("Where Wally is suppose to be is EMPTY.");
    }
}
