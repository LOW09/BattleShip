package CW18;

public class Account {
    String name;

    int balance;

    String numcard;

    int pincod;



    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setNumcard(String numcard) {
        this.numcard = numcard;
    }

    public void setPincod(int pincod) {
        this.pincod = pincod;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getNumcard() {
        return numcard;
    }

    public int getPincod() {
        return pincod;
    }

    public Account(String name, int balance, String numcard, int pincod) {
        this.name = name;
        this.balance = balance;
        this.numcard = numcard;
        this.pincod = pincod;
    }
}

