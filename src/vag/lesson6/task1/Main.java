package vag.lesson6.task1;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Alex", "Vagurin", "Sber");
        Employee employee1 = new Employee("Sveta", "Shevkunova","VTB");
        checkInfo(client1);
        checkInfo(employee1);
        public static void checkInfo (Info info) {
            info.showInfo();
        }
    }
}
