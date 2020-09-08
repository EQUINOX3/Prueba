
package ProyectoAeropuerto;

public class Pasajero {
    private String nombre;
    private String pasaporte;
    private String nacionalidad;
    
    public Pasajero(String n, String p, String nacio){
        this.nombre=n;
        this.pasaporte=p;
        this.nacionalidad=nacio;
    }

    Pasajero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getPasaporte(){
        return pasaporte;
    }
    public String getNacionalidad(){
        return nacionalidad;
    }
}
