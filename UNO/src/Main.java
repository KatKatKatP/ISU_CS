import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //NAME: Katerina Praskurnin

        //ask for gamemode and names
        System.out.println("Welcome to UNO! Would you like two-player(answer with \"1\") or against an AI(answer with \"2\")?");
        int gameMode = sc.nextInt();
        String player1name = "";
        String player2name = "";
        if (gameMode == 1) {
            sc.nextLine();
            boolean multiPlayer = true;
            System.out.println("What is player one's name?");
            player1name = sc.nextLine();
            System.out.println("What is player two's name?");
            player2name = sc.nextLine();
        } else if (gameMode == 2) {
            boolean againstAI = true;

        }
        ArrayList<String> deck = new ArrayList<String>();
        ArrayList<String> discard = new ArrayList<String>();
        String card;
        //intitialize deck
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

        String choice;
        Collections.shuffle(deck);

        int index = 0;
        String topCardDiscard;

        ArrayList<String> player1hand = new ArrayList<String>();
        ArrayList<String> player2hand = new ArrayList<String>();

        //deal cards to players

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
        //check if the top card is special or not. If special, skip it
        topCardDiscard = deck.get(0);
        while (topCardDiscard.contains("W") || topCardDiscard.contains("S") || topCardDiscard.contains("D")) {
            deck.add(deck.get(0));
            deck.remove(0);
            topCardDiscard = deck.get(0);
        }

        String topCardDeck = deck.get(1);

        ArrayList<String> playedDeck = new ArrayList<String>();
        deck.remove(0);
        playedDeck.add(topCardDiscard);

        //commence turn

        boolean player1turn = true;
        int numPlay = 0;
        int num = 0;
        boolean turnEnd = false;
        boolean special = false;
        while(player1turn){
            //play or draw a card as a first action
            System.out.println(player1name + "'s turn! Here is your hand: " + player1hand);
            System.out.println("The card on the top of the discard deck is: " + topCardDiscard);
            System.out.println("What card would you like to play? Or type \"draw\" to draw a card.");
            choice = sc.nextLine();
            String playCard = choice;
            String colour = "";
            boolean otherPlayableCards = false;
            while (player1hand.contains(playCard) && !turnEnd) {
                //special sensor, num play and num
                if (playCard.contains("D") || playCard.contains("S") || playCard.contains("W")) {
                    special = true;
                }
                else{
                    special = false;
                    numPlay = playCard.charAt(1);
                    num = topCardDiscard.charAt(1);
                }

                //non-special: same colour, number doesn't matter
                if (!special){
                    if (playCard.contains("R") && topCardDiscard.contains("R") && !((playCard.contains("D") || playCard.contains("S")))) {
                        playedDeck.add(playCard);
                        player1hand.remove(playCard);
                        turnEnd = true;
                        topCardDiscard = playCard;

                    }
                    else if (playCard.contains("Y") && topCardDiscard.contains("Y") && !((playCard.contains("D") || playCard.contains("S")))) {
                        playedDeck.add(playCard);
                        player1hand.remove(playCard);
                        turnEnd = true;
                        topCardDiscard = playCard;

                    }
                    else if (playCard.contains("B") && topCardDiscard.contains("B") && !((playCard.contains("D") || playCard.contains("S")))) {
                        playedDeck.add(playCard);
                        player1hand.remove(playCard);
                        turnEnd = true;
                        topCardDiscard = playCard;

                    }
                    else if (playCard.contains("G") && topCardDiscard.contains("G") && !((playCard.contains("D") || playCard.contains("S")))) {
                        playedDeck.add(playCard);
                        player1hand.remove(playCard);
                        turnEnd = true;
                        topCardDiscard = playCard;

                    }
                    //non-special: same number, colour doesn't matter
                    else if(num == numPlay){
                        playedDeck.add(playCard);
                        player1hand.remove(playCard);
                        turnEnd = true;
                        topCardDiscard = playCard;

                    }
                    //unplayable card
                    else{
                        System.out.println("That card is not playable. Would you like to try again (type \"play\"), or draw a new card(type \"draw\" ?)");
                        choice = sc.nextLine();
                        if (choice.equals("play")){
                            System.out.println(player1name + "'s turn! Here is your hand: " + player1hand);
                            System.out.println("The card on the top of the discard deck is: " + topCardDiscard);
                            System.out.println("What card would you like to play? Or type \"draw\" to draw a card.");
                            choice = sc.nextLine();
                            playCard = choice;
                            player1turn = false;
                        }
                        if (choice.equals("draw")){
                            break;
                        }
                    }
                }
                //special
                else{
                    ArrayList<String> numsPlay = new ArrayList<String>();
                    ArrayList<String> numsDiscard = new ArrayList<String>();
                    if (playCard.contains("WD4")) {

                        //if no other options, then allow WD4.
                        for (String cardHand : player1hand) {
                            for (int i = 0; i <= 9; i++) {
                                String numFinder = Integer.toString(i);
                                if (cardHand.contains(numFinder)){
                                    numsPlay.add(String.valueOf(playCard.charAt(1)));
                                }
                                if (topCardDiscard.contains(numFinder)){
                                    numsDiscard.add(String.valueOf(playCard.charAt(1)));
                                }
                            }
                        }

                        for (String nPlay : numsPlay){
                            if (numsDiscard.contains(nPlay)) {
                                otherPlayableCards = true;
                                break;
                            }
                        }
                        //yes there are other options
                        if ((player1hand.contains("R") && topCardDiscard.contains("R")) || (player1hand.contains("Y") && topCardDiscard.contains("Y")) || (player1hand.contains("B") && topCardDiscard.contains("B")) || (player1hand.contains("G") && topCardDiscard.contains("G")) || otherPlayableCards){
                            System.out.println("You cannot play a wild draw four at this time, as you have other playable cards. Please play another card. ");
                            break;
                        }
                        // no there aren't, allow WD4 to be played.
                        else {
                            playedDeck.add(playCard);
                            player1hand.remove(playCard);
                            System.out.println(player1name + " plays a wild draw four!" + player2name + " must draw four cards.");
                            for (int i = 0; i < 4; i++) {
                                deck.remove(topCardDeck);
                                player1hand.add(topCardDeck);
                            }
                            System.out.println(player2name + "'s hand now has four added cards.");
                            System.out.println(player1name + ", what colour would you like the card to become? Input Y for yellow, R for red, B for blue, G for green.");
                            colour = sc.nextLine();
                            switch (colour) {
                                case "Y":
                                    playCard += "Y";
                                    break;
                                case "R":
                                    playCard += "R";
                                    break;
                                case "G":
                                    playCard += "G";
                                    break;
                                case "B":
                                    playCard += "B";
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                    //same colour choice concept for a wild card instead of a wild draw four
                    else if (playCard.contains("W")){
                        playedDeck.add(playCard);
                        player1hand.remove(playCard);
                        System.out.println(player1name + " plays a wild card! " + player1name + ", what colour would you like the card to become? Input Y for yellow, R for red, B for blue, G for green.");
                        colour = sc.nextLine();

                        switch(colour) {
                            case "Y":
                                playCard += "Y";
                                break;
                            case "R":
                                playCard += "R";
                                break;
                            case "G":
                                playCard += "G";
                                break;
                            case "B":
                                playCard += "B";
                                break;
                            default:
                                break;
                        }

                    turnEnd = true;
                    topCardDiscard = playCard;
                    //draw and skip cards
                    if (playCard.contains("R")) {
                        if (playCard.contains("D")) {
                            playedDeck.add(playCard);
                            player1hand.remove(playCard);
                            System.out.println(player1name + " has played a draw card! " + player1name + " must draw two cards.");
                            for (int i = 0; i <= 2; i++) {
                                deck.remove(topCardDeck);
                                player2hand.add(topCardDeck);
                            }
                        }
                    }
                    else if (playCard.contains("S")){
                        playedDeck.add(playCard);
                        player1hand.remove(playCard);
                        System.out.println(player1name + "has played a skip card! "+ player2name + " must skip their turn.");
                            // program a skip
                        }
                    }
                    else if (playCard.contains("B")){
                        if (playCard.contains("D")){
                            playedDeck.add(playCard);
                            player1hand.remove(playCard);
                            System.out.println(player1name + " has played a draw card! " + player2name + " must draw two cards.");
                            for (int i = 0; i <=2; i++){
                                deck.remove(topCardDeck);
                                player2hand.add(topCardDeck);
                            }
                        }
                        else if (playCard.contains("S")){
                            playedDeck.add(playCard);
                            player1hand.remove(playCard);
                            System.out.println(player1name + "has played a skip card! The next player must skip their turn.");
                            // program a skip
                        }
                    }
                    else if (playCard.contains("G")){
                        if (playCard.contains("D")){
                            playedDeck.add(playCard);
                            player1hand.remove(playCard);
                            System.out.println(player1name + " has played a draw card! The next player must draw two cards.");
                            for (int i = 0; i <=2; i++){
                                deck.remove(topCardDeck);
                                player2hand.add(topCardDeck);
                            }
                        } else if (playCard.contains("S")){
                            playedDeck.add(playCard);
                            player1hand.remove(playCard);
                            System.out.println(player1name + "has played a skip card! The next player must skip their turn.");
                            // program a skip
                        }
                    }
                    else if (playCard.contains("Y")){
                        if (playCard.contains("D")){
                            playedDeck.add(playCard);
                            player1hand.remove(playCard);
                            System.out.println(player1name + " has played a draw card! The next player must draw two cards.");
                            for (int i = 0; i <=2; i++){
                                deck.remove(topCardDeck);
                                player2hand.add(topCardDeck);
                            }
                        }
                        else if (playCard.contains("S")){
                            playedDeck.add(playCard);
                            player1hand.remove(playCard);
                            System.out.println(player1name + "has played a skip card! The next player must skip their turn.");
                            // program a skip
                        }
                    }
                }
            }
            //if at any time the choice was to draw a card, we get sent here
            if (choice.equals("draw")) {
                deck.remove(topCardDeck);
                player1hand.add(topCardDeck);
                String numsPlay = "";
                String nums = "";
                for (int i = 0; i <= 9; i++) {
                    //checks which number is in the topCardDeck(the card that was just given to the player )
                    String numFinder = Integer.toString(i);
                    if (topCardDeck.contains(numFinder)) {
                        numsPlay = numFinder;
                        break;
                    }
                }
                for (int i = 0; i <= 9; i++) {
                    //checks which number is in the topCardDiscard
                    String numFinder = Integer.toString(i);
                    if (topCardDiscard.contains(numFinder)) {
                        nums = numFinder;
                        break;
                    }
                }
                if (nums.equals(numsPlay)) {
                    //if they match, then the card just drawn can be played immediately. or they can end their turn.
                    otherPlayableCards = true;
                }


                if ((topCardDeck.contains("R") && topCardDiscard.contains("R")) || (topCardDeck.contains("Y") && topCardDiscard.contains("Y")) || (topCardDeck.contains("B") && topCardDiscard.contains("B")) || (topCardDeck.contains("G") && topCardDiscard.contains("G")) || otherPlayableCards) {
                    System.out.println("The card on the top of the discard deck is: " + topCardDiscard);
                    System.out.println("Your hand, with the added card, is now: " + player1hand);
                    System.out.println("Your card is playable and you can choose to play it immediately. If you want to do so, input \"play\". Otherwise, input \"end turn\".");
                    choice = sc.nextLine();
                    if (choice.equals("play")) {
                        playedDeck.add(topCardDeck);
                        player1hand.remove(topCardDeck);
                        topCardDiscard = topCardDeck;
                        topCardDeck = deck.get(0);
                        System.out.println("You chose to play your card. The top card of the played deck is now: " + topCardDiscard);
                        player1turn = false;
                        topCardDeck = deck.get(0);
                    } else if (choice.equals("end turn")) {
                        System.out.println("You chose to end your turn. This is your hand now:" + player1hand);
                        player1turn = false;
                    }
                }
            }
        }
        sc.close();
    }
}
