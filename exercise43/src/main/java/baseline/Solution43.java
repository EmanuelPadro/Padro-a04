package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution43 {
    //This equation tests continuously to see if the user put in y or n and is called by input collector
    public static boolean yesOrno(){
        boolean result;
        Scanner input = new Scanner(System.in);
        do {
            String choice = input.next();
            if (choice.equals("y")) {
                result = true;
                break;
            } else if (choice.equals("n")) {
                result = false;
                break;
            } else {
                System.out.println("Wrong Input please enter y or n !");
            }
        } while (true);

        return result;

    }
    //Function collecting input and storing it in website class
    static Website collectInput()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Site name:");
        String websiteName = input.next();
        System.out.println("Author: ");
        String websiteAuthor = input.next();

        System.out.println("Do you want a folder for JavaScript?");
        //Calls equation to see if user put y or n
        boolean javScripFolder = Solution43.yesOrno();
        System.out.println("Do you want a folder for CSS?");
        boolean cssFolder = Solution43.yesOrno();

        return new Website(websiteName,websiteAuthor,javScripFolder,cssFolder);

    }
    //creator that will create website and test for its successful creation
    public static void creator(Website websiteInfo){
        //creates folder using info on current directory
        File newFolder = new File(websiteInfo.currentPath);
        boolean websiteTest = newFolder.mkdir();

        if(websiteTest){
            System.out.println("Created ./website/"+ websiteInfo.name);
            htmlFile(websiteInfo);
            createCSSJava(websiteInfo);
        }else{
            System.out.println("Could not create website");
        }
    }
    //Will take care of creating the html_File
    public static void htmlFile(Website websiteInfo){
        File file = new File(websiteInfo.currentPath + "/index.html");

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write(websiteInfo.htmltext);
            System.out.println(websiteInfo.successMessage + websiteInfo.name + "/index.html");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //Depending on User input creates CSS and/or/neither Java folders
    public static void createCSSJava(Website websiteInfo){
        if(websiteInfo.javFol)
        {
            File newFolder = new File(websiteInfo.currentPath + "/js");
            boolean folderTest = newFolder.mkdir();

            if (folderTest) {
                System.out.println(websiteInfo.successMessage + websiteInfo.name + "/js");
            } else {
                System.out.println("Could not create folder");
            }
        }
        if(websiteInfo.cssFol)
        {
            File newFolder = new File(websiteInfo.currentPath + "/CSS");
            boolean folderTest = newFolder.mkdir();

            if (folderTest) {
                System.out.println("Created ./website/" + websiteInfo.name + "/CSS");
            } else {
                System.out.println("Could not create folder");
            }
        }
    }

    //main that will call functions and pass in The variables to fill with input and create files with
    public static void main(String[] args) {
        Website websiteInfo = collectInput();
        creator(websiteInfo);
    }
}
