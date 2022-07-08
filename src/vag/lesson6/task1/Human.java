package vag.lesson6.task1;

public abstract class Human {
    private String name;
    private String surname;
    //по умолчанию
    public Human() {
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    // метод получения имени
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    // метод получения фамилии

}
