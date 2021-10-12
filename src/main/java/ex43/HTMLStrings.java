package ex43;

public class HTMLStrings {
    String line1 = "<!DOCTYPE html>";
    String line2 = "<html>";
    String line3 = "<head>";
    String line4 = "<meta something>";
    String line5 = "<title>Document</title>";
    String line6 = "</html>";

    public void changeLine4(String meta) {
        this.line4 = "<meta name=\"" + meta + "\">";
    }

    public void changeLine5(String title) {
        this.line5 = "<title>" + title + "</title>";
    }

    public void printHTML() {
        System.out.println(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n" + line6);
    }
}
