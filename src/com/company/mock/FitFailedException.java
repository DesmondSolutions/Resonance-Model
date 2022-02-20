package com.company.mock;

/*Custom Exception class for handling mismatch between the data and
the model parameters*/
public class FitFailedException extends Exception{

    public FitFailedException(String message) {
        super(message);
    }
}
