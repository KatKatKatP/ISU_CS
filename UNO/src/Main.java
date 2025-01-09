import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //NAME: Katerina Praskurnin
        //How many players?
        System.out.println("Welcome to UNO! How many people want to play?");
        int players = sc.nextInt();
        //register names for players - IN PROGRESS ( issue - need 4 separate variables )
        for (int player = 1; player <= players; player++) {
            //register names for players
            System.out.println("What is player " + player + "'s name?");
            String name = sc.nextLine();
        }

        //establish a changing variable for the card at the top of the deck
        //
        sc.close();
    }
}