
package ProyectoAeropuerto;

public class AeropuertoPublico extends Aeropuerto{
    private double subvencion;

    public AeropuertoPublico(String n, String c, String p) {
        super(n, c, p);
    }

    public AeropuertoPublico(String n, String c, String p, Compania[] com, double s ) {
        super(n, c, p, com);
        this.subvencion=s;
    }

    public AeropuertoPublico(double subvencion, String n, String c, String p) {
        super(n, c, p);
        this.subvencion = subvencion;
    }
    
    public double getSubvencion() {
        return subvencion;
    }
    
    
}
