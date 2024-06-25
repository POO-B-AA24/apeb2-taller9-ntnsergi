
import java.util.ArrayList;
import java.util.Arrays;

public class TestSistemaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Unido");
        
        ArrayList<TipoDeCuenta> listaCuentas = new ArrayList<TipoDeCuenta>(Arrays.asList(
                                new Ahorro(3045, 1059644387 , "Sergi Montaño"),
                                new Cheque(589.12,1564897584 , "Steven Armijos"),
                                new Platino(458.78,56894101,"Isaakc Valarezo")));
        
        for(TipoDeCuenta tipoCuenta : listaCuentas){
            System.out.println(tipoCuenta);
        }
    }
}

class Banco{
    public String nombreBanco;

    public Banco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombreBanco=" + nombreBanco + '}';
    }
    
    
}
class TipoDeCuenta{
    public int numCuenta;
    public String nombreCliente;

    public TipoDeCuenta(int numCuenta, String nombreCliente) {
        this.numCuenta = numCuenta;
        this.nombreCliente = nombreCliente;
    }
    
    public void obtenerBalance(){}
    public void depositarDinero(){}
    public void retirarDinero(){}

    @Override
    public String toString() {
        return "TipoDeCuenta{" + "numCuenta=" + numCuenta + ", nombreCliente=" + nombreCliente + '}';
    }
    
    
}
class Ahorro extends TipoDeCuenta{
    
    public double dineroDisponible;

    public Ahorro(double dineroDisponible, int numCuenta, String nombreCliente) {
        super(numCuenta, nombreCliente);
        this.dineroDisponible = dineroDisponible;
    }
    
    
    public void obtenerBalance(){
        
    }
}
class Cheque extends TipoDeCuenta{

    public Cheque(double dineroDisponible, int numCuenta, String nombreCliente) {
        super(numCuenta, nombreCliente);
        this.dineroDisponible = dineroDisponible;
    }
    
    
    public double dineroDisponible;
}
class Platino extends TipoDeCuenta{

    public Platino(double dineroDisponible, int numCuenta, String nombreCliente) {
        super(numCuenta, nombreCliente);
        this.dineroDisponible = dineroDisponible;
    }
    
    
    public double dineroDisponible;
}