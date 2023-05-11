/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ADMIN
 */
class Clase {
    private int id;
    private String nombre;
    private double latitud;
    private double longitud;
    private int municipio;
    private int listado;
    private int votantes;

    public Clase() {
    }

    public Clase(int id, String nombre, double latitud, double longitud, int municipio, int listado, int votantes) {
        this.id = id;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.municipio = municipio;
        this.listado = listado;
        this.votantes = votantes;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public int getMunicipio() {
        return municipio;
    }

    public int getListado() {
        return listado;
    }

    public int getVotantes() {
        return votantes;
    }

    @Override
    public String toString() {
        return "Clase{" + "id=" + id + ", nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + ", municipio=" + municipio + ", listado=" + listado + ", votantes=" + votantes + '}';
    }
    
    
}