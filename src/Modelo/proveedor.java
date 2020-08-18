/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Rosa Ayala
 */
public class proveedor {
    private int idproveedor;
    private String nombre;
    private String ruc;
    private String direccion;
    private String estado;

    public proveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public proveedor(String nombre, String ruc, String direccion, String estado) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.estado = estado;
    }

    public proveedor(int idproveedor, String nombre, String ruc, String direccion, String estado) {
        this.idproveedor = idproveedor;
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.estado = estado;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
