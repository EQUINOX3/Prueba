
package B9.Ejer4;

public class Atleta {
    int NAtleta;
    String Nombre;
    float Tiempo;
    
    public Atleta(int natleta, String nombre, float tiempo){
        this.NAtleta = natleta;
        this.Nombre=nombre;
        this.Tiempo=tiempo;
    }
    
    public int getNAtleta(){
        return NAtleta;
    }
    
    public void setNAtleta(int n){
        this.NAtleta=n;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String nom){
        Nombre=nom;
    }

    public float getTiempo() {
        return Tiempo;
    }

    public void setTiempo(float Tiempo) {
        this.Tiempo = Tiempo;
    }

    public String Mostrar(){
        return "N° : "+NAtleta +"\tNombre : "+ Nombre+ "\tTiempo : "+ Tiempo+"\n";
    }
    @Override
    public String toString(){
        return "N° : "+NAtleta +"\tNombre : "+ Nombre+ "\tTiempo : "+ Tiempo+"\n";
    }
}
