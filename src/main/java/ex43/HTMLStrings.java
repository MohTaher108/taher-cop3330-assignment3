package ex43;

// Class that holds all the strings needed to make a html file, and some methods to print/customize it
public class HTMLStrings {
    // All the html lines
    String line1 = "<!DOCTYPE html>";
    String line2 = "<html lang = \"en\">";
    String line3 = "<head>";
    String line4 = "<meta something>";
    String line5 = "<title>Document</title>";
    String line6 = "</head>";
    String line7 = "<body>";
    String line8 = "</body>";
    String line9 = "</html>";

    // Put in the author name
    public void changeLine4(String meta) {
        this.line4 = "\t<meta author=\"" + meta + "\">";
    }

    // Put in the website name
    public void changeLine5(String title) {
        this.line5 = "\t<title>" + title + "</title>";
    }

    // Print everything into a text document
    public void printHTML() {
        System.out.println(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n" + line6
                + "\n" + line7 + "\n" + line8 + "\n" + line9);
    }
}
