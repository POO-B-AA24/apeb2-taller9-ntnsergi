
import java.util.ArrayList;
import java.util.Arrays;

public class TestSistemaTrabajador {
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al Sistema\n");
        
        ArrayList<Trabajador> listaTrabajadores = new ArrayList<Trabajador>(Arrays.asList(
                new Jefe("Sergi","Montaño","Cdla el pato feliz",123456789  , 9600 ), 
                new Trabajador("Carlos" ,"Vivanco","Brazil y Av. Pio Jaramillo" ,987654321 ,550),
                new FijoMensual("Sergi","Isaak","Valarezo","Ciudad Alegria",654459879,980),
                new Comisionista(16,"Sergi","Steven","Armijos","Rosales",321123987,750),
                new PorHora(49,"Sergi","Santiago","Villacorta","El churo",123369987,16)));
        
        
        
        for (Trabajador trabajador : listaTrabajadores) {
            trabajador.calcularSueldo();
            System.out.println(trabajador);
        }
    }
}

class Trabajador{
    public String nombre;
    public String apellido;
    public String dirreccion;
    public int dni;
    public double sueldo;

    public Trabajador(String nombre, String apellido, String dirreccion, int dni, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirreccion = dirreccion;
        this.dni = dni;
        this.sueldo = sueldo;
    }
    
    
    
    public String imprimirNomina(){
        return "Sueldo ganado: " + this.sueldo;
    
    }
    public void calcularSueldo(){}

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", apellido=" + apellido + ", dirreccion=" + dirreccion + ", dni=" + dni + ", sueldo=" + sueldo + '}';
    }
    
    
    
}
class Jefe extends Trabajador {

    public Jefe(String nombre, String apellido, String dirreccion, int dni, double sueldo) {
        super(nombre, apellido, dirreccion, dni, sueldo);
    }
    
    public String darDeAlta(String emple){
        
        return "El trabajador " + emple + " fue dado de alta";
    }

}

class FijoMensual extends Trabajador{
    public String jefe;

    public FijoMensual(String jefe, String nombre, String apellido, String dirreccion, int dni, double sueldo) {
        super(nombre, apellido, dirreccion, dni, sueldo);
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return "FijoMensual{" + super.toString()+ "jefe=" + jefe + '}';
    }
    
    
    
}

class Comisionista extends Trabajador{
    public int ventasRealizadas;
    public String jefe;
    public double porcentaje;

    public Comisionista(int ventasRealizadas, String jefe, String nombre, String apellido, String dirreccion, int dni, double sueldo) {
        super(nombre, apellido, dirreccion, dni, sueldo);
        this.ventasRealizadas = ventasRealizadas;
        this.jefe = jefe;
    }
    
    @Override
    public void calcularSueldo(){
        if (ventasRealizadas > 9) {
            this.porcentaje = 1.18;
        }else if(ventasRealizadas > 22){
            this.porcentaje = 1.25;
        } else{
            this.porcentaje = 1;
        }
        
        this.sueldo *= this.porcentaje;
    
    }

    @Override
    public String toString() {
        return "Comisionista{" + super.toString()+ "ventasRealizadas=" + ventasRealizadas + ", jefe=" + jefe + '}';
    }
    
    
    
}

class PorHora extends Trabajador{
    public double horasTrabajadas;
    public String jefe;

    public PorHora(double horasTrabajadas, String jefe, String nombre, String apellido, String dirreccion, int dni, double sueldo) {
        super(nombre, apellido, dirreccion, dni, sueldo);
        this.horasTrabajadas = horasTrabajadas;
        this.jefe = jefe;
    }
    
    
    
    
    @Override
    public void calcularSueldo(){
        this.sueldo *= this.horasTrabajadas;
        
        if (this.horasTrabajadas > 40) {
            this.sueldo *= 1.13;
        }
    
    }

    @Override
    public String toString() {
        return "PorHora{" + super.toString()+ "horasTrabajadas=" + horasTrabajadas + ", jefe=" + jefe + '}';
    }
    
    
    
}
