package day31_inheritance.browserTask;

public class TestBrowser {

    public static void main(String[] args) {

        Chrome c = new Chrome();
        c.openBrowser();
        c.closeBrowser();

        Browser b = c ;
        b.openBrowser();
        b.closeBrowser();

        Opera o = new Opera();
        o.openBrowser();
        o.closeBrowser();

    }
}
