
package ProyectoAeropuerto;

public class AeropuertoPrivado extends Aeropuerto{
    private String Empresas[] =new String[10] ;
    private int numEmpresas;

    public AeropuertoPrivado(String n, String c, String p) {
        super(n, c, p);
    }

    public AeropuertoPrivado(String n, String c, String p, Compania[] com,String [] empresas) {
        super(n, c, p, com);
        this.Empresas=empresas;
        this.numEmpresas=empresas.length;
    }

    public void insertarEmpresas(String e[]){
        this.Empresas=e;
        this.numEmpresas=e.length;
    }
    
    public void insertarEmpresa(String e){
        this.Empresas[numEmpresas]=e;
        numEmpresas++;
    }

    public String[] getEmpresas() {
        return Empresas;
    }

    public int getNumEmpresas() {
        return numEmpresas;
    }
    
    
}
