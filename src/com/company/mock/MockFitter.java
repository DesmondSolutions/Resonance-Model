package com.company.mock;

import com.company.model.HarmonicOscillatorModel;
import com.company.model.HarmonicOscillatorParameters;


public final class MockFitter implements Fitter {

    //Mock fitter is going to use data read from file. Not implemented yet
    @Override
    public HarmonicOscillatorParameters fitToData(
            HarmonicOscillatorModel model, Data data) throws FitFailedException {
        double amplitude = 1.0e-9;
        double omega0 = 1000.0;
        double qFactor = 10.0;

        return new HarmonicOscillatorParameters(
                amplitude , omega0 , qFactor);
    }
}
