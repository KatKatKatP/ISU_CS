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
//
//        //establish a changing variable for the card at the top of the deck
//        String topCard = "";
//        //establish states
//        boolean special = false;
//        boolean wild = false;
//        boolean colorSpecial = false;
//        boolean red = false;
//        boolean yellow = false;
//        boolean blue = false;
//        boolean green = false;
//        boolean draw = false;
//        boolean skip = false;
//        boolean wildDraw4 = false;
//        //might not need these
//        //initialize array 1-100
//
//        ArrayList<Integer> countSpecialcolor = new ArrayList<Integer>();
//        for(int j = 1; j <= 16; j++) {
//            countSpecialcolor.add(j);
//        }
//        ArrayList<String> deck = new ArrayList<String>();
//        for (int i = 0; i < 100; i++) {
//            String card = "";
//            int shuffler = (int) (Math.random() * (100 - 1 + 1) + 1);
//            if (shuffler < 24) {
//                special = true;
//                card += "S";
//                shuffler = (int) (Math.random() * (24 - 1 + 1) + 1);
//                if (shuffler > 8) {
//                    colorSpecial = true;
//                    card += "C";
//                    shuffler = (int) (Math.random() * (16 - 1 + 1) + 1);
//                    switch(shuffler){
//                        case 1:
//                            if (countSpecialcolor.contains(1)) {
//                                red = true;
//                                card += "RD";
//                                draw = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(1));
//                            }
//                            break;
//                        case 2:
//                             if (countSpecialcolor.contains(2)) {
//                                red = true;
//                                card += "RD";
//                                draw = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(2));
//                            }
//                            break;
//                        case 3:
//                            if (countSpecialcolor.contains(3)) {
//                                red = true;
//                                card += "RS";
//                                skip = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(3));
//                            }
//                            break;
//                        case 4:
//                           if (countSpecialcolor.contains(4)) {
//                                red = true;
//                                card += "RS";
//                                skip = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(4));
//                            } break;
//                        case 5:
//                            if (countSpecialcolor.contains(5)) {
//                                card += "YD";
//                                yellow = true;
//                                draw = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(5));
//                            }
//                            break;
//                        case 6:
//                             if (countSpecialcolor.contains(6)) {
//                                yellow = true;
//                                card += "YD";
//                                draw = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(6));
//                            }
//                            break;
//                        case 7:
//                            if (countSpecialcolor.contains(7)) {
//                                yellow = true;
//                                card += "YS";
//                                skip = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(7));
//                            }
//                            break;
//                        case 8:
//                          if (countSpecialcolor.contains(8)) {
//                                yellow = true;
//                                card += "YS";
//                                skip = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(8));
//                            }
//                            break;
//                        case 9:
//                            if (countSpecialcolor.contains(9)) {
//                                blue = true;
//                                card += "BL";
//                                draw = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(9));
//                            }
//                            break;
//
//                        case 10:
//                            if (countSpecialcolor.contains(10)) {
//                                blue = true;
//                                card += "BL";
//                                draw = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(10));
//                            }
//
//                            break;
//                        case 11:
//                            if (countSpecialcolor.contains(11)) {
//                                blue = true;
//                                card += "BS";
//                                skip = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(11));
//                            }
//                            break;
//                        case 12:
//                             if (countSpecialcolor.contains(12)) {
//                                blue = true;
//                                card += "BS";
//                                skip = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(12));
//                            }
//                            break;
//                        case 13:
//                            if (countSpecialcolor.contains(13)) {
//                                green = true;
//                                card += "GD";
//                                draw = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(13));
//                            }
//                            break;
//                        case 14:
//                            if (countSpecialcolor.contains(14)) {
//                                green = true;
//                                card += "GD";
//                                draw = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(14));
//                            }
//                            break;
//                        case 15:
//                            if (countSpecialcolor.contains(15)) {
//                                green = true;
//                                card += "GS";
//                                skip = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(15));
//                            }
//                            break;
//                        case 16:
//                            if (countSpecialcolor.contains(16)) {
//                                green = true;
//                                card += "GS";
//                                skip = true;
//                                countSpecialcolor.remove(countSpecialcolor.indexOf(16));
//                            }
//                            break;
//                        default:
//                            i --;
//                        }
//                }
//                else{
//                    if (shuffler < 4) {
//                        wild = true;
//                        card += "W";
//                    } else {
//                        wildDraw4 = true;
//                        card += "D4";
//                    }
//                }
//            }
//             if (shuffler > 24) {
//                shuffler = (int) (Math.random() * (76 - 1 + 1) + 1);
//                if (shuffler <= 19) {
//                    red = true;
//                    card += "R";
//                }
//                if (shuffler > 19 && shuffler <= 38) {
//                    green = true;
//                    card += "G";
//                }
//                if (shuffler > 38 && shuffler <= 57) {
//                    yellow = true;
//                    card += "Y";
//                }
//                if (shuffler > 57 && shuffler <= 76) {
//                    blue = true;
//                    card += "B";
//                }
//
//                shuffler = (int) (Math.random() * (19 - 1 + 1) + 1);
//                switch (shuffler) {
//                    case 1:
//                        card += 0;
//                        break;
//                    case 2:
//                    case 3:
//                        card += 1;
//                        break;
//                    case 4:
//                    case 5:
//                        card += 2;
//                        break;
//                    case 6:
//                    case 7:
//                        card += 3;
//                        break;
//                    case 8:
//                    case 9:
//                        card += 4;
//                        break;
//                    case 10:
//                    case 11:
//                        card += 5;
//                        break;
//                    case 12:
//                    case 13:
//                        card += 6;
//                        break;
//                    case 14:
//                    case 15:
//                        card += 7;
//                        break;
//                    case 16:
//                    case 17:
//                        card += 8;
//                        break;
//                    case 18:
//                    case 19:
//                        card += 9;
//                        break;
//                }
//            }
//            deck.add(card);
//
//        }
//        System.out.println(deck);
//        sc.close();


    }
}
