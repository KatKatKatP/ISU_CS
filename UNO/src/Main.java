import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //NAME: Katerina Praskurnin

        System.out.println("Welcome to UNO! Would you like two-player(answer with \"1\") or against an AI(answer with \"2\")?");
        String player1name = "";
        String player2name = "";
        int gameMode = sc.nextInt();

        if (gameMode == 1) {
            boolean twoPlayer = true;
            sc.nextLine();
            System.out.println("What is player one's name?");
            player1name = sc.nextLine();
            System.out.println("What is player two's name?");
            player2name = sc.nextLine();
        } else if (gameMode == 2) {
            boolean againstAI = true;
            sc.nextLine();
            System.out.println("What is your name?");
            player1name = sc.nextLine();
            player2name = "Computer";
        }

        ArrayList<String> deck = new ArrayList<String>();
        ArrayList<String> discard = new ArrayList<String>();
        String card;
        for (int i = 1; i <= 100; i++) {
            card = "";
            if (i <= 24) {
                if (i <= 4) {
                    card += "WD4";
                } else if (i <= 8) {
                    card += "W";
                } else {
                    switch (i) {
                        case 9:
                        case 10:
                            card += "RD";
                            break;
                        case 11:
                        case 12:
                            card += "RS";
                            break;
                        case 13:
                        case 14:
                            card += "YD";
                            break;
                        case 15:
                        case 16:
                            card += "YS";
                            break;
                        case 17:
                        case 18:
                            card += "BD";
                            break;
                        case 19:
                        case 20:
                            card += "BS";
                            break;
                        case 21:
                        case 22:
                            card += "GD";
                            break;
                        case 23:
                        case 24:
                            card += "GS";
                            break;
                        default:
                            break;
                    }
                }
            } else {
                if (i < 44) {
                    card += "R";
                    switch (i) {
                        case 25:
                            card += "0";
                            break;
                        case 26:
                        case 27:
                            card += "1";
                            break;
                        case 28:
                        case 29:
                            card += "2";
                            break;
                        case 30:
                        case 31:
                            card += "3";
                            break;
                        case 32:
                        case 33:
                            card += "4";
                            break;
                        case 34:
                        case 35:
                            card += "5";
                            break;
                        case 36:
                        case 37:
                            card += "6";
                            break;
                        case 38:
                        case 39:
                            card += "7";
                            break;
                        case 40:
                        case 41:
                            card += "8";
                            break;
                        case 42:
                        case 43:
                            card += "9";
                            break;
                        default:
                            break;
                    }
                } else if (i < 63) {
                    card += "G";
                    switch (i) {
                        case 44:
                            card += "0";
                            break;
                        case 45:
                        case 46:
                            card += "1";
                            break;
                        case 47:
                        case 48:
                            card += "2";
                            break;
                        case 49:
                        case 50:
                            card += "3";
                            break;
                        case 51:
                        case 52:
                            card += "4";
                            break;
                        case 53:
                        case 54:
                            card += "5";
                            break;
                        case 55:
                        case 56:
                            card += "6";
                            break;
                        case 57:
                        case 58:
                            card += "7";
                            break;
                        case 59:
                        case 60:
                            card += "8";
                            break;
                        case 61:
                        case 62:
                            card += "9";
                            break;
                        default:
                            break;
                    }
                } else if (i < 82) {
                    card += "Y";
                    switch (i) {
                        case 63:
                            card += "0";
                            break;
                        case 64:
                        case 65:
                            card += "1";
                            break;
                        case 66:
                        case 67:
                            card += "2";
                            break;
                        case 68:
                        case 69:
                            card += "3";
                            break;
                        case 70:
                        case 71:
                            card += "4";
                            break;
                        case 72:
                        case 73:
                            card += "5";
                            break;
                        case 74:
                        case 75:
                            card += "6";
                            break;
                        case 76:
                        case 77:
                            card += "7";
                            break;
                        case 78:
                        case 79:
                            card += "8";
                            break;
                        case 80:
                        case 81:
                            card += "9";
                            break;
                        default:
                            break;
                    }
                } else {
                    card += "B";
                    switch (i) {
                        case 82:
                            card += "0";
                            break;
                        case 83:
                        case 84:
                            card += "1";
                            break;
                        case 85:
                        case 86:
                            card += "2";
                            break;
                        case 87:
                        case 88:
                            card += "3";
                            break;
                        case 89:
                        case 90:
                            card += "4";
                            break;
                        case 91:
                        case 92:
                            card += "5";
                            break;
                        case 93:
                        case 94:
                            card += "6";
                            break;
                        case 95:
                        case 96:
                            card += "7";
                            break;
                        case 97:
                        case 98:
                            card += "8";
                            break;
                        case 99:
                        case 100:
                            card += "9";
                            break;
                        default:
                            break;
                    }
                }
            }
            deck.add(card);

        }
        System.out.println("Here is the un-shuffled deck:");
        System.out.println(deck);
        Collections.shuffle(deck);
        System.out.println("Here is the shuffled deck:");
        System.out.println(deck);

        int index = 0;
        String topCardDiscard;
        ArrayList<String> player1hand = new ArrayList<String>();
        ArrayList<String> player2hand = new ArrayList<String>();
        for (int dealCard = 0; dealCard < 7; dealCard++) {
            topCardDiscard = deck.get(index);
            player1hand.add(topCardDiscard);
            deck.remove(index);
        }
        for (int dealCard = 0; dealCard < 7; dealCard++) {
            topCardDiscard = deck.get(index);
            player2hand.add(topCardDiscard);
            deck.remove(index);
        }

        topCardDiscard = deck.get(0);
        while (topCardDiscard.contains("W") || topCardDiscard.contains("S") || topCardDiscard.contains("D")) {
            deck.add(deck.get(0));
            deck.remove(0);
            topCardDiscard = deck.get(0);
        }
        String topCardDeck = deck.get(1);
        System.out.println("Here is the starting card:" + topCardDiscard);
        ArrayList<String> playedDeck = new ArrayList<String>();
        deck.remove(0);
        playedDeck.add(topCardDiscard);

        boolean player1turn = true;
        int numPlay = 0;
        int num = 0;
        while(player1turn){
            System.out.println(player1name + "'s turn! Here is your hand:" + player1hand);
            System.out.println("What card would you like to play? Or type \"draw\" to draw a card.");
            String playCard = sc.nextLine();
            boolean turn = false;
            boolean special = false;
            while (player1hand.contains(playCard) && !turn) {

                //check for if the two are not special
                if (playCard.length() == 2 && (playCard.contains("R") || playCard.contains("B") || playCard.contains("Y") || playCard.contains("G")) && !(playCard.contains("D") || playCard.contains("S"))){
                    numPlay = playCard.charAt(1);
                    special = false;
                }
                else if(topCardDiscard.length() == 2 && (topCardDiscard.contains("R") || topCardDiscard.contains("B") || topCardDiscard.contains("Y") || topCardDiscard.contains("G")) && !(topCardDiscard.contains("D") || topCardDiscard.contains("S"))){
                    num = topCardDiscard.charAt(1);
                    special = false;
                }
                else{
                    special = true;

                }
                // while (!special){
                //if colours and numbers are the same, or for draw/skip if colours are the same, or for wild if no other option left
                //same colour, num doesn't matter( put this in the non-special if/else?
                if (playCard.contains("R") && topCardDiscard.contains("R") && !((playCard.contains("D") || playCard.contains("S")))) {
                    playedDeck.add(playCard);
                    player1hand.remove(playCard);
                    turn = true;
                }
                if (playCard.contains("Y") && topCardDiscard.contains("Y") && !((playCard.contains("D") || playCard.contains("S")))) {
                    playedDeck.add(playCard);
                    player1hand.remove(playCard);
                    turn = true;
                }
                if (playCard.contains("B") && topCardDiscard.contains("B") && !((playCard.contains("D") || playCard.contains("S")))) {
                    playedDeck.add(playCard);
                    player1hand.remove(playCard);
                    turn = true;
                }
                if (playCard.contains("G") && topCardDiscard.contains("G") && !((playCard.contains("D") || playCard.contains("S")))) {
                    playedDeck.add(playCard);
                    player1hand.remove(playCard);
                    turn = true;
                }
                //same number, colour doesn't matter
                if(num == numPlay){

                }
            }
            //not sending me to the else statement
            {
                if (playCard.equals("draw")){
                    deck.remove(topCardDeck);
                    player1hand.add(topCardDeck);
                    player1turn = false;
                }
                System.out.println("That card is not playable. Would you like to try again (type \"play\"), or draw a new card(type \"draw\" ?)");
                String choice = sc.nextLine();
                if (choice.equals("play")){
                    player1turn = false;
                    player1turn = true;
                }
               else if(choice.equals("draw")){
                   deck.remove(topCardDeck);
                   player1hand.add(topCardDeck);
                }

            }
        }
        sc.close();
    }
}
