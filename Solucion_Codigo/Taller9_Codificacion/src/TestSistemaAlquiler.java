
import java.util.ArrayList;
import java.util.Arrays;

public class TestSistemaAlquiler {
    public static void main(String[] args) {
        Dvd soporteDvd =  new Dvd(4.5);
        Vhs soporteVhs = new Vhs("Estandar");
        ArrayList<Pelicula> listaPelicula = new ArrayList<Pelicula>(Arrays.asList(
                              new Pelicula("Intensamente","Ricardo","2024","Español",soporteDvd),
                              new Pelicula("Juego de Tronos","Daniel","2000","Español",soporteVhs),
                              new Pelicula("Matrix","Steven","2024","Español",soporteDvd)));
        
        for(Pelicula peli : listaPelicula ){
            System.out.println(peli);
        }
    }
}

class Pelicula{
    public String titulo;
    public String autor;
    public String yearEdicion;
    public String idioma;
    public double costo;
    public Soporte listaSoporte;

    public Pelicula(String titulo, String autor, String yearEdicion, String idioma, Soporte listaSoporte) {
        this.titulo = titulo;
        this.autor = autor;
        this.yearEdicion = yearEdicion;
        this.idioma = idioma;
        this.listaSoporte = listaSoporte;
    }
    
    public void calcularPrecioAlquiler(){}

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", autor=" + autor + ", yearEdicion=" + yearEdicion + ", idioma=" + idioma + ", costo=" + costo + ", listaSoporte=" + listaSoporte + '}';
    }
    
    
}
class Soporte{}
class Dvd extends Soporte{
    public double capacidadGB;

    public Dvd(double capacidadGB) {
        this.capacidadGB = capacidadGB;
    }
    
    
    @Override
    public String toString() {
        return "Dvd{" + "capacidadGB=" + capacidadGB + '}';
    }
    
    
}
class Vhs extends Soporte{
    public String tipoCintaMagnetica;

    public Vhs(String tipoCintaMagnetica) {
        this.tipoCintaMagnetica = tipoCintaMagnetica;
    }

    @Override
    public String toString() {
        return "Vhs{" + "tipoCintaMagnetica=" + tipoCintaMagnetica + '}';
    }
    
    
}

