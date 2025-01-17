import java.util.Collections;
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

        ArrayList<String> deck = new ArrayList<String>();
        String card = "";
        for (int i = 1; i <= 100; i++){
            card = "";
            if (i<=24){
                card += "S";
                if (i<=4){
                    card += "WD4";
                }
                else if (i <=8){
                    card +="W";
                }
                else {
                    switch (i){
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
            }
            else{
                if (i< 44){
                    card += "R";
                    switch(i){
                        case 25:
                            card += "0"; break;
                        case 26:
                        case 27:
                            card += "1"; break;
                        case 28:
                        case 29:
                            card += "2"; break;
                        case 30:
                        case 31:
                            card += "3"; break;
                        case 32:
                        case 33:
                            card += "4"; break;
                        case 34:
                        case 35:
                            card += "5"; break;
                        case 36:
                        case 37:
                            card += "6"; break;
                        case 38:
                        case 39:
                            card += "7"; break;
                        case 40:
                        case 41:
                            card += "8"; break;
                        case 42:
                        case 43:
                            card += "9"; break;
                        default:
                            break;
                    }
                }
                else if(i< 63){
                    card += "G";
                    switch(i){
                        case 44:
                            card += "0"; break;
                        case 45:
                        case 46:
                            card += "1"; break;
                        case 47:
                        case 48:
                            card += "2"; break;
                        case 49:
                        case 50:
                            card += "3"; break;
                        case 51:
                        case 52:
                            card += "4"; break;
                        case 53:
                        case 54:
                            card += "5"; break;
                        case 55:
                        case 56:
                            card += "6"; break;
                        case 57:
                        case 58:
                            card += "7"; break;
                        case 59:
                        case 60:
                            card += "8"; break;
                        case 61:
                        case 62:
                            card += "9"; break;
                        default:
                            break;
                    }
                }
                else if (i< 82){
                    card += "Y";
                    int num = 0;
                    switch(i){
                        case 63:
                            card += "0"; break;
                        case 64:
                        case 65:
                            card += "1"; break;
                        case 66:
                        case 67:
                            card += "2"; break;
                        case 68:
                        case 69:
                            card += "3"; break;
                        case 70:
                        case 71:
                            card += "4"; break;
                        case 72:
                        case 73:
                             card += "5"; break;
                        case 74:
                        case 75:
                             card += "6"; break;
                        case 76:
                        case 77:
                             card += "7"; break;
                        case 78:
                        case 79:
                             card += "8"; break;
                        case 80:
                        case 81:
                            card += "9"; break;
                        default:
                            break;
                    }
                }

                else{
                    card += "B";
                    switch (i){
                        case 82:
                            card += "0"; break;
                        case 83:
                        case 84:
                            card += "1"; break;
                        case 85:
                        case 86:
                            card += "2"; break;
                        case 87:
                        case 88:
                            card += "3"; break;
                        case 89:
                        case 90:
                            card += "4"; break;
                        case 91:
                        case 92:
                            card += "5"; break;
                        case 93:
                        case 94:
                            card += "6"; break;
                        case 95:
                        case 96:
                            card += "7"; break;
                        case 97:
                        case 98:
                            card += "8"; break;
                        case 99:
                        case 100:
                            card += "9"; break;
                        default:
                            break;
                    }
                }
            }
            deck.add(card);

        }
        System.out.println("Here is the unshuffled deck:");
        System.out.println(deck);
        Collections.shuffle(deck);
        System.out.println("Here is the shuffled deck:");
        System.out.println(deck);
    }
}
