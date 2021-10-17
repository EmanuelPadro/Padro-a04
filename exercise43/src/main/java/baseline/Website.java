package baseline;

//class website to sore all website info and pass between functions
public class Website {
    //Attributes of website class*Q
    String Name;
    String Author;
    boolean JavFol;
    boolean CssFol;
    String currentPath;
    String htmltext;
    String SuccessMessage = "Created ./website/";

    Website(String WebsiteName,String WebsiteAuthor, boolean JavScrip_Folder, boolean CSS_Folder)
    {
        JavFol = JavScrip_Folder;
        CssFol = CSS_Folder;
        Name = WebsiteName;
        Author = WebsiteAuthor;
        currentPath = "src/main/java/baseline/" + WebsiteName;
        htmltext = "<title> " + WebsiteName + " </title>\n" +
                "<meta> " + WebsiteAuthor + " </meta>";
    }
}
