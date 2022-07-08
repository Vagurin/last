package vag.lesson6.task1;

public class Client extends Human implements Info {
    private final String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

}
