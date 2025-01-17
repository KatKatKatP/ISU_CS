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
            if (i<=24){
                card += "S";
                if (i<4){
                    card += "D4";
                }
                else if (i <=8 && i >4){
                    card +="W";
                }
                switch (i){
                    case 1:
                    case 2:
                        card += "RD";
                        break;
                    case 3:
                    case 4:
                        card += "RS";
                        break;
                    case 5:
                    case 6:
                        card += "YD";
                        break;
                    case 7:
                    case 8:
                        card += "YS";
                        break;
                    case 9:
                    case 10:
                        card += "BD";
                        break;
                    case 11:
                    case 12:
                        card += "BS";
                        break;
                    case 13:
                    case 14:
                        card += "GD";
                        break;
                    case 15:
                    case 16:
                        card += "GS";
                        break;
                    default:
                        break;
                }
            }
            else{
                if (i<= 44){
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
                        case 37:
                        case 38:
                            card += "6"; break;
                        case 39:
                        case 40:
                            card += "7"; break;
                        case 41:
                        case 42:
                            card += "8"; break;
                        case 43:
                        case 44:
                            card += "9"; break;
                        default:
                            break;
                    }
                }
                else if(i<= 63){
                    card += "G";
                    switch(i){
                        case 45:
                            card += "0"; break;
                        case 46:
                        case 47:
                            card += "1"; break;
                        case 48:
                        case 49:
                            card += "2"; break;
                        case 50:
                        case 51:
                            card += "3"; break;
                        case 52:
                        case 53:
                            card += "4"; break;
                        case 54:
                        case 55:
                            card += "5"; break;
                        case 56:
                        case 57:
                            card += "6"; break;
                        case 58:
                        case 59:
                            card += "7"; break;
                        case 60:
                        case 61:
                            card += "8"; break;
                        case 62:
                        case 63:
                            card += "9"; break;
                        default:
                            break;
                    }
                }
                else if (i<= 81){
                    card += "Y";
                }
                else{
                    card += "B";
                }
            }

        }
         System.out.println(deck);
    }
}
