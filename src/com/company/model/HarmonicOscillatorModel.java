package com.company.model;

import java.io.*;

public class HarmonicOscillatorModel implements ResonanceModel{
    @Override
    //Calculates spectral power and returns the answer. Implementation of formula
    public double evaluateSpectralPowerAt(double frequency, HarmonicOscillatorParameters parameters) {
        double spectralPower, amplitudeSquared, omegaSquared, omega0Squared, qFactorSquared;

        amplitudeSquared = Math.pow(parameters.getAmplitude(), 2);
        omegaSquared = Math.pow(2 * Math.PI * frequency, 2) ;
        omega0Squared = Math.pow(parameters.getOmega0(), 2);
        qFactorSquared = Math.pow(parameters.getqFactor(), 2);

        spectralPower = amplitudeSquared / (Math.pow(omegaSquared - omega0Squared, 2)
                + ((omegaSquared * omega0Squared) /qFactorSquared));

        return spectralPower;
    }

    @Override
    public void writeDataToFile(double spectralPower, double frequency) {
        try{
            File file = new File("SpectralPowerFile.txt");
            if(!file.exists()){
                file.createNewFile();
            }
        BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));

        System.out.println("\nWriting results to 'SpectralPowerFile.txt' located in current directory....");
        //write the heading if file is empty before writing the values
        if(file.length() == 0){
            writer.write("Frequency          Spectral_Power");

        } //file is not empty. It already contains the heading. Go ahead and write the values
            writer.newLine();
            writer.write(frequency + "              " + spectralPower);

            System.out.println("\nDone writing.");

        writer.close();

    }catch (IOException e){
            e.printStackTrace();
        }
        }

}
