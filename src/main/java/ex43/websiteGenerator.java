package ex43;

import java.io.File;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class websiteGenerator {
    public static void createHTMLFile(String path, String author, String siteName) throws Exception {
        HTMLStrings HTMLFileContents = new HTMLStrings();

        PrintStream htmlFile = new PrintStream(path + "\\index.html");
        PrintStream console = System.out;
        System.setOut(htmlFile);
        HTMLFileContents.changeLine4(author);
        HTMLFileContents.changeLine5(siteName);
        HTMLFileContents.printHTML();
        System.setOut(console);
        System.out.println("Created ./website/" + siteName + "/index.html");
    }

    public static void createJavaFile(char javaConfirm, String path, String siteName) throws Exception {
        if(javaConfirm == 'y' || javaConfirm == 'Y') {
            Files.createDirectories(Paths.get(path + "\\js\\"));
            System.out.println("Created ./website/" + siteName + "/js/");
        }
    }

    public static void createCSSFile(char CSSConfirm, String path, String siteName) throws Exception {
        if(CSSConfirm == 'y' || CSSConfirm == 'Y') {
            Files.createDirectories(Paths.get(path + "\\css\\"));
            System.out.println("Created ./website/" + siteName + "/css/");
        }
    }


    public static void main( String[] args ) throws Exception {
        // Open scanner
        Scanner in = new Scanner(System.in);

        // Read user input for the site's name, author's name, and whether they want java and css folders
        System.out.print("Site name: ");
        String siteName = in.nextLine();
        System.out.print("Author: ");
        String author = in.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        char javaConfirm = in.nextLine().charAt(0);
        System.out.print("Do you want a folder for JavaScript? ");
        char CSSConfirm = in.nextLine().charAt(0);

        // Close scanner
        in.close();

        // Create path to folder
        String path = new File("C:\\Users\\Hamod\\IdeaProjects\\taher-cop3330-assignment3").getAbsolutePath();
        path = path + "\\src\\main\\java\\ex43\\website\\" + siteName;

        // Create folder
        Files.createDirectories(Paths.get(path));
        System.out.println("Created ./website/" + siteName);

        // Create a html file
        createHTMLFile(path, author, siteName);

        // Create js and css folders if necessary
        createJavaFile(javaConfirm, path, siteName);
        createCSSFile(CSSConfirm, path, siteName);
    }
}
