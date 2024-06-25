public class TestSistemaMensaje {
    public static void main(String[] args) {
        // Crear instancias de Telefono
        Telefono telefono1 = new Telefono(123456789, 987654321);
        Telefono telefono2 = new Telefono(111111111, 222222222);

        // Crear instancia de Sms
        Sms sms = new Sms("Hola, ¿cómo estás?", telefono1, telefono1.numTelefonoRemi, telefono1.numTelefonoDesti);

        // Crear instancia de Mms
        Mms mms = new Mms("imagen.jpg", telefono2, telefono2.numTelefonoRemi, telefono2.numTelefonoDesti);

        // Mostrar la información de los objetos creados
        System.out.println(telefono1);
        System.out.println(telefono2);
        System.out.println(sms);
        System.out.println(mms);
    }
}
class Telefono{
    public int numTelefonoRemi;
    public int numTelefonoDesti;

    public Telefono(int numTelefonoRemi, int numTelefonoDesti) {
        this.numTelefonoRemi = numTelefonoRemi;
        this.numTelefonoDesti = numTelefonoDesti;
    }

    @Override
    public String toString() {
        return "Telefono{" + "numTelefonoRemi=" + numTelefonoRemi + ", numTelefonoDesti=" + numTelefonoDesti + '}';
    }
    
    
}
class Mensaje{
    public Telefono telef;

    public Mensaje(Telefono telef, int numTelefonoRemi, int numTelefonoDesti) {
        this.telef = telef;
    }

    @Override
    public String toString() {
        return "Mensaje{" + super.toString() +  "telef=" + telef + '}';
    }
    
    
    
    public void enviarMensaje(){}
    public void visualizarMensaje(){}
}
class Sms extends Mensaje{
    public String mensajeCaracter;

    public Sms(String mensajeCaracter, Telefono telef, int numTelefonoRemi, int numTelefonoDesti) {
        super(telef, numTelefonoRemi, numTelefonoDesti);
        this.mensajeCaracter = mensajeCaracter;
    }

    @Override
    public String toString() {
        return "Sms{" + super.toString() +  "mensajeCaracter=" + mensajeCaracter + '}';
    }
    
    
}
class Mms extends Mensaje{
    public String nombreFichero;

    public Mms(String nombreFichero, Telefono telef, int numTelefonoRemi, int numTelefonoDesti) {
        super(telef, numTelefonoRemi, numTelefonoDesti);
        this.nombreFichero = nombreFichero;
    }
    
    

    @Override
    public String toString() {
        return "Mms{" +super.toString() +"nombreFichero=" + nombreFichero + '}';
    }
    
    
}