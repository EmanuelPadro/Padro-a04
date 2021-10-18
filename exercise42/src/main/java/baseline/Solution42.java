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

public class Solution42 {
    //Function that will read input file, take data in it as input an distribute it
    public static void readFile(List<String> lastName, List<String> firstName, List<Integer> salary) {
        try {
            //set up input file reader and scanner
            File myfile = new File("exercise42_input.txt");
            Scanner reader = new Scanner(myfile);

            //while loop that acts as reader that reads input from input file and distributes it to its appropriate lists
            while (reader.hasNextLine()){
                // take input as string and split it
                String lineString = (reader.nextLine());
                String[] lineSplit = lineString.split(",");
                //adds the correct split of array into the categories of table
                int i = 0;
                lastName.add(lineSplit[i]);
                firstName.add(lineSplit[i+1]);
                salary.add(Integer.parseInt(lineSplit[i+2]));
            }
            reader.close();
        }//catch
        catch (FileNotFoundException e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }

    //Function that writes output to file in table format
    public static void writeToFile(List<String> lastName, List<String> firstName, List<Integer> salary) {
        try(FileWriter writer = new FileWriter ("exercise42_output.txt");) {
                        //Writers will use format to display data in a table format using %s
            writer.write(String.format("%10s %10s %10s \r\n", "Last","First","Salary"));
            writer.write("--------------------------------\n");
            for(int i = 0; i < lastName.size(); i++){
                writer.write(String.format("%10s %10s %10s \r\n",lastName.get(i),firstName.get(i),salary.get(i)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //main will declare lists to pass onto the read and write functions
    public static void main(String[] args) {
        List<String> lastName = new ArrayList<>();
        List<String> firstName = new ArrayList<>();
        List<Integer> salary = new ArrayList<>();
        readFile(lastName,firstName,salary);
        writeToFile(lastName,firstName,salary);

    }
}
