import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CW27BoogyMan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("D:/Words.txt"));
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()){
            words.add(scanner.nextLine());


        }
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));
        System.out.println(word);
        List<Character> playerGueses = new ArrayList<>();

        printWordState(word, playerGueses);
        Scanner keyBoard = new Scanner(System.in);
        String letterGuess = keyBoard.nextLine();
        playerGueses.add(letterGuess.charAt(0));
        int wrongCount = 0;
        while(true){
        printBoogieMan(wrongCount);
        if (wrongCount >= 6){
            System.out.println("You lose!");
        }
        printWordState(word, playerGueses);
        if (!getPlayerGuess(keyBoard, word, playerGueses)){
            wrongCount++;
        }
        if (printWordState(word, playerGueses) == true){
            System.out.println("You win");
            break;
        }
            System.out.println("enter your guess for the world");
        if (keyBoard.nextLine().equals(word)){

            System.out.println("You win!");
            break;
        }
        else {
            System.out.println("No correct");
        }
        }


    }
    public static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> playerGueses){
        System.out.println("Ведите букву");
        Scanner keyBoard = new Scanner(System.in);
        String letterGuess = keyBoard.nextLine();
        playerGueses.add(letterGuess.charAt(0));
        return word.contains(letterGuess);
    }
    public static boolean printWordState(String word, List<Character> playerGueses){
        int correctCount = 0;
        for (int i = 0; i < word.length(); i++)
            if (playerGueses.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
                correctCount++;
            }
            else{
                System.out.print("_");
            }
        return (word.length() == correctCount);
    }
    public static void printBoogieMan(Integer wrongCount){
        if(wrongCount >= 1){
            System.out.println(" 0");
        }
        if(wrongCount >= 2){
            System.out.print("\\ ");
            if(wrongCount >= 3){
                System.out.println("/");
            } else {System.out.print("");}
        }
        if(wrongCount >= 4){
            System.out.println(" |");
        }
        if(wrongCount >= 5){
            System.out.print("/ ");
            if(wrongCount >= 6){
                System.out.println("\\");
            } else {System.out.print("");}
    }
}}


