
package ProyectoAeropuerto;


public class Compania {
    private String nombre;
    private Vuelo listaVuelos[]=new Vuelo[10];
    private int numVuelos=0;
    
    public Compania(String n){
        this.nombre=n;
    }
    
    public Compania(String n, Vuelo []v){
        this.nombre=n;
        this.listaVuelos=v;
        numVuelos=v.length;
    }
    
    public void insertarVuelo(Vuelo vuelo){
        listaVuelos[numVuelos]=vuelo;
        numVuelos++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumVuelos() {
        return numVuelos;
    }
    
    public Vuelo getVuelo(int i){
        return listaVuelos[i];
    }
    
    public Vuelo getVuelo(String id){
        boolean encontrado=false;
        int i=0;
        Vuelo clase = null;
        while((!encontrado)&&(i<listaVuelos.length)){
            if(id.equals(listaVuelos[i].getIdentificador())){
                encontrado=true;
                clase=listaVuelos[i];
            }
            i++;
        }
        return clase;
    }
    
}
