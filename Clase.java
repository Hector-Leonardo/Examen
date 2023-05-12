
package secciondistrito;
import Models.Seccion;
import java.util.ArrayList;
import java.util.Scanner;
public class SeccionDistritos {
    static Scanner entradaDato= new Scanner (System.in);
    static ArrayList<Seccion> secciones= new ArrayList<>();
            
public static void llenarValores() {
        System.out.println("Listado total:");
        int Listado = entradaDato.nextInt();
        System.out.println("Votantes totales");
        int Votantes = entradaDato.nextInt();
        secciones.add(new Seccion(Listado,Votantes));
        porcentajeParticipacion();
    }

public static void porcentajeParticipacion(){
    int Votantes = secciones.get(0).getVotantes();
    int Listado = secciones.get(0). getListado();
    double operacion = ((double) Votantes / Listado)*100;
    
    System.out.println("Porcentaje de participacion: " + operacion);
    porcentajeAbstinencia(Votantes, Listado);
    }
public static void porcentajeAbstinencia(int votantes, int listados){
        int resto = listados-votantes;
        double operacion = ((double) resto / listados) * 100;
        System.out.println("Porcentaje de abstinencia: " + operacion);
        faltantes(votantes, listados);
    }
public static void faltantes(int votantes, int listados) {
        int operacion = (listados-votantes);
        System.out.println("Faltantes: " + operacion);
    }
public static void main(String[] args) {
        llenarValores();
    }
}

package Models;
public class Seccion {
    private int listado;
    private int votantes;

    public Seccion() {
    }

    public Seccion(int listado, int votantes) {
        this.listado = listado;
        this.votantes = votantes;
    }

    public int getListado() {
        return listado;
    }

    public void setListado(int listado) {
        this.listado = listado;
    }

    public int getVotantes() {
        return votantes;
    }

    public void setVotantes(int votantes) {
        this.votantes = votantes;
    }

    @Override
    public String toString() {
        return "Seccion{" + "listado=" + listado + ", votantes=" + votantes + '}';
    }

    }
