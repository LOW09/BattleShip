package PackDontNeed;

public class ReturnBook {
    public static void main(String[] args){
        int RB = 4;
        int NRB = 0;
        int Book = book(RB, NRB);
    }

    public static int book(int RB, int NRB) {
        int HRB;
        if (RB > NRB)
            HRB = RB;
        else
            HRB = NRB;
        System.out.println("Вы вернули все книги!");

        return RB;
    }
}
