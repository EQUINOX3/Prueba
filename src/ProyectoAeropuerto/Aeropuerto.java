
package ProyectoAeropuerto;

public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String pais;
    private Compania listaCompanias[]=new Compania[10];
    private int numCompania;
    
    public Aeropuerto(String n, String c, String p){
        this.nombre=n;
        this.ciudad=c;
        this.pais=p;
        this.numCompania=0;
    }
    
    public Aeropuerto(String n, String c, String p, Compania [] com){
        this.nombre=n;
        this.ciudad=c;
        this.pais=p;
        this.numCompania=com.length;
        this.listaCompanias=com;
    }
    
    public void insertarCompania(Compania compania){
        listaCompanias[numCompania]=compania;
        numCompania++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public int getNumCompania() {
        return numCompania;
    }

    public Compania[] getListaCompanias() {
        return listaCompanias;
    }
    
    public Compania getCompania(int i){
        return listaCompanias[i];
    }
    
    public Compania getCompania(String nombre){
        boolean encontrado=false;
        int i=0;
        Compania com=null;
        while((!encontrado)&&(i<listaCompanias.length)){
            if(nombre.equals(listaCompanias[i].getNombre())){
                encontrado=true;
                com=listaCompanias[i];
            }
            i++;
        }
        return com;
    }
    
}
