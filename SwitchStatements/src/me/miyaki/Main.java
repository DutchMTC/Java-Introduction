package me.miyaki;

public class Main {

    public static void main(String[] args) {

        // switch(){}
        // Runs through cases, executes code if case matches Katie.
        // Default is basically "else" in if-else statements.
        // Switch Statements can also be nested.

        String katie = "Katie";
        switch(katie){
            case "Larry":
                System.out.println("Matches Larry");
                break;
            case "Bob":
                System.out.println("Matches Bob");
                break;
            case "Jerry":
                System.out.println("Matches Jerry");
                break;
            default:
                System.out.println("Name is Katie");
        }

        int month = 12;
        String season = null;
        switch(month){
            case 1, 2, 3:
                season = "Winter";
                System.out.println("The season is " + season);
                break;
            case 4, 5, 6:
                season = "Spring";
                System.out.println("The season is " + season);
                break;
            case 7, 8, 9:
                season = "Summer";
                System.out.println("The season is " + season);
                break;
            case 10, 11, 12:
                season = "Autumn";
                System.out.println("The season is " + season);
                break;
            default:
                System.out.println("That month doesn't even exist smh");
        }

    }
}
