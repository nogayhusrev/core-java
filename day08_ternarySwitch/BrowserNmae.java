package day08_ternarySwitch;

public class BrowserNmae {

    public static void main(String[] args) {

        String browserName="chrome";
        browserName=browserName.toLowerCase();

        switch (browserName){
            case "chrome":
                System.out.print("Your Browser is ");
                System.err.print("chrome");
                break;
            case "safari":
                System.out.print("Your Browser is ");
                System.err.print("safari");
                break;
            case "firefox":
                System.out.print("Your Browser is ");
                System.err.print("firefox");
                break;
            case "opera":
                System.out.print("Your Browser is opera");
                System.err.print("opera");
                break;
            case "edge":
                System.out.print("Your Browser is edge");
                System.err.print("edge");
                break;
            default:
                System.out.println("Invalid Browser");
                break;
        }

    }
}
/*
9. write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary


 */
