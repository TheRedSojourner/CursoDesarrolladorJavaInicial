package org.example;


import java.io.Serializable;

class Producto implements Serializable {
    //private static final long serialVersionUID = -6470090944414208496L;

    public Producto() {}

    public Producto(String nombre, int stock, float precio)
    {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    private String nombre;
    private int stock;
    private float precio;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}