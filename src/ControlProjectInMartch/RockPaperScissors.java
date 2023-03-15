package ControlProjectInMartch;

public class RockPaperScissors {

    private User user;

    private Computer comp;
    int userScore;
    int compScore;
    int countOfGamers;

    public void startGame(){
    System.out.println("Fight!");
    Move userMove = user.getMove();
    Move compMove = comp.gteMove();
    System.out.println(compMove);
    System.out.println(userMove);
    int compareMoves = userMove.compareMoves(compMove);
    switch (compareMoves ){
        case 1 : System.out.println("Player Win!");
        userScore ++;
        break;
        case -1 : System.out.println("BOT Win!");
        compScore ++;
        break;
        case 0 : System.out.println("No One Win!");
        break;
    }
    countOfGamers ++;

    }

    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.startGame();
    }
    public RockPaperScissors() {
        user = new User();
        comp = new Computer();
        userScore = 0;
        compScore = 0;
        countOfGamers = 0;
    }
    private void printGameStats() {
        int wins = userScore;
        int losses = compScore;
        int ties = countOfGamers - userScore - compScore;
        double percentageWon = (wins + ((double) ties) / 2) / countOfGamers;

// Вивід лінії
        System.out.print("+");
        printDashes(68);
        System.out.println("+");

// Вивід заголовків таблиці
        System.out.printf("| %6s | %6s | %6s | %12s | %14s |\n",
                "WINS", "LOSSES", "TIES", "GAMES PLAYED", "PERCENTAGE WON");

// Вивід лінії
        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");

// Вивід значень
        System.out.printf("| %6d | %6d | %6d | %12d | %13.2f%% |\n",
                wins, losses, ties, countOfGamers, percentageWon * 100);

// Вивід лінії
        System.out.print("+");
        printDashes(68);
        System.out.println("+");
    }
    private void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }

}
