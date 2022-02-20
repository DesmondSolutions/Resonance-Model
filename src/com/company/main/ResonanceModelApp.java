/*This application receives the model parameters and frequency from the command line
 * and calculates the spectral power. The spectral power obtained from the calculation
 * together with the corresponding frequency are written into a text file called
 * 'SpectralPowerFile.txt'. The program runs in an infinite loop which means the
 * user will continuously enter the values and the calculations will continuously
 * be made and appended to the file until the user decides to terminate.
 */

package com.company.main;

import com.company.model.HarmonicOscillatorModel;
import com.company.model.HarmonicOscillatorParameters;

import java.util.Scanner;

public class ResonanceModelApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Resonance Model application");

        while(true){
            System.out.println("\nPlease enter Frequency: ");
            double frequency = scanner.nextDouble();
            System.out.println("Enter amplitude (range A > 0): ");
            double amplitude = scanner.nextDouble();
            System.out.println("Enter omega0 (range w0 > 0): ");
            double omega0 = scanner.nextDouble();
            System.out.println("Enter qFactor (range 0 < q < 100): ");
            double qFactor = scanner.nextDouble();

            HarmonicOscillatorParameters parameters =
                    new HarmonicOscillatorParameters(amplitude, omega0, qFactor);

            HarmonicOscillatorModel model = new HarmonicOscillatorModel();

            double spectralPower = model.evaluateSpectralPowerAt(frequency, parameters);
            System.out.println("\nThe spectral power is " + spectralPower);

            //Writing the spectral power corresponding and frequency to a file called "SpectralPowerFile.txt"
            model.writeDataToFile(spectralPower, frequency);

            System.out.println("press c to continue or any any key to exit: ");
            String c = scanner.next();
            if(c.equalsIgnoreCase("c")){
                continue;
            }else{
                scanner.close();
                break;

            }


        }
    }
}
