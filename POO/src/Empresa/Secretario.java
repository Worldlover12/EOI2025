package Empresa;

import Empresa.Model.employee;

public class Secretario extends employee {
    final private boolean office =true;
    int numFax;

    public Secretario(String name, String surname, int id, int phoneNumber, float salary, int numFax) {
        super(name, surname, id, phoneNumber, salary);
        this.numFax = numFax;
    }

    @Override
    public float calculateSalary(float salary, int yearsContracted) {
        for(int i = 0; i < getYearsContracted(); i++){
            salary += salary*0.1F;
        }
        return salary;
    }

    public int getNumFax() {
        return numFax;
    }

    public void setNumFax(int numFax) {
        this.numFax = numFax;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", id=" + getId() +
                ", phoneNumber=" + getPhoneNumber() +
                ", salary=" + getSalary() +
                ", yearsContracted=" + getYearsContracted() + '\'' +
                ", fax number=" + numFax + '\'' +
                ", has access to offic?" + office +
                '}';
    }

}
