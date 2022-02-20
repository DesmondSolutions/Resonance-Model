package com.company.model;

public class HarmonicOscillatorParameters {
    private double amplitude;
    private double omega0;
    private double qFactor;

    public HarmonicOscillatorParameters(double amplitude, double omega0, double qFactor) {
        this.amplitude = amplitude;
        if(amplitude <= 0){
            throw new IllegalArgumentException("amplitude value must be greater than 0");
        }
        this.omega0 = omega0;
        if(omega0 <= 0){
            throw new IllegalArgumentException("Omega0 value must be greater than 0");
        }
        this.qFactor = qFactor;
        if(qFactor <= 0 || qFactor >= 100){
            throw new IllegalArgumentException("qFactor must be within the range 1 to 99 (0 < q < 100)");
        }
    }

    public double getAmplitude() {
        return amplitude;
    }

    public double getOmega0() {
        return omega0;
    }

    public double getqFactor() {
        return qFactor;
    }

    @Override
    public String toString() {
        return "HarmonicOscillatorParameters{" +
                "amplitude=" + amplitude +
                ", omega0=" + omega0 +
                ", qFactor=" + qFactor +
                '}';
    }
}
