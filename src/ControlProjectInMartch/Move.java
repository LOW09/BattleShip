package ControlProjectInMartch;

public enum Move {
    ROCK,
    PAPER,
    SCISSORS;

    public int compareMoves(Move otherMove) {
        // Нічия
        if (this == otherMove)
            return 0;

        switch (this) {
            case ROCK:
                return (otherMove == SCISSORS ? 1 : -1);
            case PAPER:
                return (otherMove == ROCK ? 1 : -1);
            case SCISSORS:
                return (otherMove == PAPER ? 1 : -1);
        }

        // цей код немає викноуватись ніколи
        return 0;
    }

    }
