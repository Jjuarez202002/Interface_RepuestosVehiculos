package com.mycompany.interface_repuestosvehiculos;


public class Vehiculo {
     private String modelo;
    private String placa;
    private int anioFabricacion;

    public Vehiculo(String modelo, String placa, int anioFabricacion) {
        this.modelo = modelo;
        this.placa = placa;
        this.anioFabricacion = anioFabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
@Override
    public String toString(){
        return "Vehiculo[Modelo: " + modelo + " Placa=" + placa + " Año de Fabricacion =" + anioFabricacion + "]"; 
     }
}
