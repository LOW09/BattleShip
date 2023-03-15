package CW18;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    static List<Account> allAccounts = new ArrayList();

    public static void chooseOption(Account account){

    }

    static {
        allAccounts.add(new Account("Ivan", 1, "1", 9234));
        allAccounts.add(new Account("Macen", 2, "12", 1236));
        allAccounts.add(new Account("Mary", 3, "13", 1245));
    }
}
