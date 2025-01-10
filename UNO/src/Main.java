import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //NAME: Katerina Praskurnin
        //How many players?
//        System.out.println("Welcome to UNO! How many people want to play?");
//     int players = sc.nextInt();
//     register names for players - IN PROGRESS ( issue - need 4 separate variables )
//        for (int player = 1; player <= players; player++) {
//            //register names for players
//            System.out.println("What is player " + player + "'s name?");
//            String name = sc.nextLine();
//        }

        //establish a changing variable for the card at the top of the deck
        String topCard = "";
        //establish states
        boolean special = false;
        boolean wild = false;
        boolean red = false;
        boolean yellow = false;
        boolean blue = false;
        boolean green = false;
        boolean draw = false;
        boolean skip = false;
        boolean wildDraw4 = false;
        //might not need these
        //initialize array 1-100
        String card = "";
        ArrayList<String> deck = new ArrayList<String>();
        for ( int i = 0; i<100; i++){
            int shuffler = (int)(Math.random() * (100 - 1 + 1) + 1);
            if (shuffler<24) {
                special = true;
                card += "S";
                shuffler = (int) (Math.random() * (8 - 1 + 1) + 1);
                if (shuffler < 4) {
                    wild = true;
                    card += "W";
                } else {
                    wildDraw4 = true;
                    card += "D";
                }
            }
            else {


            }
            }
            deck.add("");

        }

        //pick from array.size
        //clear the picked one
        //if picked one is greater than 24, boolean special = false
        // ig less than 24, special = true
        // array out of 8, pick random, if

        sc.close();
    }
}