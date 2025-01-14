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
        boolean colorSpecial = false;
        boolean red = false;
        boolean yellow = false;
        boolean blue = false;
        boolean green = false;
        boolean draw = false;
        boolean skip = false;
        boolean wildDraw4 = false;
        int countSpecial = 0;
        int countNonSpecial = 0;
        //might not need these
        //initialize array 1-100
        ArrayList<String> deck = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            String card = "";
            int shuffler = (int) (Math.random() * (100 - 1 + 1) + 1);
            if (shuffler < 24 && countSpecial != 24) {
                special = true;
                card += "S";
                shuffler = (int) (Math.random() * (24 - 1 + 1) + 1);
                if (shuffler > 8) {
                    colorSpecial = true;
                    card += "C";
                    shuffler = (int) (Math.random() * (16 - 1 + 1) + 1);
                    switch (shuffler) {
                        case 1:
                        case 2:
                            red = true;
                            card += "RD";
                            draw = true;
                            break;
                        case 3:
                        case 4:
                            red = true;
                            card += "RS";
                            skip = true;
                            break;
                        case 5:
                        case 6:
                            yellow = true;
                            card += "YD";
                            draw = true;
                            break;
                        case 7:
                        case 8:
                            yellow = true;
                            card += "YS";
                            skip = true;
                            break;
                        case 9:
                        case 10:
                            blue = true;
                            card += "BL";
                            draw = true;
                            break;
                        case 11:
                        case 12:
                            blue = true;
                            card += "BS";
                            skip = true;
                            break;
                        case 13:
                        case 14:
                            green = true;
                            card += "GD";
                            draw = true;
                            break;
                        case 15:
                        case 16:
                            green = true;
                            card += "GS";
                            skip = true;
                            break;
                    }
                }
                if (shuffler < 8) {
                    if (shuffler < 4) {
                        wild = true;
                        card += "W";
                    } else {
                        wildDraw4 = true;
                        card += "D4";
                    }
                }
                countSpecial++;
            }
             if (shuffler > 24 && countNonSpecial != 76) {
                shuffler = (int) (Math.random() * (76 - 1 + 1) + 1);
                if (shuffler <= 19) {
                    red = true;
                    card += "R";
                }
                if (shuffler > 19 && shuffler <= 38) {
                    green = true;
                    card += "G";
                }
                if (shuffler > 38 && shuffler <= 57) {
                    yellow = true;
                    card += "Y";
                }
                if (shuffler > 57 && shuffler <= 76) {
                    blue = true;
                    card += "B";
                }

                shuffler = (int) (Math.random() * (19 - 1 + 1) + 1);
                switch (shuffler) {
                    case 1:
                        card += 0;
                        break;
                    case 2:
                    case 3:
                        card += 1;
                        break;
                    case 4:
                    case 5:
                        card += 2;
                        break;
                    case 6:
                    case 7:
                        card += 3;
                        break;
                    case 8:
                    case 9:
                        card += 4;
                        break;
                    case 10:
                    case 11:
                        card += 5;
                        break;
                    case 12:
                    case 13:
                        card += 6;
                        break;
                    case 14:
                    case 15:
                        card += 7;
                        break;
                    case 16:
                    case 17:
                        card += 8;
                        break;
                    case 18:
                    case 19:
                        card += 9;
                        break;
                }
                countNonSpecial++;
            }
            deck.add(card);

        }

        System.out.println(deck);



        //pick from array.size
    //clear the picked one
    //if picked one is greater than 24, boolean special = false
    // ig less than 24, special = true
    // array out of 8, pick random, if

        sc.close();
    }
}
// establish count