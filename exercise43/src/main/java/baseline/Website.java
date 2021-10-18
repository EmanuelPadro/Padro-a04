package baseline;

//class website to sore all website info and pass between functions
public class Website {
    //Attributes of website class*Q
    String name;
    String author;
    boolean javFol;
    boolean cssFol;
    String currentPath;
    String htmltext;
    String successMessage = "Created ./website/";

    public Website(String websiteName, String websiteAuthor, boolean javScripFolder, boolean cssFolder)
    {
        javFol = javScripFolder;
        cssFol = cssFolder;
        name = websiteName;
        author = websiteAuthor;
        currentPath = "src/main/java/baseline/" + websiteName;
        htmltext = "<title> " + websiteName + " </title>\n" +
                "<meta> " + websiteAuthor + " </meta>";
    }

    public String returnPath(){
        return currentPath;
    }
}
