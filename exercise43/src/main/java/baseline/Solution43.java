package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution43 {


    public static boolean yesOrno(){
        //This equation tests continuously to see if the user put in y or n
        // and is called by input collector
        //It will be used by other equations instead of duplicating code
        return false;
    }
    //Function collecting input and storing it in website class
    static Website collectInput()
    {
        //Will collect initial user input and construct website off it as it gathers it
        //will call equation to see if user put y or n


        return null;
    }

    public static void creator(Website websiteInfo){
        //creator that will create website and test for its successful creation
    }

    public static void htmlFile(Website websiteInfo){
        //Will take care of creating the html_File
    }
    //Depending on User input creates CSS and/or/neither Java folders
    public static void createCSSJava(Website websiteInfo){
         //Will prompt and create css if told to

    }

    //main that will call functions and pass in The variables to fill with input and create files with
    public static void main(String[] args) {
        Website websiteInfo = collectInput();
        creator(websiteInfo);
    }
}
