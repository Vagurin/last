package vag.lesson6.task1;

public class Employee extends Human implements Info {
    private final String bankName;

    public Employee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void ShowInfo() {
        System.out.println("An employee of bank \""
                + bankName + "\". "
                + getName() + " "
                + getSurname() + ".");
    }
}