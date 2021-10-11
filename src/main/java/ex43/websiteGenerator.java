package ex43;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class websiteGenerator {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.print("Site name: ");
        String siteName = in.nextLine();
        System.out.print("Author: ");
        String author = in.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        char javaConfirm = in.nextLine().charAt(0);
        System.out.print("Do you want a folder for JavaScript? ");
        char CSSConfirm = in.nextLine().charAt(0);

        String path = "C:\\Users\\Hamod\\IdeaProjects\\taher-cop3330-assignment3\\src\\main\\java\\ex43\\";
        path = path + "website\\" + siteName;
        System.out.println(path);
        File folder = new File(path);

        /*
        File folder = new File(path);
        boolean check = folder.mkdir();
        if(check) System.out.println("Success!");
        else System.out.println("Failure :(");
        */

        in.close();
    }
}
