package lab08_SplitterApp.lab8Class;

public class Expense {
    public  int amount;
    public String expenseName;
    public  String user;

    @Override
    public String toString() {
        return "Expense{" +
                "amount=" + amount +
                ", expenseName='" + expenseName + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
