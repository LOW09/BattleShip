import javax.print.DocFlavor;
import java.io.IOException;
import java.util.Scanner;

public class BattleShip {
    static String player1;
    static String player2;
    static int [] [] battleField1 = new int[10] [10];
    static int [] [] battleField2 = new int[10] [10];
    static int [] [] monitor1 = new int[10] [10];
    static int [] [] monitor2 = new int[10] [10];
    static Scanner scanner = new Scanner(System.in);
    public static boolean isCondition(){
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < monitor1.length; i++) {
            for (int j = 0; j < monitor1[i].length; j++) {
if (monitor1 [j] [i] == 2){
    counter1++;
}}
            }
        for (int i = 0; i < monitor2.length; i++) {
            for (int j = 0; j < monitor2[i].length; j++) {
                if (monitor2 [j] [i] == 2){
                    counter2++;            }
        }
        }
        if (counter1 >= 10){
        System.out.println(player1 + " win!");}
        if (counter2 >= 10){
            System.out.println(player2 + " win!");}
        return false;
    }


    public static void main(String[] args) {
        enterNames();
        placeShips(player1, battleField1);
        placeShips(player2, battleField2);
        while (true){
            makeTurn(player1, monitor1, battleField2);
            if(isCondition()){
                break;
            }
            makeTurn(player2, monitor2, battleField1);
            if(isCondition()){
                break;
            }
        }


    }

    public static void makeTurn(String player, int monitor [] [], int battleField [] []) {

        while(true){
            cleanScreen();
            System.out.println(player + "make your turn");
            System.out.println("  0 1 2 3 4 5 6 7 8 9");
            for (int i = 0; i < monitor.length; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < monitor[i].length; j++) {
                    if (monitor [j] [i] == 0) {
                        System.out.print("~ ");
                    }
                    else if (monitor [j] [i] == 1) {
                        System.out.print(". ");
                    }
                    else {  System.out.print("* ");}
                }System.out.println(" ");
            }
            System.out.println("Enter your cordinates OX");
            int x = scanner.nextInt();
            System.out.println("Enter your cordinates OY");
            int y = scanner.nextInt();
            if (battleField [x] [y] == 1)  {
                System.out.println("you hit! one more!");
                monitor [x] [y] = 2;

            }else{
            System.out.println("You miss");
                monitor [x] [y] = 1;
                break;
            }
        }
    }
    public static void drawField(int [] [] battleField){
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < battleField.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < battleField[i].length; j++) {
                if (battleField [j] [i] == 0) {
                    System.out.print("~ ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println("");
        }
        System.out.println("Enter");
    }
    public static boolean isAvaileble(int x, int y, int dec, int direction, int battleField [] []){
        if (direction == 1) {
            if (y + dec > 10) {
                return false;
            }
        }
        if (direction == 2) {
            if (x + dec > 10) {
                return false;
            }
        }

        while (dec != 0){
            for (int i = 0; i < dec; i++) {
                int xi = 0;
                int yi = 0;
                if (direction == 1) {
                    yi = i;
                }
                else {
                    xi = i;
                }
                if (x + 1 + xi < battleField.length && x + 1 + xi >= 0) {
                    if(battleField [x + 1 + xi] [y + yi] != 0){
                        return false;
                    }
                }
                if (x - 1 + xi < battleField.length && x - 1 + xi >= 0) {
                    if(battleField [x - 1 + xi] [y + yi] != 0){
                        return false;
                    }
                }
                if (y + 1 + yi < battleField.length && y + 1 + yi >= 0) {
                    if(battleField [x + xi] [y + 1 + yi] != 0){
                        return false;
                    }
                }
                if (y - 1 + yi < battleField.length && y - 1 + yi >= 0) {
                    if(battleField [x + xi] [y - 1 + yi] != 0){
                        return false;
                    }
                }
            }
            dec --;
        }
        return true;
    }

    public static void placeShips(String player, int [] [] battleField){

        int dec = 4;
        while (dec >= 1) {
            cleanScreen();
            System.out.println(player + " Please place your " + dec +"-deck ship");
            drawField(battleField);
            System.out.println("Please enter OX coordinate");
            int x = scanner.nextInt();
            System.out.println("Please enter OY coordinate");
            int y = scanner.nextInt();
            System.out.println("Please choose your direction");
            System.out.println("1.Vertical");
            System.out.println("2.Horizontal");
            int direction = scanner.nextInt();
            if (!isAvaileble(x, y, dec, direction, battleField)) {
                System.out.println("Wrong cordinates, retype please");
                continue;
            }

            for (int i = 0; i < dec; i++) {
                if (direction == 1){
                    battleField [x] [y + i] = 1;
                }
                else {
                    battleField [x + i] [y] = 1;
                }
            }

            dec--;
        }

    }
    public static void cleanScreen(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void enterNames(){
        System.out.println("Player1 write your name!");
        player1 = scanner.nextLine();
        System.out.println("Player2 write your name!");
        player2 = scanner.nextLine();
    }
}
