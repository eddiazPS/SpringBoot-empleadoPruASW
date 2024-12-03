package www.api.rest.api.rest.entity;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Empleado {


    private int identificacion;


    private String nombre;


    private int edad;


    private LocalDate fechaNacimiento;

    public Empleado() {
    }

    public Empleado(int identificacion, String nombre, int edad, LocalDate fechaNacimiento) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + identificacion +
                ", firstName='" + nombre + '\'' +
                ", lastName='" + edad + '\'' +
                ", email='" + fechaNacimiento + '\'' +
                '}';
    }
}
