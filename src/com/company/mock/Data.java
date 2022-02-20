/* The Data class provides a method called 'readDataFromFile'. The goal of this method
as the name implies is to read data from a text file 'dataFile.txt' and save the values
in a List which is then returned. The Data class will be required by the Fitter
to access the List values by calling the readDataFromFile method and using these values
to create a HarmonicOscillatorParameters object.

* */


package com.company.mock;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data {

    public List<Double> readDataFromFile() throws FileNotFoundException {
        Scanner reader = new Scanner(new File("dataFile.txt"));
        List<Double> data = new ArrayList<>();  //list to store the data read from file.
        //check if there is more data to be read. If true, add the data to arrayList
        while(reader.hasNext()){
            if(reader.hasNextDouble()){
                data.add(reader.nextDouble());
            }
        }
        reader.close();
        return data;
    }

}
