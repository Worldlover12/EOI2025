package Enum;

import java.util.ArrayList;
import java.util.List;

public class UsaEmpleado {
    public static void main(String[] args) {
        empleado emp = new empleado("MANU", "CORVO");
        empleado emp2 = new empleado("MAN1", "CORVO");
        empleado emp3 = new empleado("MAN2", "CORVO");
        empleado emp4 = new empleado("MAN3", "CORVO");

        emp.setTipo(tiposEmpleado.tecnico);
        emp2.setTipo(tiposEmpleado.administrativo);
        emp3.setTipo(tiposEmpleado.ordenanza);
        emp4.setTipo(tiposEmpleado.tecnico);


        List<empleado> listaEmpleados = new ArrayList<empleado>();
        listaEmpleados.add(emp);
        listaEmpleados.add(emp2);
        listaEmpleados.add(emp3);
        listaEmpleados.add(emp4);

        for (empleado e : listaEmpleados) {
            System.out.println(e.getNombre() + ": " + e.getTipo());
        }


    }

}
