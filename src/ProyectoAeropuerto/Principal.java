
package ProyectoAeropuerto;

import java.util.Scanner;

public class Principal {
    static Scanner sc=new Scanner(System.in);
    final static int num=2;//numero de aeropuertos
    static Aeropuerto aeropuerto[]=new Aeropuerto[num];
    
    public static void main(String args []){
        //insertar datos de los aeropuertos
        insertarAeropuertos(aeropuerto);
        menu();
    }
   
    public static void insertarAeropuertos(Aeropuerto [] aero){
        aero[0]= new AeropuertoPublico(8000000,"jorge chavez","lima","peru");
        aero[0].insertarCompania(new Compania("AeroPeru"));
        aero[0].insertarCompania(new Compania ("Latam"));
        aero[0].getCompania("AeroPeru").insertarVuelo(new Vuelo("IB20","Lima","Mexico",150.90,150));
        aero[0].getCompania("AeroPeru").insertarVuelo(new Vuelo("IB21","lima","buenos aires",200.50,140));
        aero[0].getCompania("Latam").insertarVuelo(new Vuelo("FC12","lima","londres",800.78,250));
        aero[0].getCompania("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero ("VICTOR PARRALES","0993276654","Ecuatoriano"));
        aero[0].getCompania("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("ANAHI SALABARRIA","DHES334ND","Israel"));
        aero[0].getCompania("Latam").getVuelo("FC12").insertarPasajero(new Pasajero("MARIA ALVARES","99988844DF","Peruana"));
        aero[0].getCompania("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero ("JONATHAN SALABARRIA","09854GTF","Ecuatoriano"));
        
        
        aero[1]= new AeropuertoPrivado("Aeropuerto GY","GUAYAQUIL","ECUADOR");
        String Empresa[]={"GYGANET","TELCONET","ORG.WORLD"};
        ((AeropuertoPrivado)aero[1]).insertarEmpresas(Empresa);
        aero[1].insertarCompania(new Compania ("LatamECU"));
        aero[1].insertarCompania(new Compania ("AirQuito"));
        aero[1].getCompania("LatamECU").insertarVuelo(new Vuelo ("ECU01","Guayaqui","NY",400.10,300));
        aero[1].getCompania("AirQuito").insertarVuelo(new Vuelo("EQUI01","QUITO","GUAYAQUIL",60.90,160));
        aero[1].getCompania("LatamECU").getVuelo("ECU01").insertarPasajero(new Pasajero ("CAMILO PARRALES","098FRT","MANABA"));
        aero[1].getCompania("LatamECU").getVuelo("ECU01").insertarPasajero(new Pasajero ("WILLTON PARRALES","098FRR","MANABA"));
        aero[1].getCompania("AirQuito").getVuelo("EQUI01").insertarPasajero(new Pasajero ("SEBASTIAN PARRALES","098FQQ","MANABA"));
        aero[1].getCompania("AirQuito").getVuelo("EQUI01").insertarPasajero(new Pasajero ("ENRIQUE PARRALES","098FRM","MANABA"));
    }
    
    public static void menu(){
        String nombreAero,nombreCompa,nombreVuelo,origen,destino;
        Aeropuerto aero;
        Compania compania;
        boolean op=true;
        do {
            System.out.print("\t.:MENU:.\n"
                    + "1. Ver Aeropuertos gestionados (Publico o privados) \n"
                    + "2. Ver empresas(Privadas) o subvencion(Publico)\n"
                    + "3. Lista de compañias de un Aeropuerto\n"
                    + "4. Lista de vuelos por Compañias\n"
                    + "5. Lista posibles vuelos  de Origen a Destino\n"
                    + "6. Salir\n"
                    + "Opcion: ");
            int v=sc.nextInt();
            switch (v) {
                case 1:
                    mostrarAeropuertos();
                    break;
                case 2:
                    mostrarEmpresasSubvencion();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Lista de compañias-Aeropuerto\nDigite el nombre del aeropuerto: ");
                    nombreAero=sc.nextLine();
                    aero=buscarAeropuerto(nombreAero);
                    if(aero==null){
                        System.out.println("No existe tal Aeropuerto");
                    }else{
                        buscarCompania(aero);
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Digite el aeropuerto");
                    nombreAero=sc.nextLine();
                    aero=buscarAeropuerto(nombreAero);
                    if (aero==null) {
                        System.out.println("No existe tal Aeropuerto");
                    }else{
                        System.out.print("Digite la Compañia: ");
                        nombreCompa=sc.nextLine();
                        compania=aero.getCompania(nombreCompa);
                        mostrarVuelos(compania);
                    }
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("Digite la ciudad origen:");
                    origen=sc.nextLine();
                    System.out.print("Digite la ciudad destino:");
                    destino=sc.nextLine();
                    mostrarOrigenDestino(origen, destino);
                    break;
                case 6:
                    op=false;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (op);
        
    }
    
    public static void mostrarAeropuertos(){
        for (int i = 0; i < aeropuerto.length; i++) {
            if (aeropuerto[i] instanceof AeropuertoPublico) {
                System.out.println("AEROPUERTO PUBLICO");
                System.out.println("Nombre : "+aeropuerto[i].getNombre()+" Ciudad : "+aeropuerto[i].getCiudad()+" Pais : "+aeropuerto[i].getPais()+"\n");
            }else{
                System.out.println("AEROPUERTO PRIVADO");
                System.out.println("Nombre : "+aeropuerto[i].getNombre()+" Ciudad : "+aeropuerto[i].getCiudad()+" Pais : "+aeropuerto[i].getPais()+"\n");
            }
        }
    }
    
    public static void mostrarEmpresasSubvencion(){
        String empresas[];
        for (int i = 0; i < aeropuerto.length; i++) {
            if(aeropuerto[i] instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto Privado "+aeropuerto[i].getNombre());
                empresas=((AeropuertoPrivado)aeropuerto[i]).getEmpresas();
                System.out.println("Empresas :");
                for (int j = 0; j < empresas.length; j++) {
                    System.out.println(empresas[j]);
                }
            }else{
                System.out.println("Aeropuerto Publico : "+aeropuerto[i].getNombre());
                System.out.println("Subvencion :"+((AeropuertoPublico)aeropuerto[i]).getSubvencion());
            }
        }
    }
    
    public static Aeropuerto buscarAeropuerto(String nom){
        boolean op = false;
        int i=0;
        Aeropuerto aero=null;
        while((!op)&&(i<aeropuerto.length)){
            if(nom.equals(aeropuerto[i].getNombre())){
                op=true;
                aero=aeropuerto[i];
            }
            i++;
        }
        return aero;
    }
    
    public static void buscarCompania(Aeropuerto ae){
        System.out.println("Lista de Compañias");
        for (int i = 0; i <ae.getNumCompania(); i++) {
            System.out.println(ae.getCompania(i).getNombre());
        }
    }
    
    public static void mostrarVuelos(Compania compa){
        Vuelo vuelo;
        for (int i = 0; i < compa.getNumVuelos(); i++) {
            vuelo=compa.getVuelo(i);
            System.out.println("IDENTIFICADOR: "+vuelo.getIdentificador()+"\n"+
                    "CIUDAD ORIGEN: "+vuelo.getCiudadOrigen()+"\n"+
                    "CIUDAD DESTINO: "+vuelo.getCiudadDestino()+"\n\n");
        }
    }
    
    public static Vuelo[] buscarVueloOrigenDestino(String origen, String destino){
        int contador=0;
        Vuelo vuelo;
        for (int i = 0; i < aeropuerto.length; i++) {//recorrer vuelos
            for (int j = 0; j < aeropuerto[i].getNumCompania(); j++) {//recorrer las compañias
                for (int k = 0; k < aeropuerto[i].getCompania(j).getNumVuelos(); k++) {//recorrer vuelos
                    vuelo=aeropuerto[i].getCompania(j).getVuelo(k);
                    if ((origen.equals(vuelo.getCiudadOrigen())&&destino.equals(vuelo.getCiudadDestino()))) {
                       contador++; 
                    }
                }
            }
        }
        Vuelo listaVuelos[]=new Vuelo[contador];
        int contador2=0;
        for (int i = 0; i < aeropuerto.length; i++) {
            for (int j = 0; j < aeropuerto[i].getNumCompania(); j++) {
                for (int k = 0; k < aeropuerto[i].getCompania(j).getNumVuelos(); k++) {
                    vuelo=aeropuerto[i].getCompania(j).getVuelo(k);
                    if((origen.equals(vuelo.getCiudadOrigen())&&(destino.equals(vuelo.getCiudadDestino())))){
                        listaVuelos[contador2]=vuelo;
                        contador2++;
                    }
                }
            }
        }
        return listaVuelos;
    }
    
    public static void mostrarOrigenDestino(String origen, String destino){
        Vuelo vuelos[];
        vuelos=buscarVueloOrigenDestino(origen,destino);
        if(vuelos.length==0){
            System.out.println("No existen vuelos");
        }else {
            System.out.println("\nVuelos encontrados");
            for (int i = 0; i < vuelos.length; i++) {
                System.out.println("IDENTIFICADOR: "+vuelos[i].getIdentificador()+"\n"+
                    "CIUDAD ORIGEN: "+vuelos[i].getCiudadOrigen()+"\n"+
                    "CIUDAD DESTINO: "+vuelos[i].getCiudadDestino()+"\n"+
                    "PRECIO: "+vuelos[i].getPrecio());
            }
        }
    }
}
