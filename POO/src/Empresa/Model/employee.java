package Empresa.Model;

public abstract class employee {
    String name = "";
    String surname = "";
    int id = 0;
    int phoneNumber = 0;
    float salary = 0;
    int yearsContracted = 0;
    employee supervisor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getYearsContracted() {
        return yearsContracted;
    }

    public void setYearsContracted(int yearsContracted) {
        this.yearsContracted = yearsContracted;
    }

    public employee(String name, String surname, int id, int phoneNumber, float salary) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.salary = salary;

    }

    public abstract float incrementSalary (float salary);
    public abstract void

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", yearsContracted=" + yearsContracted +
                '}';
    }
}
