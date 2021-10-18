package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Emanuel Padro
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//reworked the program (have taken this class before) made it more simple to just use one class

public class Solution41 {


    //This method will read input from the input file and add it to the names list
    public static void ReadFile(List<String> names) {
        try {
            //initializes scanner and input file reader
            File myfile = new File("exercise41_input.txt");
            Scanner Reader = new Scanner(myfile);
            //While loop that will go trought reader and add each line to list
            while (Reader.hasNextLine()){
                names.add(Reader.nextLine());
            }
            Reader.close();//close reader and catch statement
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }

    }

    //will write manipulated input to a output file
    public static void writeToFile(List<String> names) {
        try(FileWriter writer = new FileWriter ("exercise41_output.txt");) {
            java.util.Collections.sort(names);
                        writer.write("Total of " + names.size() + " names \n");//writes total number of names
            writer.write("----------------------------\n");
            //for loop will print to output file each set of names
            for(String name: names){
                writer.write(name + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //main will create the list shared trough class and send it to each method
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        ReadFile(names);
        writeToFile(names);

    }
}
