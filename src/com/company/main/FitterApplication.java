package com.company.main;


import com.company.mock.Data;
import com.company.mock.FitFailedException;
import com.company.mock.Fitter;
import com.company.mock.MockFitter;
import com.company.model.HarmonicOscillatorModel;

/*
* This is the main method for the MockFitter in Task 4.
* The goal here is just to display the output from the mockFitter
* class - HarmonicOscillatorParameters Object
*/
public class FitterApplication {

    public static void main(String[] args) throws FitFailedException {
        HarmonicOscillatorModel model = new HarmonicOscillatorModel();
        Data data = new Data();
        Fitter fitter = new MockFitter();
        System.out.println(fitter.fitToData(model, data));

    }
}
