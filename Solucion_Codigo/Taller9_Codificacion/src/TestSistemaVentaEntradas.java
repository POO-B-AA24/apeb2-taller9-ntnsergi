
import java.util.Scanner;

public class TestSistemaVentaEntradas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("1. Vender entrada");
            System.out.println("2. Consultar entrada");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            
            op = sc.nextInt();
            
            
            switch(op){
                case 1: 
                    System.out.print("Ingrese la zona: ");
                    String nomZona = sc.nextLine();
                    
            }
        } while();
        
    }
}

class Zona{
    public String nombre;
    public int numeroLocalidades;
    public double precioNormal;
    public double precioAbonado;
    public int localidadesOcupadas;

        public Zona(String nombre, int numeroLocalidades, double precioNormal, double precioAbonado, int localidadesOcupadas) {
            this.nombre = nombre;
            this.numeroLocalidades = numeroLocalidades;
            this.precioNormal = precioNormal;
            this.precioAbonado = precioAbonado;
            this.localidadesOcupadas = localidadesOcupadas;
        }

    

    @Override
    public String toString() {
        return "Zona{" + "nombre=" + nombre + ", numeroLocalidades=" + numeroLocalidades + ", precioNormal=" + precioNormal + ", precioAbonado=" + precioAbonado + '}';
    }
    
    
}
class Entrada{
    public Zona zona;
    public int id;
    public String nombre;
    public double precio;

    public Entrada(Zona zona, int id, String nombre, double precio) {
        this.zona = zona;
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
    
    public double calcularPrecioEntrada(){
        return this.precio;
    }

    @Override
    public String toString() {
        return "Entrada{" + "zona=" + zona + ", id=" + id + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    

}
class Normal extends Entrada{

    public Normal(Zona zona, int id, String nombre, double precio) {
        super(zona, id, nombre, precio);
    }
    
    
    @Override
    public double calcularPrecioEntrada(){
    return zona.precioNormal;
    
    }
}
class Reducida extends Entrada{

    public Reducida(Zona zona, int id, String nombre, double precio) {
        super(zona, id, nombre, precio);
    }
    
    
    @Override
    public double calcularPrecioEntrada(){
        return this.precio *= 0.85;
    }
}
class Abonada extends Entrada{

    public Abonada(Zona zona, int id, String nombre, double precio) {
        super(zona, id, nombre, precio);
    }

    
    @Override
    public double calcularPrecioEntrada(){
        return zona.precioAbonado;
    }
}
