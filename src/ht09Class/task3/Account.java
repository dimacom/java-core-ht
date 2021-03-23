package ht09Class.task3;

public class Account {
    private int id;
    private String code;
    private int balance;

    public Account(int id, String code, int balance) {
        this.id = id;
        this.code = code;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", balance=" + balance +
                '}';
    }
}
