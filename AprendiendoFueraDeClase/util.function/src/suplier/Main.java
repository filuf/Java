package suplier;

import suplier.emp.Empleado;
import suplier.emp.FactoriaEmpleados;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Empleado> jefe = FactoriaEmpleados.getTipo("jefe");

        if (jefe.isPresent()) {
            System.out.println(jefe.get().getTipoEmpleado());
        }

        Optional<Empleado> curr = FactoriaEmpleados.getTipo("currito");

        curr.ifPresent(emp -> System.out.println(emp.getTipoEmpleado()));

        Optional<Empleado> nll = FactoriaEmpleados.getTipo("JefeDeContabilidad");

        System.out.println(nll.isPresent() == true ? nll.get().getTipoEmpleado() :
                "[!] No hay un empleado en este objeto");
    }
}
