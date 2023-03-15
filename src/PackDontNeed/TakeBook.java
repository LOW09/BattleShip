package PackDontNeed;

public class TakeBook {
    public static void main(String[] args){
        int TB = 4;
        int NTB = 0;
        int Book = book(TB, NTB);
    }

    public static int book(int tb, int NTB) {
        int HB;
        if (tb > NTB)
            HB = tb;
        else
            HB = NTB;
            System.out.println("Нету книг");

        return tb;
    }
}
