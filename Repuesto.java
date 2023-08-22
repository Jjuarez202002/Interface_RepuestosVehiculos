
package com.mycompany.interface_repuestosvehiculos;


public class Repuesto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    private String descripcion;
    private Proveedor proveedor;

    public Repuesto(String codigo, String nombre, double precio, int stock, String descripcion, Proveedor proveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.descripcion = descripcion;
        this.proveedor = proveedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }   
  @Override
    public String toString(){
        return "Repuesto[Codigo: " + codigo + " Nombre=" + nombre + " Precio =" + precio + "Stock= " + stock +"Descripcion = "+ descripcion +"Proveedor ="+ proveedor +"]"; 
     }
   }