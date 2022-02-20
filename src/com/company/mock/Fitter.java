package com.company.mock;

import com.company.model.HarmonicOscillatorModel;
import com.company.model.HarmonicOscillatorParameters;

import java.io.FileNotFoundException;

public interface Fitter {
    /**
     * Fit the given model to given data
     * @return the parameters that best fit the data for the given model
     */
    HarmonicOscillatorParameters fitToData(
            HarmonicOscillatorModel model , Data data
    ) throws  FitFailedException;
}
